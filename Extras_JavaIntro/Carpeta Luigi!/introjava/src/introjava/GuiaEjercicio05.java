/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        double raizNumero;
        System.out.println("Ingresa un numero");
        numero = leer.nextInt();
        raizNumero = Math.sqrt(numero);
        
        System.out.println("este es el doble del numero que ingresaste " +(numero*2));
        System.out.println("este es el triple del numero que ingresaste " +(numero*3));
        System.out.println("este es el raiz cuadrada del numero que ingresaste " + raizNumero);
    }
    
}
