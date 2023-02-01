/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EncuestasCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la Peli de 1 a 5 Estrellas!");
        opinion = leer.nextInt();
        
        if(opinion >= 1 && opinion <= 5){
            switch(opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados de que no haya disfrutado la peli....");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Has calificado la peli como Exelente");
                    break;    
            }
        }
        else if (opinion < 0 ){
            System.out.println("¿Tan MALA fue la pelicula?");
        }
        else if (opinion < 0 ){
            System.out.println("El valor " +opinion+ " No es valido!!!");
        }
        else if (opinion < 0 ){
            System.out.println("¿Tan Buena fue la pelicula?");
        }
        System.out.println("Hasta la PROXIMA!!");
        
    }
    
}
