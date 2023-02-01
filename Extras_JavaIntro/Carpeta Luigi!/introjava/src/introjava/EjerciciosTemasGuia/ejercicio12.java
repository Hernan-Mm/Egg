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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int almacenarResultadoFuncionMultiplo;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero uno");
        int numero = leer.nextInt();
        System.out.println("ingresa el numero por el cual dividiras el primero");
        int numeroDivisor = leer.nextInt();

        if (numeroDivisor==0) {
            System.out.println("no se puede dividir por 0");
        }else{
        almacenarResultadoFuncionMultiplo=multiplo(numero,numeroDivisor);
        
        if (almacenarResultadoFuncionMultiplo == 0){
            System.out.println("el numero uno es multiplo del numero dos");
        }else{
            System.out.println("el numero uno no es multiplo del numero dos");
        }; 
        }
        
    }
    
    public static int multiplo(int numero,int numeroDivisor){
        int resultado;
        resultado = numero%numeroDivisor;
        return resultado;
    }
    
}
