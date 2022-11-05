/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc03Guia;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author User
 */
public class Ejerc03GuiaJavaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
       String frase;
       String nf;
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar Frase");
        frase=leer.nextLine();
        nf=toUpperCase(frase);
        System.out.println("La frase mayuscula es:" + nf);
        nf=toLowerCase(frase);
        System.out.println("La frase minuscula es:" + nf);
         
    }

    
    
}
