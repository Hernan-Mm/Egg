/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int [] vectorNumeros = {1,22,333,4444,55555};
        int cantidadElementos;
        imprimirVector(vectorNumeros);
        cantidadElementos = contarElementos(vectorNumeros);
        System.out.println("======================================");
        identificarDimensionElementos(vectorNumeros, cantidadElementos);
    }
    

    public static void imprimirVector(int [] vector){
        
        for (int elemento:vector) {
            System.out.println(elemento);
        }
        
    }
    public static int contarElementos(int [] vector){
        int aux=0;
        for (int elemento:vector) {
            aux+=1;
        }
        return aux;
    }
    
    public static void identificarDimensionElementos(int [] vector, int cantidadElementos){
        int elemento;
        String numeroConvertido;
        int unDigito=0,dosDigitos=0,tresDigitos=0,cuatroDigitos=0,cincoDigitos=0;
        for (int i = 0; i<cantidadElementos; i++) {
            elemento = vector[i];
            numeroConvertido = String.valueOf(elemento);
            elemento = numeroConvertido.length();
            if(elemento == 1){
                unDigito +=1;
            }
            if(elemento == 2){
                dosDigitos +=1;
            }
            if(elemento == 3){
                tresDigitos +=1;
            }
            if(elemento == 4){
                cuatroDigitos +=1;
            }
            if(elemento == 5){
                cincoDigitos +=1;
            }
            
            
        }
        System.out.println("Hay "+ unDigito + " Con un digito");
        System.out.println("Hay "+ dosDigitos + " Con dos digitos");
        System.out.println("Hay "+ tresDigitos + " Con tres digitos");
        System.out.println("Hay "+ cuatroDigitos + " Con cuatro digitos");
        System.out.println("Hay "+ cincoDigitos + " Con cinco digitos");
    }
}
