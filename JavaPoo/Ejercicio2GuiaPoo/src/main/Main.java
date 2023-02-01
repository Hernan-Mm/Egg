/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Circunferencia;

/**
 *
 * @author Robins Z
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia n1 = new Circunferencia();
        n1.crearCircunferencia();
        n1.area();
        n1.perimetro();
        System.out.println(n1);
    }
    
    
    
}
