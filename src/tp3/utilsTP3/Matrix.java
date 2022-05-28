package tp3.utilsTP3;

import java.util.Arrays;

public class Matrix {
    private final int[][] matrix;
    private int counter;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getValue(int i, int j) {
        counter += 1;
        return matrix[i][j];
    }

    public int getCounter() {
        return counter;
    }

    public int getRows() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        int matrixSize = this.getRows() * this.getColumns();
        int bracesCount = this.getRows() * 2;
        StringBuilder builder = new StringBuilder(matrixSize + bracesCount);

        for (int[] row : matrix) {
            builder.append("(").append("\t");
            for (int element : row) {
                builder.append(element).append("\t");
            }
            builder.append(")").append("\n");
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix)) {
            return false;
        }

        return Arrays.deepEquals(matrix, ((Matrix) obj).matrix);
    }
}
