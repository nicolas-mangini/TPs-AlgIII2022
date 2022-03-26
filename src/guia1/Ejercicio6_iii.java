package guia1;

public class Ejercicio6_iii {

    //Iterative
    public static int exercise_6(int n) {
        int primeFactors = 0;
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                if (isPrime(i)) {
                    primeFactors++;
                    n = n / i;
                }
            }
        }
        return primeFactors;
    }

    //Recursive
    public static int exercise_6_r(int n) {
        int index = 2;
        int counter = 0;
        return exercise_6_r_aux(n, index, counter);
    }

    public static int exercise_6_r_aux(int n, int index, int counter) {
        if (isPrime(n)) {
            counter++;
            return counter;
        } else if (index == n) {
            return counter;
        } else if (isPrime(index)) {
            if (n % index == 0) {
                counter++;
                return exercise_6_r_aux(n / index, index, counter);
            } else {
                index++;
                return exercise_6_r_aux(n, index, counter);
            }
        } else {
            index++;
            return exercise_6_r_aux(n, index, counter);
        }
    }

    //aux
    public static boolean isPrime(int n) {
        if (n == 1) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Metodo Iterativo");
        System.out.println("Metodo Recursivo");
    }
}