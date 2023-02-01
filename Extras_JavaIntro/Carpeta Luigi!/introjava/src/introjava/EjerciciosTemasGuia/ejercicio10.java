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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         int numeroIngresado;
         int contador = 0;
         String asteriscosPorNumero ="";
         
         for (int i = 0; i < 4; i++) {
             //validar numero
            do{
                System.out.println("Ingresa un numero valido");
                numeroIngresado = leer.nextInt();
               }while(numeroIngresado>20);
            //generar asteriscos
            do{
                asteriscosPorNumero += "*";//*******
                contador++;
            }while(contador!=numeroIngresado);
            
            //imprimir numero y asteriscos
            System.out.println(numeroIngresado+" "+asteriscosPorNumero);
            //limpiar variables
            asteriscosPorNumero="";
            contador=0;
         }
        }  
    }
