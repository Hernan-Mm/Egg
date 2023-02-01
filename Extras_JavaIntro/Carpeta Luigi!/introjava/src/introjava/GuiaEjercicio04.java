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
public class GuiaEjercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        // Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer = new Scanner(System.in);
        float temperatura;
        float temperaturaFarenheit;
        System.out.println("ingresa la temperatura en grados celsios");
        temperatura = leer.nextFloat();
        temperaturaFarenheit = 32+(9*temperatura/5);
        System.out.println("La temperatura convertida es "+ temperaturaFarenheit);
        
    }
    
}
