package tp1;

import java.util.Arrays;

public class Guide1RecursiveSolution implements Guide1 {
    @Override
    public int exercise_1_d(int n) {
        int index = 1;
        int sum = 0;
        return exercise_1_d_r_aux(n, index, sum);
    }

    public static int exercise_1_d_r_aux(int n, int index, int sum) {
        if (index <= 2 * n - 1) {
            sum = sum + index;
            index = index + 2;
            return exercise_1_d_r_aux(n, index, sum);

        }
        return sum;
    }

    @Override
    public int exercise_2_c(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return exercise_2_c(n - 1) + exercise_2_c(n - 2);
    }

    @Override
    public boolean exercise_4(int[] array) {
        int[] reversedArray = new int[array.length];
        return Arrays.equals(array, AuxMethods.reverseArray_r(array, reversedArray, array.length - 1, 0));
    }

    @Override
    public int exercise_6_b_iii(int n) {
        int index = 2;
        int primeFactors = 0;
        return exercise_6_b_iii_r_aux(n, index, primeFactors);
    }

    public static int exercise_6_b_iii_r_aux(int n, int index, int counter) {
        if (AuxMethods.isPrime(n)) {
            counter++;
            return counter;
        } else if (index == n) {
            return counter;
        } else if (AuxMethods.isPrime(index)) {
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

    @Override
    public int exercise_8(int[] coefs, int n) {
        int result = coefs[coefs.length - 1];
        return exercise_8_r_aux(coefs, n, coefs.length - 1, result);
    }

    public static int exercise_8_r_aux(int[] coefs, int n, int index, int result) {
        if (index == 0) {
            return result;
        } else {
            index = index - 1;
            result = result * n + coefs[index];
            return exercise_8_r_aux(coefs, n, index, result);
        }
    }
}