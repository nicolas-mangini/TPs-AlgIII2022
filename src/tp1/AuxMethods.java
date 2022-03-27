package tp1;

public class AuxMethods {
    public static boolean isPrime(int n) {
        if (n == 1) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int reverseIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[reverseIndex] = array[i];
            reverseIndex++;
        }
        return reverse;
    }

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