package guia1;

import java.util.Arrays;

public class Ejercicio4 {
    public static boolean exercise_4(int[] array) {
        return Arrays.equals(array, reverseArray(array));
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

    public static boolean exercise_4_r(int[] array) {
        int[] reversedArray = new int[array.length];
        return Arrays.equals(array, reverseArray_r(array, reversedArray, array.length - 1, 0));
    }

    private static int[] reverseArray_r(int[] array, int[] reversedArray, int index, int reverseIndex) {
        if (index >= 0) {
            reversedArray[reverseIndex] = array[index];
            reverseIndex++;
            index--;
            reverseArray_r(array, reversedArray, index, reverseIndex);
        }
        return reversedArray;
    }


    public static void main(String[] args) {
        System.out.println(exercise_4(new int[]{1, 2, 3}));
        System.out.println(exercise_4(new int[]{1, 2, 3, 4, 3, 1, 2}));
        System.out.println(exercise_4(new int[]{1, 2, 2, 1, 1}));
        System.out.println(exercise_4(new int[]{8, 9, 8}));
        System.out.println(exercise_4(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        System.out.println(exercise_4(new int[]{1, 1, 1, 1, 1}));
        System.out.println("\nRecursive");
        System.out.println(exercise_4_r(new int[]{1, 2, 3}));
        System.out.println(exercise_4_r(new int[]{1, 2, 3, 4, 3, 1, 2}));
        System.out.println(exercise_4_r(new int[]{1, 2, 2, 1, 1}));
        System.out.println(exercise_4_r(new int[]{8, 9, 8}));
        System.out.println(exercise_4_r(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        System.out.println(exercise_4_r(new int[]{1, 1, 1, 1, 1}));

    }
}
