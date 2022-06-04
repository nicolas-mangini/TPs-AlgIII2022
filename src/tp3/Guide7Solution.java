package tp3;

import tp3.utilsTP3.MatrixVectorOperation;
import tp3.utilsTP3.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
                    result[i] += op.multiplyPositions(i, j, j);
                }
            }
        }
        Vector vResult = new Vector(result);
        op.setResult(vResult);
        return op;
    }

    /*@Override
    public List<double[]> exercise_4(List<double[]> A) {
        if (isOrthogonal(A)) {
            return A;
        } else {
            ArrayList<double[]> AOrthogonal = new ArrayList<>(A.size());
            //1
            AOrthogonal.add(A.get(0));
            //2
            double[] u2 = sustractionVector(A.get(1), scalarProduct(scalarProduct(A.get(1), A.get(0)), A.get(0)));
            AOrthogonal.add(u2);
            //3
            double[] u3 = sustractionVector(sustractionVector(A.get(2), scalarProduct(scalarProduct(A.get(2), A.get(0)), A.get(0))), scalarProduct(scalarProduct(A.get(2), u2), u2));
            AOrthogonal.add(u3);
            return AOrthogonal;
        }
    }
     */


    /*@Override
    public List<double[]> exercise_4(List<double[]> A) {
        ArrayList<double[]> AOrthogonal = new ArrayList<>(A.size());
        if (isOrthogonal(A)) {
            return A;
        } else {
            AOrthogonal.add(A.get(0));
            double[] vector = new double[A.get(1).length];
            for (int i = 1; i < A.size(); i++) {
                for (int j = 0; j < A.size() - 1; j++) {
                    double[] previous = scalarProduct(scalarProduct(A.get(i), AOrthogonal.get(j)), AOrthogonal.get(j));
                    if (i >= 2) {
                        vector = sustractionVector(vector, previous);
                    } else {
                        vector = previous;
                    }
                }
                AOrthogonal.add(sustractionVector(A.get(i), vector));
            }
        }
        return AOrthogonal;
    }*/

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        if (isOrthogonal(A)) {
            return A;
        } else {
            ArrayList<double[]> ortogonal = new ArrayList<>(A.size());
            double[] vector = new double[A.get(1).length];
            ortogonal.add(vectorSobreScalar(normaVector(A.get(0)), A.get(0)));
            for (int i = 1; i < A.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (!Arrays.equals(vector, new double[A.get(1).length])) { //Verifico si el vector guardado no es el nulo (creado al principio)
                        vector = sustractionVector(vector, multiplyScalarVector(dotProduct(A.get(i), ortogonal.get(j)), ortogonal.get(j)));
                    } else {
                        vector = multiplyScalarVector(dotProduct(A.get(i), ortogonal.get(j)), ortogonal.get(j));
                    }
                }
                ortogonal.add(vectorSobreScalar(normaVector(sustractionVector(A.get(i), vector)), sustractionVector(A.get(i), vector)));
                vector = new double[A.get(1).length];
            }
            return ortogonal;
        }
    }

    public static boolean isOrthogonal(List<double[]> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                double actual = dotProduct(result.get(i), result.get(j));
                if (actual != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double dotProduct(double[] vector1, double[] vector2) {
        double result = 0;
        for (int i = 0; i < vector1.length; i++) {
            result += vector1[i] * vector2[i];
        }
        return result;
    }

    public double[] sustractionVector(double[] vector1, double[] vector2) {
        double[] vector3 = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            vector3[i] = vector1[i] - vector2[i];
        }
        return vector3;
    }

    public double[] multiplyScalarVector(double s, double[] vector) {
        double[] vector2 = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vector2[i] = s * vector[i];
        }
        return vector2;
    }

    public double normaVector(double[] vector) {
        double aux = 0.0;
        for (int i = 0; i < vector.length; i++) {
            aux += Math.pow(vector[i], 2);
        }
        return Math.sqrt(aux);
    }

    public double[] vectorSobreScalar(double s, double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] / s;
        }
        return vector;
    }
}