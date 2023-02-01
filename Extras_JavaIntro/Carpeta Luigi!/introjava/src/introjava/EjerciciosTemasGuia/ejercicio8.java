/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.EjerciciosTemasGuia;
import  java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //validar nota
        int nota;
        System.out.println("ingresa una nota");
        nota = leer.nextInt();
        
        while(nota<1 || nota>10){
            System.out.println("ingresa una nota valida");
            nota = leer.nextInt();
        }
        System.out.println("ingresate la nota de "+ nota);
    }
    
}
