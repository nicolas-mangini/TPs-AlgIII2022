package guia1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio6_iii {

    //Iterative
    public static int exercise_6_b_iii(int n) {
        int primeFactors = 0;
        for (int i = 2; i <= n; i++) {
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
    public static int exercise_6_b_iii_r(int n) {
        int index = 2;
        int primeFactors = 0;
        return exercise_6_b_iii_r_aux(n, index, primeFactors);
    }

    public static int exercise_6_b_iii_r_aux(int n, int index, int counter) {
        if (isPrime(n)) {
            counter++;
            return counter;
        } else if (index == n) {
            return counter;
        } else if (isPrime(index)) {
            if (n % index == 0) {
                counter++;
                return exercise_6_b_iii_r_aux(n / index, index, counter);
            } else {
                index++;
                return exercise_6_b_iii_r_aux(n, index, counter);
            }
        } else {
            index++;
            return exercise_6_b_iii_r_aux(n, index, counter);
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

    @Test
    public void testIterative() {
        assertEquals(1, exercise_6_b_iii(2));
        assertEquals(1, exercise_6_b_iii(3));
        assertEquals(2, exercise_6_b_iii(4));
        assertEquals(1, exercise_6_b_iii(5));
        assertEquals(1, exercise_6_b_iii(7));
        assertEquals(2, exercise_6_b_iii(6));
        assertEquals(3, exercise_6_b_iii(8));
        assertEquals(2, exercise_6_b_iii(9));
        assertEquals(2, exercise_6_b_iii(10));
        assertEquals(4, exercise_6_b_iii(16));
        assertEquals(3, exercise_6_b_iii(30));
        assertEquals(3, exercise_6_b_iii(66));
        assertEquals(4, exercise_6_b_iii(315));
    }

    @Test
    public void testRecursive() {
        assertEquals(1, exercise_6_b_iii_r(2));
        assertEquals(1, exercise_6_b_iii_r(3));
        assertEquals(2, exercise_6_b_iii_r(4));
        assertEquals(1, exercise_6_b_iii_r(5));
        assertEquals(1, exercise_6_b_iii_r(7));
        assertEquals(2, exercise_6_b_iii_r(6));
        assertEquals(3, exercise_6_b_iii_r(8));
        assertEquals(2, exercise_6_b_iii_r(9));
        assertEquals(2, exercise_6_b_iii_r(10));
        assertEquals(4, exercise_6_b_iii_r(16));
        assertEquals(3, exercise_6_b_iii_r(30));
        assertEquals(3, exercise_6_b_iii_r(66));
        assertEquals(4, exercise_6_b_iii_r(315));
    }
}