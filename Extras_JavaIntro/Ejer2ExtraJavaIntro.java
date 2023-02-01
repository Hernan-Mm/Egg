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
public class Ejer2ExtraJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingresar 1 Valor!!");
        int a= Sc.nextInt();
        System.out.println("Ingresar 1 Valor!!");
        int b= Sc.nextInt();
        System.out.println("Ingresar 1 Valor!!");
        int c= Sc.nextInt();
        System.out.println("Ingresar 1 Valor!!");
        int d= Sc.nextInt();
        
        System.out.println("Los Valore ingresados son: ");  
        System.out.println("A vale: "+a+" B vale: "+b+" C vale: "+c+" y D vale: "+d);
        
        int aux;
        aux = b;
        b = c;
        c = a;
        a=d;
        d=aux;
        System.out.println("Los nuevos valores son:");
        System.out.println("A vale: "+a+" B vale: "+b+" C vale: "+c+" y D vale: "+d);

                
        
    }
   
 }
