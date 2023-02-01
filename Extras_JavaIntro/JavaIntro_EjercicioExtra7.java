/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro_ejerciciosextras;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaIntro_EjercicioExtra7 {
    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.*/
    
        System.out.print("Por favor determine la cantidad de numeros a ingresar: >>");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int tipoBucle = bucle();
        ingresarNumeros(vector, n, tipoBucle);
        analsisYSalida(vector, n, tipoBucle);
    }
    
    public static int bucle() {
        int retorno;
        System.out.println("");
        System.out.println("Seleccione con que tipo de bucle desea hacer la operacion:");
        System.out.println("While <1>");
        System.out.println("Do While <2>");
        do{
            System.out.print(">>");
            retorno = leer.nextInt();
            if (retorno != 1 && retorno != 2)
            {
                System.out.println("Error: ingrese un valor entre 1 y 2");
                System.out.println("");
            }
        } while (retorno != 1 && retorno != 2);
        
        return retorno;
    }
    
    
    
    //Permite el ingreso de los numeros al vector
    public static void ingresarNumeros(int[] vector, int n, int tipoBucle) {
        if (tipoBucle == 1){
            ingresoWhile(vector, n);
        } else {
            ingresoDoWhile(vector, n);
        }
    }
    
    
    //Metodo que utiliza While para ingreso de datos
    public static void ingresoWhile(int[] vector, int n) {
        int i = 0;
        
        while (i < n)
        {
            System.out.print("Por favor ingrese el valor para la posicion [" + i + "]:>>");
            vector[i] = leer.nextInt();
            i++;
        }
    }
    
    //Metodo que utiliza DoWhile para ingreso de datos
    public static void ingresoDoWhile(int[] vector, int n) {
       int i = 0;
        
        do
        {
            System.out.print("Por favor ingrese el valor para la posicion [" + i + "]: >>");
            vector[i] = leer.nextInt();
            i++;
        } while (i<n);
    }
    
    
    
    
    
    
    public static void analsisYSalida(int[] vector, int n, int tipoBucle) {
        if (tipoBucle == 1){
            asWhile(vector, n);
        } else {
            asDoWhile(vector, n);
        }
    }
    
    public static void asWhile(int[] vector,int n) {
        int i = 0, min=0, max=0, c=0;
        double  suma=0;
        while (i<n)
        {            
            if (i == 0)
            {
                min = vector[i];
                max = vector[i];
            } else 
            {
                if (vector[i]<min)
                {
                    min = vector[i];
                } else if (vector[i]>max)
                {
                    max = vector[i];
                }
            }
            
            if (vector[i]>0)
            {
                suma = Double.sum(suma, vector[i]);
                c++;
            }
            i++;
        }
        
        double promedio = suma/c;
        
        System.out.println("El maximo de los numeros ingresados es " + max);
        System.out.println("El minimo de los numeros ingresados es " + min);
        System.out.println("El promedio de los numeros no negativos es " + promedio);
    }
    
    public static void asDoWhile(int[] vector,int n){
        int i = 0, min=0, max=0, c=0;
        double suma=0;
        do
        {
            if (i == 0)
            {
                min = vector[i];
                max = vector[i];
            } else 
            {
                if (vector[i]<min)
                {
                    min = vector[i];
                } else if (vector[i]>max)
                {
                    max = vector[i];
                }
            }
            
            if (vector[i]>0)
            {
                suma = Double.sum(suma, vector[i]);
                c++;
            }
            i++;
        } while (i<n);
        
        double promedio = suma/c;
        
        System.out.println("El maximo de los numeros ingresados es " + max);
        System.out.println("El minimo de los numeros ingresados es " + min);
        System.out.println("El promedio de los numeros no negativos es " + promedio);
    }
}
