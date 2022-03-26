package guia1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio8 {

    /*La regla de Horner permite evaluar cualquier polinomio de grado n, realizando una cantidad significativamente menor de
      adiciones y multiplicaciones que la forma tradicional.
      La forma tradicional requiere n adiciones para un polinomio de grado n, y (n(n-1))/2 multiplicaciones
      asi para un polinomio de grado 4: addiciones=4, multiplicaciones=6.
      
      Con la regla de horner este numero es menor, haciendose más clara la diferencia cuanto mayor sea el grado.
      para el mismo polinomio de grado 4: addiciones=4, multiplicaciones=4.
      Por ende la regla de horner es el método más óptimo para evaluar  polinomios.  
     */
    
    public static int exercise_8(int[] coefs, int n) {
        int result = coefs[coefs.length - 1];
        for (int i = (coefs.length - 1) - 1; i >= 0; i--) {
            result = result * n + coefs[i];
        }
        return result;
    }

    public static int exercise_8_r(int[] coefs, int n) {
        int result = coefs[coefs.length - 1];
        return exercise_8_r_aux(coefs, n, coefs.length - 1, result);
    }

    public static int exercise_8_r_aux(int[] coefs, int n, int index, int result) {
        if (index == 0) {
            return result;
        } else {
            index = index - 1;
            result = result * n + coefs[index];
            return exercise_8_r_aux(coefs, n, index, result);
        }
    }

    @Test
    public void testIterative() {
        assertEquals(340, exercise_8(new int[]{1, 8, 5, 10}, 3));
        assertEquals(117, exercise_8(new int[]{1, 8, 5, 10}, 2));
        assertEquals(24, exercise_8(new int[]{1, 8, 5, 10}, 1));
        assertEquals(1, exercise_8(new int[]{1, 8, 5, 10}, 0));
    }

    @Test
    public void testRecursive() {
        assertEquals(340, exercise_8_r(new int[]{1, 8, 5, 10}, 3));
        assertEquals(117, exercise_8_r(new int[]{1, 8, 5, 10}, 2));
        assertEquals(24, exercise_8_r(new int[]{1, 8, 5, 10}, 1));
        assertEquals(1, exercise_8_r(new int[]{1, 8, 5, 10}, 0));
    }
}
