/*
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        System.out.println("ingresa un numero");
        int numero1 = leer.nextInt();
        System.out.println("ingresa un numero dos");
        int numero2 = leer.nextInt();
        int opcion;
        do {
            menu();
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    suma(numero1,numero2);
                    break;
                case 2:
                    resta(numero1,numero2);
                    break;  
                case 3:
                    multiplicacion(numero1,numero2);
                    break;
                 case 4:
                    division(numero1,numero2);
                    break;
                 case 5:
                     System.out.println("adios");
                    break;
                 default:
                     System.out.println("ingresa un numero valido");
                    break;
            }
            
            
        } while (opcion!=5);

        // TODO code application logic here
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
    }
    public static void suma(int numero1,int numero2){
    int total =numero1+numero2;
        System.out.println("la suma es " + total);
    }
    public static void resta(int numero1,int numero2){
    int total =numero1-numero2;
        System.out.println("la resta es " + total);
    }
     public static void multiplicacion(int numero1,int numero2){
    int total =numero1*numero2;
        System.out.println("la multiplicacion es " + total);
    }
    public static void division(int numero1,int numero2){
    double total =numero1/numero2;
        System.out.println("la division es " + total);
    }
   
}
