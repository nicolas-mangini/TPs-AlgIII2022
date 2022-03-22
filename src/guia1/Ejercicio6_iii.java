package guia1;

import java.util.ArrayList;

public class Ejercicio6_iii {

    //Iterative
    public static int primeFactorArray(int number) {
        int primeFactors = 0;
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                if (isPrime(i)) {
                    primeFactors++;
                    number = number / i;
                }
            }
        }
        return primeFactors;
    }

    public static ArrayList<Integer> primeFactorArraylist(int number) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                primes.add(i);
                number = number / i;
            }
        }
        return primes;
    }

    //Recursive
    public static int primeFactorArrayRecursive(int number) {
        return primeFactorRecursiveAux(number, 2, 0);
    }

    public static int primeFactorRecursiveAux(int number, int index, int primeFactors) {
        if (index <= number) {
            if (number % index == 0) {
                if (isPrime(index)) {
                    primeFactors++;
                }
                number = number / index;
                primeFactorRecursiveAux(number, index, primeFactors);
            }
            index++;
            primeFactorRecursiveAux(number, index, primeFactors);
        }
        return primeFactors;
    }


    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Metodo Iterativo");
        System.out.println("Con arraylist");
        System.out.println(primeFactorArraylist(147));
        System.out.println(primeFactorArraylist(36));
        System.out.println("Con arrays");
        System.out.println(primeFactorArray(147));
        System.out.println(primeFactorArray(36));
        System.out.println("Metodo Recursivo");
        System.out.println(primeFactorArrayRecursive(147));
        System.out.println(primeFactorArrayRecursive(36));
    }
}