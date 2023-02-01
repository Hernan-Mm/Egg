/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava_bucle_condicionales;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer13JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n;
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingresar Numero");
        n = leer.nextInt();
        
for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
     
 
    }

        
    

