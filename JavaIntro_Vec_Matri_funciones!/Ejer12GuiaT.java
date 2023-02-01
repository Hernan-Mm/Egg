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
public class Ejer12GuiaT {
     public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//     que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//   segundo, sino informe que no lo son.

         int n1 ; int n2;
         System.out.println("Ingresar Numero 1");
         n1=leer.nextInt();
         System.out.println("Ingresar Numero 2");
         n2=leer.nextInt();
         EsMultiplo(n1, n2);
                 
    }
    public static void  EsMultiplo (int n1,int n2){
        if ( n1%n2 == 0){
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }
        
        
    }
}
