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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [] vectorNombre;
        vectorNombre = new String[3];
        for (int i = 0; i < vectorNombre.length; i++) {
            System.out.println("ingresa un nombre");
            vectorNombre[i] = leer.nextLine();
        }
        String aux = "";
        for(String elemento: vectorNombre){
        aux = aux + " " + elemento;
        }
        System.out.println(aux);
    };
    
}
