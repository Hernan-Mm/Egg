/*
   Crear un programa que dibuje una escalera de números, donde cada línea de números
   comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
   usuario al comenzar. Ejemplo: si se ingresa el número 3:
   1
   12
   123
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero de lineas que quieres tu escalera");
        int dimensionEscalera = leer.nextInt();
        System.out.println("se imprimira la escalera");
        String escaleraLinea="";
        for (int i = 1; i <= dimensionEscalera; i++) {
            escaleraLinea+=i;
            System.out.println(escaleraLinea);
        }
        
        
        
    }
    
}
