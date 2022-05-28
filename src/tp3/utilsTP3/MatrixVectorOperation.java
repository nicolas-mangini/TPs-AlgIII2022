package tp3.utilsTP3;

public class MatrixVectorOperation {
    private final Matrix matrix;
    private final Vector vector;
    private Vector result;

    public MatrixVectorOperation(Matrix matrix, Vector vector) {
        this.matrix = matrix;
        this.vector = vector;
    }

    public Vector getResult() {
        return result;
    }

    public void setResult(Vector result) {
        this.result = result;
    }

    public int getCounter() {
        return matrix.getCounter() + vector.getCounter();
    }

    public int getCounter(int operandNumber) {
        switch (operandNumber) {
            case 1:
                return matrix.getCounter();
            case 2:
                return vector.getCounter();
            default:
                return 0;
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String matrix = this.matrix != null ? this.matrix.toString() : "";
        String vector = this.vector != null ? this.vector.toString() : "";
        String result = this.result != null ? this.result.toString() : "";

        return "Matrix:" + "\n" +
                matrix + "\n" +
                "Vector:" + "\n" +
                vector + "\n" +
                "Result:" + "\n" +
                result + "\n";
    }

    public int multiplyPositions(int i1, int j1, int i2) {
        return matrix.getValue(i1, j1) * vector.getValue(i2);
    }

    public int getMatrixRows() {
        return matrix.getRows();
    }

    public int getMatrixColumns() {
        return matrix.getColumns();
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public Vector getVector() {
        return vector;
    }

}
