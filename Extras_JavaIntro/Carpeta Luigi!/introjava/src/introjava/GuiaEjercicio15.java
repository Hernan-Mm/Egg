/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numerosEnteros = new int [101];
        llenarVector(numerosEnteros);
        mostrarVectorInvertido(numerosEnteros);
        
        
    }
    public static void llenarVector(int [] vectorLlenar){
        for (int i = 0; i < 101; i++) {
            vectorLlenar[i] = i; 
            
        }
    }
    public static void mostrarVector(int [] vectorMostrar){
        for (int i = 0; i < 101; i++) {
            System.out.println("Valor posicion"+ i + " es "+ vectorMostrar[i]);
        }
    }
    
    public static void mostrarVectorInvertido (int []vectorMostrar){
        for (int i = 100; i >= 0; i--) {
            System.out.println("Posicion "+ i + " su Valor es "+ vectorMostrar[i]);
        }
    
    }
    
}
