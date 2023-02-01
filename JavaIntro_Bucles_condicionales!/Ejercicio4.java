/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.java.egg;

import java.util.Scanner;

/**
 *
 * @author Robins Z
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
        
        float c ;
        float f;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese grados centígrados");
        c = leer.nextFloat();
        
        f = 32 + (9*c/5);
        
        System.out.println("Su equivalente en Fahrenheit es: " + fa);
        
        
    }
    
}
