/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer1ExtraJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
         //usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     Scanner Sc = new Scanner(System.in);
     
     int min;
     double hs;
     int dia;
        System.out.println("Ingresar Minutos");
        min=Sc.nextInt();
        hs= (min*1)/60;
        dia =(min*1/60)*1/24;
        
        System.out.println("Los minutos ingesados son: "+hs+" Horas");
        System.out.println("Los minutos ingesados son: "+dia+" dias");
        
    }
    
}
