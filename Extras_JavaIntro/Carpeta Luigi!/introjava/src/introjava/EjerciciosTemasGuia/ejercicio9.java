/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.EjerciciosTemasGuia;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;
        do {
            System.out.println("ingresa un numero");
            numero = leer.nextInt();
            contador = contador + 1;
            if(numero < 0){
            }
            else{
               suma = numero + suma; 
            }
        } while (numero != 0 || contador == 20);
        
        System.out.println("este es el resultado de la suma " + suma);
        System.out.println("este es numero de ciclos ejecutados " + contador);
               
    }
    
}
