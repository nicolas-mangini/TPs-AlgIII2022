package utils;

import static java.lang.Math.sqrt;

public class Guide6Helpers {

    public static double norm(double[] x) {
        double norm = 0.0;

        for (double n : x) {
            norm += n * n;
        }
        norm = sqrt(norm);

        return norm;
    }

    public static double dotProduct(double[] vector1, double[] vector2) {
        double result = 0;
        for (int i = 0; i < vector1.length; i++) {
            result += vector1[i] * vector2[i];
        }
        return result;
    }


}
