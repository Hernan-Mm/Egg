/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.EjerciciosTemasGuia;
import java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         System.out.println("leer frase");
        String frase = leer.nextLine();
        remplazar(frase); 
    }

    public static String remplazar(String frase){
         int contador = 0;
         String newFrase="";
         String caracterFrase;
        do{
            caracterFrase=frase.substring(contador, contador+1);//0-1//1-2
            switch(caracterFrase){
                case "a":
                    caracterFrase = "@";
                    break;
                case "e":
                    caracterFrase = "#";
                    break;
                case "i":
                    caracterFrase = "$";
                    break;
                case "o":
                    caracterFrase = "%";
                    break;
                case "u":
                    caracterFrase = "*";
                    break;
                default:
                  caracterFrase=caracterFrase;
                    break;
            }
            newFrase = newFrase + caracterFrase; 
            contador++;
            
        }while(contador != (frase.length()));
        
        System.out.println(newFrase);
        return newFrase;
    }
    
}
