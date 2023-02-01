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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un boleano");
        boolean comprobar;
        comprobar = leer.nextBoolean();
        System.out.println("ingresa un decimal");
        double decimal;
        decimal = leer.nextDouble();
        System.out.println("ingresa un caracter");
        char caracter;
        caracter = leer.next().charAt(0);
        
    }
    
}
