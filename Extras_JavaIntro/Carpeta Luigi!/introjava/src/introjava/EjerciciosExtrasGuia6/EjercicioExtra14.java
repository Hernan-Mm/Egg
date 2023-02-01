/*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero de familias");
        int familias = leer.nextInt();
        int [] numeroHijos= new int [familias];
        int total=0,contador = 0;
        while(contador!=familias){
            System.out.println("ingresa el numero de hijos para la familia -" + (contador+1));
            numeroHijos[contador]=leer.nextInt();
            contador++;
        }
        for (int i = 0; i < familias; i++) {
            total+=numeroHijos[i];
        }
        System.out.println("el promedio de numeros de hijos de todas las familias es :"+total/familias);
        // TODO code application logic here
    }
    
}
