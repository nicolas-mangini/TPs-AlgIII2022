package guia1;

public class Ejercicio4 {
    public static boolean excercise_4(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array[array.length - 1]]){
                return false;
            }
        }
        return true;
    }
}
