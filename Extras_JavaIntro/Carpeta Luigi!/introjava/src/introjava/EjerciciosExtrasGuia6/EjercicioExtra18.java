/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
    N, con los valores ingresados por el usuario.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int dimensionVector = leer.nextInt();
        int [] vector = new int [dimensionVector];
        ingresarValores(vector, dimensionVector);
        sumaVector(vector);
        
    }
    
    public static void ingresarValores(int [] vector, int dimensionVector){
        for (int i = 0; i < dimensionVector; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("ingresa un valor para la posicion "+ i );
            vector[i]= leer.nextInt();
            
        }
    }
    
    
    public static void sumaVector(int [] vector){
        int suma = 0;
        for(int elemento:vector){
            suma+=elemento;
        }
        System.out.println("la suma de los valores del vector es "+suma);
    }
}
