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
public class GuiaEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero limite");
        int numeroLimite = leer.nextInt();
        int numeroIngresado;
        int total = 0; 
        
        do{
            System.out.println("ingresa un numero");
            numeroIngresado = leer.nextInt();
            total=numeroIngresado+total;
        }while(numeroLimite > total);
        
        System.out.println("total de la suma "+ total);
        System.out.println("numero limite "+ numeroLimite);
    }
    
}
