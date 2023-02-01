/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
        
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("ingresa un numero");
        numero1 = leer.nextInt();
        System.out.println("Ingresa otro numero");
        numero2 = leer.nextInt();
        System.out.println("esta es la suma"+(numero1+numero2));
    }
    
}
