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
public class Ejer11GuiaT {
    public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
        Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
    
    String palabra;
    
        System.out.println("Ingresar palabra a modificar");
        palabra = leer.nextLine();
            modificador(palabra);
    }
    public static void modificador (String palabra){
        
        int longi = palabra.length();
        String cadena;
        cadena = " ";

        for (int i = 0; i < longi; i++) {
            
            switch (palabra.substring(i, i + 1)) {
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
                    cadena = cadena.concat(palabra.substring(i, i + 1));
            }       
            }
            System.out.println("La nueva frase es: "+cadena);
            
        }
    }
    

