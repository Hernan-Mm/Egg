/*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numeroIngresado,numerosPares=0,numerosImpares=0;
        do {
            System.out.println("ingresa un numero");
            numeroIngresado = leer.nextInt();
            if(numeroIngresado<0){
                break;
            }else if(numeroIngresado%2==0){
                numerosPares++;
            }else{
                numerosImpares++;
            }
      
        } while (numeroIngresado%5!=0);
        
        System.out.println("ingresaste "+numerosPares+" numeros pares");
        System.out.println("ingresaste "+numerosImpares+" numeros impares");
        
        
    }
    
}
