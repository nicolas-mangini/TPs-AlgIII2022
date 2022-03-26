package guia1;

public class Ejercicio8 {
   
    /*La regla de Horner permite evaluar cualquier polinomio de grado n, realizando una cantidad significativamente menor de
      adiciones y multiplicaciones que la forma tradicional.
      La forma tradicional requiere n adiciones para un polinomio de grado n, y (n(n-1))/2 multiplicaciones
      asi para un polinomio de grado 4: addiciones=4, multiplicaciones=6.
      
      Con la regla de horner este numero es menor, haciendose más clara la diferencia cuanto mayor sea el grado.
      para el mismo polinomio de grado 4: addiciones=4, multiplicaciones=4.
      Por ende la regla de horner es el método más óptimo para evaluar  polinomios.  
     */
    
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
    
