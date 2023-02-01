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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        
        int numero1; 
        numero1 = leer.nextInt();
        System.out.println("ingresa un segundo numero");
        int numero2;
        numero2 = leer.nextInt();
        
        if(numero1 > 25 && numero2 > 25){
            System.out.println("ambos numeros son mayores a 25");
        }
        else if(numero1 > 25 || numero2 > 25 ){
            System.out.println("al menos uno de los numeros es mayor a 25");
        }
        else{
            System.out.println("ninguno de los numero es mayor a 25");
        }
    
}
}