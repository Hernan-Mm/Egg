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
public class Ejer1GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num1;
         int num2;
         int total;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Primer numero para sumar");
        num1 = leer.nextInt();
        System.out.println("Ingrese Segundo numero de suma");
        num2 = leer.nextInt();
        total = num1+num2;
        System.out.println("El total entre  " +num1+" y "+num2+ " ES de "+total);
    }
    
}
