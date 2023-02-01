/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package introjava.EjerciciosExtrasGuia6;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */

public class EjercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa una letra");
        String  letra = leer.nextLine();
        buscarLetra(letra);
   
    }
    
    public  static void buscarLetra(String letra){

        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("es una vocal");   
        }else{
            System.out.println("es una consonante");
        }
        
    }
    
}
