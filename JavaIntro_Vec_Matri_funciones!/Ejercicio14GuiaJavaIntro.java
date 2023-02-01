/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_intro_SubPro_Matri_Vecto;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio14GuiaJavaIntro {
    public static Scanner leer= new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
       double euro ;
       
 
  
        System.out.println("Ingresar la Cantidad de Euros");
        euro = leer.nextFloat();
        
        cambio(euro);
  
    }
    
    
 public static void cambio(double euro){
     int opcion;
     System.out.println("Eljir el Cambio");
     System.out.println("opcion 1 Libras");
     System.out.println("opcion 2 Dolares");
     System.out.println("opcion 3 Yenes");
     opcion= leer.nextInt();
     
     switch(opcion){
         case 1 :
                   euro = euro * 0.86;
                   break;
         case 2 :
                  euro = euro * 1.28611;
                  break;
        case 3 :
                  euro = euro * 129.852;
                  break;
                  
     } 
     System.out.println(" Su cambio es : "+ euro);
     
 }
    
}
