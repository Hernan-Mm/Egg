/*
    Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero = leer.nextInt();
        System.out.println("ingresa el numero que quieres dividir");
        int numeroDivisor = leer.nextInt();
        dividirConResta(numero, numeroDivisor);
        
        // TODO code application logic here
    }
    public static void dividirConResta(int numero, int numeroDivisor){
       int contador=0;
        while(numero>numeroDivisor){
            numero-=numeroDivisor;
            contador++;

        }
        System.out.println("el residuo es : "+ numero +"  y el cociente es :"+contador );
    }
}
