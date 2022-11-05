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
public class Ejer1CoopJavaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//         dos. El programa deberá después mostrar el resultado de la suma
       int num1;
       int num2;
       
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar Numero");
        num1=leer.nextInt();
         System.out.println("Ingresar Numero");
        num2=leer.nextInt();
        System.out.println("La suma es: "+(num1+num2));
    }
    
}
