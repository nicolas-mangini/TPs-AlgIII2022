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
    public static int ejercicio1_d_r(int number){
        int index=1;
        int sum=0;
        return ejercicio1_d_r_aux(number, index, sum);
    }

    public static int ejercicio1_d_r_aux(int number, int index, int sum){
        if (index<=2*number-1){
            sum= sum + index;
            index = index+2;
            return ejercicio1_d_r_aux(number, index, sum);

        }
        return sum;
        }

    public static void main(String[] args) {
        System.out.println("1 + 3 + 5 +...+ 2n-1");
        System.out.println(exercise_1_d(5));
        System.out.println(exercise1_d_r(5));
    }
}
