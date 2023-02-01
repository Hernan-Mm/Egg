/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
       //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
       
       Scanner leer = new Scanner(System.in);
       String frase;
       String fraseConvertido;
        System.out.println("ingresa una frase");
        frase = leer.nextLine();
        fraseConvertido = toUpperCase(frase);
        System.out.println("frase mayusculas "+fraseConvertido);
        fraseConvertido = toLowerCase(frase);
       System.out.println("frase minusculas "+fraseConvertido);
       
    }

  

    
}
