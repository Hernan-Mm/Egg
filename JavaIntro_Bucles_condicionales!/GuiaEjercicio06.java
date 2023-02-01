/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero;
        numero = leer.nextInt();
        if(numero%2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        };
                
    }
    
}
