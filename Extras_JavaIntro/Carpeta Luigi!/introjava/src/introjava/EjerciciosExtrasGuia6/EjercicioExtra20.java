/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
 parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package introjava.EjerciciosExtrasGuia6;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int [10];
        llenarVector(vector);
        imprimirVector(vector);
        // TODO code application logic here
    }
    public static void llenarVector(int[]vector){  
        for (int i = 0; i < vector.length ; i++) {
            vector[i]= (int) (Math.random() * 10);    
        }
    }
    public static void imprimirVector(int[]vector){ 
        String impresion="";
        for (int i = 0; i < vector.length ; i++) {
            impresion += vector[i]+" ";    
        }
        System.out.println(impresion);
    }
}
