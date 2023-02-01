/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_e_8;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 *
 */
public class POO_E_8 {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cadena c1 = new Cadena();

        System.out.println("Ingrese una frase: ");
        c1.setFrase(sc.nextLine());

        //System.out.println(c1.getFrase());

        System.out.println(c1.mostrarVocales());        

        c1.invertirFrase();
        System.out.println("");
        
        System.out.println("Ingrese una letra: ");
        char letra = sc.nextLine().charAt(0);
        
        //System.out.println(c1.contiene(letra));
        
        System.out.println("Ingrese otra letra: ");
        System.out.println(c1.vecesRepetido(letra));
        
        System.out.println("Ingrese otra frase: ");
        
        c1.compararLongitud(sc.nextLine());
        
        System.out.println("Ingrese una frase: ");
        
        c1.unirFrases(sc.nextLine());
        
        System.out.println("Ingrese una letra");
        
       c1.reemplazar(sc.nextLine().charAt(0));
       
       
       

    }

}
