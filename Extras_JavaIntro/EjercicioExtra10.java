/*
     Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra10 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numAleatorio = (int)(Math.random()*10)*(int)(Math.random()*10);
        int numero;
        do {
            System.out.println("ingresa un numero");
            numero = leer.nextInt();
            if(numero==numAleatorio){
              break;  
            }else if(numero>numAleatorio){
                System.out.println("el numero que ingresaste es mayor a el numero ha adivinar");
            }else{
                System.out.println("el numero que ingresaste es menor a el numero ha adivinar");
            }
        } while(numero!=numAleatorio);
        
        System.out.println("felicidades adivinaste el numero");
        
    }
    
}
