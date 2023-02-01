/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_intro_SubPro_Matri_Vecto;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer15CoopJavaIntro {
    public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
         //muestre por pantalla en orden descendente.
    
    int [] vector = new int[100];
        rellenar(vector);
    
    }
    public static void rellenar (int[] vector){
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            
            
 }
        for (int i = 99; i>=0; i--) {
            System.out.print(vector[i]+" ");
            
            
        }
        
    }
    
}
