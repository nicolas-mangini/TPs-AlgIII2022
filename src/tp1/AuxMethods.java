package tp1;

public class AuxMethods {
    //Clase auxiliar que contiene metodos utilizados para la resolucion de los ejercicios de la guia

    //metodo que devuelve si un numero es primo
    public static boolean isPrime(int n) {
        if (n == 1) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //metodo que da vuelta un array de forma iterativa
    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int reverseIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[reverseIndex] = array[i];
            reverseIndex++;
        }
        return reverse;
    }

    //metodo que da vuelta un array de forma recursiva
    public static int[] reverseArray_r(int[] array, int[] reversedArray, int index, int reverseIndex) {
        if (index >= 0) {
            reversedArray[reverseIndex] = array[index];
            reverseIndex++;
            index--;
            reverseArray_r(array, reversedArray, index, reverseIndex);
        }
        return reversedArray;
    }
}