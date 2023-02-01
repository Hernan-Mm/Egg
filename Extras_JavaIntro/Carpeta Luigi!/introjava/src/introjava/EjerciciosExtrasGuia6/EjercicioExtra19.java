/*
    Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
    comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
    elementos).
 */
package introjava.EjerciciosExtrasGuia6;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector1 = {1,2,3,4,5};
        int [] vector2 = {1,2,3,4,5};
        
        
        
        if(comprabarIguales(vector1, vector2)){
            System.out.println("los vectores son iguales");
        }else{
            System.out.println("los vectores son diferentes");
        }
        // TODO code application logic here
    }
    public static boolean comprabarIguales(int [] vector1,int [] vector2){
        boolean vectoresIguales=true;
        int contador=0;
        
        if(vector1.length!=vector2.length){
            System.out.println("los vectores son diferentes");
        }else{

            do {
                vectoresIguales = vector1[contador]==vector2[contador];
                contador++;
            } while(vectoresIguales==true && contador<vector1.length);
               
        }
        return vectoresIguales;
    }
    
}
