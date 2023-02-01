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
public class EjercicioGuia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carÃ¡cter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *  */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();

        String retorno = funcionCambio(frase);
        System.out.println("La frase cambiada es " + retorno);

    }

    public static String funcionCambio(String frase) {
        int longitud = frase.length();
        String cadena;
        cadena = " ";

        for (int i = 0; i < longitud; i++) {
            
            switch (frase.substring(i, i + 1)) {
                case ("a"):
                    cadena = cadena.concat("@");
                    break;
                case ("e"):
                    cadena = cadena.concat("#");
                    break;
                case ("i"):
                    cadena = cadena.concat("i");
                    break;
                case ("o"):
                    cadena = cadena.concat("%");
                    break;
                case ("u"):
                    cadena = cadena.concat("*");
                    break;
                default:
                    cadena = cadena.concat(frase.substring(i, i + 1));
            }

        }
        return cadena;
    }

}


    

