package tp3;

import tp3.utilsTP3.MatrixVectorOperation;
import tp3.utilsTP3.Vector;

import java.util.List;

public class Guide7Solution implements Guide7 {

    @Override
    public int[][] exercise_1_j(int[][] A, int c) {
        int[][] B = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = A[i][j] * c;
            }
        }
        return B;
    }

    @Override
    public boolean exercise_2_a(int[][] A) {
        boolean isSymetric = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != A[j][i])
                    isSymetric = false;
            }
        }
        return isSymetric;
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        boolean isDominant = true;
        for (int i = 0; i < A.length; i++) {
            int fileSum = 0;
            for (int j = 0; j < A[i].length; j++) {
                if (i != j) {
                    fileSum = fileSum + Math.abs(A[i][j]);
                }
            }
            if (Math.abs(A[i][i]) <= fileSum)
                isDominant = false;
        }
        return isDominant;
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        int[] result = new int[op.getMatrixRows()];
        for (int i = 0; i < op.getMatrixRows(); i++) {
            for (int j = 0; j < op.getMatrixColumns(); j++) {
                if (i >= j - 1) {
                    result[i] = op.multiplyPositions(i, j, j);
                }
            }
        }
        Vector vResult = new Vector(result);
        op.setResult(vResult);
        return op;
    }

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        throw new UnsupportedOperationException("TODO");
    }
}
