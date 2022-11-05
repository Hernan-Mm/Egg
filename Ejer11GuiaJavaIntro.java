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
public class Ejer11GuiaJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1;
         int num2;
         int opcion=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Primer numero ");
        num1 = leer.nextInt();
        System.out.println("Ingrese Segundo numero");
        num2 = leer.nextInt();
        
        do{
            System.out.println("Menu");  
            System.out.println("1. Sumar"); 
            System.out.println("2. Restar"); 
            System.out.println("3. Multiplicar"); 
            System.out.println("4. Dividir"); 
            System.out.println("5. Salir"); 
            System.out.println("Elija opción:"); 
            System.out.println("Ingrese Opcion ");
            opcion= leer.nextInt();
            switch(opcion){
                case 1: System.out.println("La suma es igual a: " +(num1+num2));
                break;
                case 2: System.out.println("La resta es igual a: " +(num1-num2));
                break;
                case 3: System.out.println("La multiplicacion es igual a: " +(num1*num2));
                break;
                case 4: System.out.println("La division es igual a: " +(num1/num2));
                break;
                case 5: System.out.println("Muchas Gracias!!");
                break;
            }
            
        }while(opcion!=5 && opcion< 6);
    }
    
}
