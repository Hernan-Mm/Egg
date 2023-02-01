/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Ingresa tu Nombre");
       nombre = leer.next();
       System.out.println("Hola Mundo soy "+ nombre + " Estoy Programando en Java");
       
        // TODO code application logic here
    }
    
}
