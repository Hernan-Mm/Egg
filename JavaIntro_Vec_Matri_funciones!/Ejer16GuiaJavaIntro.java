/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_intro_SubPro_Matri_Vecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer16GuiaJavaIntro {
 public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
        System.out.println("Ingrese tamaño del vector");
        int n =leer.nextInt();
        
    int vector[]= new int [n];
        rellenar(vector, n);
    
    }
   public static void rellenar (int vector[],int n){
       int c=0;
      Random random = new Random();
        
       for (int i = 0; i < n ; i++) {
           vector[i]=  random.nextInt(11);
           System.out.println("["+vector[i]+"]");
       }
       System.out.println("Ingrsar numero a buscar");
       int b = leer.nextInt();
       
        for (int i = 0; i < n ; i++) {
           if (vector[i] == b ){
               
           System.out.println("El numeor "+ b + " esta en la posicion "+i);
           
           }else{
                c = 1;
           }
           
       }
      if(1 == c){
          System.out.println("Numero no encontrado!");
          
      } 
   } 
   
    
}
