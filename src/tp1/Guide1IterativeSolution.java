package tp1;

import java.util.Arrays;

public class Guide1IterativeSolution implements Guide1 {
    @Override
    public int exercise_1_d(int n) {
        int index = 1;
        int sum = 0;
        while (index <= 2 * n - 1) {
            sum = sum + index;
            index = index + 2;
        }
        return sum;
    }

    @Override
    public int exercise_2_c(int n) {
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

    @Override
    public boolean exercise_4(int[] array) {
        return Arrays.equals(array, AuxMethods.reverseArray(array));
    }

    @Override
    public int exercise_6_b_iii(int n) {
        int primeFactors = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (AuxMethods.isPrime(i)) {
                    primeFactors++;
                    n = n / i;
                }
            }
        }
        return primeFactors;
    }

    @Override
        /*La regla de Horner permite evaluar cualquier polinomio de grado n, realizando una cantidad significativamente menor de
      adiciones y multiplicaciones que la forma tradicional.
      La forma tradicional requiere n adiciones para un polinomio de grado n, y (n(n-1))/2 multiplicaciones
      asi para un polinomio de grado 4: addiciones=4, multiplicaciones=6.

      Con la regla de horner este numero es menor, haciendose más clara la diferencia cuanto mayor sea el grado.
      para el mismo polinomio de grado 4: addiciones=4, multiplicaciones=4.
      Por ende la regla de horner es el método más óptimo para evaluar  polinomios.
     */
    public int exercise_8(int[] coefs, int n) {
        int result = coefs[coefs.length - 1];
        for (int i = (coefs.length - 1) - 1; i >= 0; i--) {
            result = result * n + coefs[i];
        }
        return result;
    }
}