package utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Guide7Helpers {
    public static double[] matrix_times_vector(double[][] matrix, double[] vector) {
        return Arrays.stream(matrix)
                .mapToDouble(row ->
                        IntStream.range(0, row.length)
                                .mapToDouble(col -> row[col] * vector[col])
                                .sum()
                ).toArray();
    }

    public static double[][] matrix_by_matrix(double[][] m1, double[][] m2) {
        return Arrays.stream(m1).map(r ->
                IntStream.range(0, m2[0].length).mapToDouble(i ->
                        IntStream.range(0, m2.length).mapToDouble(j -> r[j] * m2[j][i]).sum()
                ).toArray()).toArray(double[][]::new);

    }

    public static double[][] identity(int n) {
        double[][] identity = new double[n][n];
        for (int i = 0; i < n; i++) {
            identity[i][i] = 1;
        }
        return identity;
    }
}
