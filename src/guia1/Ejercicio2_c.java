package guia1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio2_c {
    //Iterative
    public static int exercise_2_c(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        }
        int firsterm = 1;
        int secondterm = 1;
        for (int i = 2; i < n; i++) {
            int total = firsterm;
            firsterm += secondterm;
            secondterm = total;
        }
        return firsterm;
    }

    //Recursive
    public static int exercise_2_c_r(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return exercise_2_c(n - 1) + exercise_2_c(n - 2);
    }

    @Test
    public void testIterative() {
        assertEquals(0, exercise_2_c(0));
        assertEquals(1, exercise_2_c(1));
        assertEquals(1, exercise_2_c(2));
        assertEquals(2, exercise_2_c(3));
        assertEquals(3, exercise_2_c(4));
        assertEquals(5, exercise_2_c(5));
        assertEquals(8, exercise_2_c(6));
    }

    @Test
    public void testRecursive() {
        assertEquals(0, exercise_2_c_r(0));
        assertEquals(1, exercise_2_c_r(1));
        assertEquals(1, exercise_2_c_r(2));
        assertEquals(2, exercise_2_c_r(3));
        assertEquals(3, exercise_2_c_r(4));
        assertEquals(5, exercise_2_c_r(5));
        assertEquals(8, exercise_2_c_r(6));
    }
}