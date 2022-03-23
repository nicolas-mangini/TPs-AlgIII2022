package guia1;

public class Ejercicio2_c {
        public static int ejercicio2_c(int n){
        if (n==0){
            return n;
        }
        if (n==1){
            return n;
        }
        int firsterm=1;
        int secondterm=1;
        for (int i = 2; i < n; i++) {
            int total= firsterm;
            firsterm+= secondterm;
            secondterm=total;
        }
        return firsterm;
    }

    public static int ejercicio2_c_r(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return ejercicio2_c(n - 1) + ejercicio2_c(n - 2);}
    }
}
