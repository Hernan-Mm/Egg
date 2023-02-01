/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer3ExtraJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingresar Frase");
        String frase = Sc.next();
        int lon = frase.length();
        int c=0;
        String letra;
        for (int i = 0; i < lon; i++) {
            letra= frase.substring(i, i+1);
            switch(letra){
                case "a":
                          c++;
                          break;
                case "e":
                          c++;
                          break;
                case "i":
                          c++;
                          break;
                case "o":
                          c++;
                          break; 
                case "u":
                          c++;
                          break;          
                       
            }
            
            
        }
       if(c>0){
           System.out.println("Se encontraron: "+c+" vocales");
       }else
            System.out.println("No se encontraron vocales");
        
    }
    
}
