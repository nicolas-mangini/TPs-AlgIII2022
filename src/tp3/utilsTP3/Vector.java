package tp3.utilsTP3;

import java.util.Arrays;

public class Vector {
    private final int[] vector;
    private int counter;

    public Vector(int[] vector) {
        this.vector = vector;
    }

    public int getValue(int i) {
        counter += 1;
        return vector[i];
    }

    public int getCounter() {
        return counter;
    }

    public int getVectorSize() {
        return vector.length;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        int vectorSize = this.getVectorSize();
        int bracesCount = vectorSize * 2;
        StringBuilder builder = new StringBuilder(vectorSize + bracesCount);

        for (int element : vector) {
            builder.append("(")
                    .append("\t")
                    .append(element)
                    .append("\t")
                    .append(")")
                    .append("\n");
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vector)) {
            return false;
        }

        return Arrays.equals(vector, ((Vector) obj).vector);
    }
}
