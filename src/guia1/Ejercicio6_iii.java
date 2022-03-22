package guia1;

import java.util.ArrayList;

public class Ejercicio6_iii {

    //Iterative
    public static ArrayList<Integer> primeFactorArraylist(int number) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                primos.add(i);
                number = number / i;
            }
        }
        return primos;
    }

    public static int primeFactorArray(int number) {
        int primeFactors = 0;
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                primeFactors++;
                number = number / i;
            }
        }
        return primeFactors;
    }

    //recursive
    public static int primeFactorArrayRecursive(int number) {
        int index = 2;
        int primeFactors = 0;
        return primeFactorRecursiveAux(number, index, primeFactors);
    }

    public static int primeFactorRecursiveAux(int number, int index, int primeFactors) {
        if (index < number) {
            if (number % index == 0) {
                primeFactors++;
                number = number / index;
                primeFactorRecursiveAux(number, index, primeFactors);
            }
        }
        return primeFactors;
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
    }

}

