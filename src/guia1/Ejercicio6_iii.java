package guia1;

import java.util.ArrayList;

public class Ejercicio6_iii {

    //Iterative
    public static int primeFactorArray(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                if (isPrime(i)) {
                    primeFactors.add(i);
                    number = number / i;
                }
            }
        }
        return countNonRepeatedFactors(primeFactors);
    }

    private static int countNonRepeatedFactors(ArrayList<Integer> primeFactors) {
        for (int i = 0; i < primeFactors.size(); i++) {
            //contar la cantidad de numeros no repetidos
        }
        return 0;
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
        return primeFactorRecursiveAux(number, 2, new ArrayList<>());
    }

    public static int primeFactorRecursiveAux(int number, int index, ArrayList<Integer> primeFactors) {
        if (index <= number) {
            if (number % index == 0) {
                if (isPrime(index)) {
                    primeFactors.add(index);
                }
                number = number / index;
                primeFactorRecursiveAux(number, index, primeFactors);
            }
            index++;
            primeFactorRecursiveAux(number, index, primeFactors);
        }
        return countNonRepeatedFactors(primeFactors);
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