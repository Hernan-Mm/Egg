/*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
 */
package introjava.EjerciciosExtrasGuia6;
// version do while

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra07VersionDW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadNumerosIngresado,numero,valorMaximo=0,valorMinimo=9999999,contador=0;
        double promedio=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa la cantidad de numeros que ingresaras");
        cantidadNumerosIngresado = leer.nextInt();
        do {            
            System.out.println("ingresa un numero");
            numero = leer.nextInt();
            if (valorMaximo<numero) {
                valorMaximo=numero;    
            }
            if(valorMinimo>numero){
                valorMinimo=numero;
            }
            promedio+=numero;
            contador++;
        } while (contador!=cantidadNumerosIngresado);
        promedio=promedio/contador;
        System.out.println("numero maximo "+ valorMaximo);
        System.out.println("numero minimo "+ valorMinimo);
        System.out.println("el promedio es "+ promedio);
        // TODO code application logic here
    }
    
}
