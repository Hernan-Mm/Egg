/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 * and open the template in the editor.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero = leer.nextInt();
        convertirRomano(numero);
        
    
        
        
    }
    public static void convertirRomano(int numero){
        String presentarNumero = "el numero que ingresaste es en Romanos ";
        switch(numero){
            case 1:
                System.out.println(presentarNumero+"I");
                break;
            case 2:
                System.out.println(presentarNumero+"II");
                break;
            case 3:
                System.out.println(presentarNumero+"III");
                break;
            case 4:
                System.out.println(presentarNumero+"IV");
                break;
            case 5:
                System.out.println(presentarNumero+"V");
                break;
            case 6:
                System.out.println(presentarNumero+"VI");
                break;
            case 7:
                System.out.println(presentarNumero+"VII");
                break;
            case 8:
                System.out.println(presentarNumero+"VIII");
                break;
            case 9:
                System.out.println(presentarNumero+"IX");
                break;
            case 10:
                System.out.println(presentarNumero+"X");
                break;
            default:
                System.out.println("numero invalido ingresa un numero entre 1 a 10");
                break;
        }
    
    }
    
}
