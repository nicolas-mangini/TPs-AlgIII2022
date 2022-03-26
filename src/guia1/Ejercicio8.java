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

}
    
