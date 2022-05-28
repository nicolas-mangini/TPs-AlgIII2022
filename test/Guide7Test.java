import org.junit.Test;
import tp3.Guide7;
import tp3.Guide7Solution;
import tp3.utilsTP3.Matrix;
import tp3.utilsTP3.MatrixVectorOperation;
import tp3.utilsTP3.Vector;
import utils.Guide6Helpers;
import utils.SkipRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Guide7Test extends SkipRule {
    Guide7 guide7 = new Guide7Solution();

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new int[][]{{-3, -6, -9, -12}, {-15, -18, -21, -24}, {-27, -30, -33, -36}, {-39, -42, -45, -48}}, guide7.exercise_1_j(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, -3));
        assertArrayEquals(new int[][]{{-10, 10, 5}, {5, 15, 10}, {5, -10, 0}}, guide7.exercise_1_j(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}, 5));
    }

    @Test
    public void exercise_2_a() {
        assertTrue(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 1}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
    }

    @Test
    public void exercise_2_b() {
        assertTrue(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 4}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 3}}));
    }

    @Test
    public void exercise_3_b_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {1, 1, 1}}), new Vector(new int[]{2, 3, 4}));
        assertEquals(new Vector(new int[]{5, 9, 9}), guide7.exercise_3_b_i(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {1, 1, 1, 1}, {1, 1, 1, 1}}), new Vector(new int[]{1, 2, 3, 4}));
        assertEquals(new Vector(new int[]{3, 6, 10, 10}), guide7.exercise_3_b_i(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_4() {
        ArrayList<double[]> vectors1 = new ArrayList<>(Arrays.asList(new double[]{2, 2, 0}, new double[]{1, 1, 1}));
        List<double[]> result1 = guide7.exercise_4(vectors1);
        orthogonal_test(result1);

        ArrayList<double[]> vectors2 = new ArrayList<>(Arrays.asList(new double[]{0, 0, 1, 1}, new double[]{0, 1, 1, 0}, new double[]{1, 1, 0, 0}));
        List<double[]> result2 = guide7.exercise_4(vectors2);
        orthogonal_test(result2);

        ArrayList<double[]> vectors3 = new ArrayList<>(Arrays.asList(new double[]{1, 3}, new double[]{-1, 2}));
        List<double[]> result3 = guide7.exercise_4(vectors3);
        orthogonal_test(result3);
    }

    private void orthogonal_test(List<double[]> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                double actual = Guide6Helpers.dotProduct(result.get(i), result.get(j));
                assertEquals(0.0, actual, 0.1);
            }
        }
    }

}
