package guia1;

public class Ejercicio8 {
    public static int ejercicio_8(int poly[],int x){
       int n=poly.length-1;
       int result=poly[poly.length-1];

       for (int i=n-1; i>=0; i--){
           result= result*x + poly[i];
       }
       return result;
    }
    public static int ejercicio_8_r(int poly[], int x){
        int n=poly.length-1;
        int result=poly[poly.length-1];
        return ejercicio_8_r_aux(poly,x,n,result);
    }
    public static int ejercicio_8_r_aux(int poly[],int x, int n, int result){
        if(n==0){
            return result;
        }
        else{
            n= n-1;
            result= result*x + poly[n];
            return ejercicio_8_r_aux(poly,x,n,result);
        }
    }    

}
    
