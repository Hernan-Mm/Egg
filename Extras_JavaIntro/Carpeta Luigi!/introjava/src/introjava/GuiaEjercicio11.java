/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import  java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingresa un numero 2");
        int numero2 = leer.nextInt();
        int opcion;
        int confirmarSalir = 0;
        do{
        menu();
        opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("la suma es "+ (numero1+numero2));    
                break;
                case 2:
                    System.out.println("la resta es "+ (numero1-numero2));
                break;
                case 3:
                    System.out.println("la multiplicacion es "+(numero1*numero2));
                break;
                case 4:
                    System.out.println("la division es "+(numero1/numero2));
                break;
                case 5:
                    confirmarSalir = confirmar();
                break;
            }    
        }while(confirmarSalir != 5);  
    }
    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir  ");
        System.out.println("Elija la opcion");
    }
    public static int confirmar(){
        System.out.println("desea salir confirmar con s - Negar con N");
        Scanner leer = new Scanner(System.in);
        String confirmarChar = leer.nextLine();
        if( confirmarChar.equals("s")||confirmarChar.equals("S") ){
            return 5;
        }else{
            return 0;
        }
    }
}
