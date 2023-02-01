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
public class Ejer11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/
       Scanner Sc = new Scanner(System.in);
       
       int num;
       int c=0;
        System.out.println("Ingresar un numero");
        num =Sc.nextInt();
        
        do {
            num/=10;
            c++;
            
            
        } while (num>0);
           
        System.out.println("la cantidad "+c);
    }
    
}
