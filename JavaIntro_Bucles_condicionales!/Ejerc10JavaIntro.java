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
public class Ejerc10JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//         números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    int limite= 0;
    int num;
    int suma = 0;
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresar Limite");
        limite= leer.nextInt();
        while(suma<limite){
            System.out.println("Ingresar Numero de Suma");
            num=leer.nextInt();
            
            suma= num + suma;
        }
        System.out.println("La suma es igual a: "+suma);
    
    }
    
    
}
