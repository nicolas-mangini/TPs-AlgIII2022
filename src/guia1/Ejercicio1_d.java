package guia1;

public class Ejercicio1_d {
    //a)
    public static int exercise_1_d(int n) {
        int a = 1;
        for (int i = 0; i <= (2 * n - 1); i++) {
            a = (i + 2) + a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("1 + 3 + 5 +...+ 2n-1");
        System.out.println(exercise_1_d(5));
    }
}