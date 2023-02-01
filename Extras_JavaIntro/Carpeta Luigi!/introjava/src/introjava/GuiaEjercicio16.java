/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el tamaño del vector");
        int dimensionVector = leer.nextInt();
        int [] vector = new int [dimensionVector];
        
        llenarVector(dimensionVector, vector);
        
        System.out.println("estos son los valores de tu vector");
        imprimirVector(vector);
        System.out.println("ingresa el numero a buscar");
        int numeroBuscado = leer.nextInt();
        
        buscarEnVector(vector, numeroBuscado);
        
    }
    public static void llenarVector(int dimensionVector, int[]vector){
        for (int i = 0; i < dimensionVector; i++) {
            
           vector[i] = (int)(Math.random()*10);
        }
    }
    
    public static void imprimirVector(int [] vector){
        String aux=" | ";
        for (int elemento: vector) {
            aux += elemento + " | "; 
        }
        System.out.println(aux);
    }
    
    public static void buscarEnVector(int [] vector,int numeroBuscado){
        int contadorNumeroBuscado=0;
        int contadorPosicion=0;
        for (int elemento: vector) {
            contadorPosicion+=1;
            if(numeroBuscado == elemento){
                contadorNumeroBuscado += 1;
                System.out.println("El numero se encuentra en la posicion " + (contadorPosicion-1));
            }
        }
        System.out.println("el numero se repite "+ contadorNumeroBuscado+" veces");
    }
}
