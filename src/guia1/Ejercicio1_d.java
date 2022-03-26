package guia1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio1_d {

    //Iterative
    public static int exercise_1_d(int n) {
        int index = 1;
        int sum = 0;
        while (index <= 2 * n - 1) {
            sum = sum + index;
            index = index + 2;
        }
        return sum;
    }

    //Recursive
    public static int exercise_1_d_r(int n) {
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

    @Test
    public void testIterative() {
        assertEquals(1, exercise_1_d(1));
        assertEquals(4, exercise_1_d(2));
        assertEquals(9, exercise_1_d(3));
        assertEquals(16, exercise_1_d(4));
        assertEquals(25, exercise_1_d(5));
        assertEquals(36, exercise_1_d(6));
        assertEquals(50625, exercise_1_d(225));
    }

    @Test
    public void testRecursive() {
        assertEquals(1, exercise_1_d_r(1));
        assertEquals(4, exercise_1_d_r(2));
        assertEquals(9, exercise_1_d_r(3));
        assertEquals(16, exercise_1_d_r(4));
        assertEquals(25, exercise_1_d_r(5));
        assertEquals(36, exercise_1_d_r(6));
        assertEquals(50625, exercise_1_d_r(225));
    }
}