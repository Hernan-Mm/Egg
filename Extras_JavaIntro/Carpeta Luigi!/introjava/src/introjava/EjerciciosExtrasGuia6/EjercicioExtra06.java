/*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contadorBucle=0,contadorEstatura=0;
        int numeroPersonas;
        double estatura,promedioEstatura=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero de personas a calcular la estatura");
        numeroPersonas = leer.nextInt();
        do{
            System.out.println("ingresa una estatura");
            estatura = leer.nextDouble();
            if(estatura<=1.60){
                promedioEstatura+=estatura;
                contadorEstatura++;
            }
            contadorBucle++;
        }while(contadorBucle != numeroPersonas);
        promedioEstatura=promedioEstatura/contadorEstatura;
        System.out.println("la estatura promedio de personas 1.6m o menos es :"+promedioEstatura+"m");
               
        //sin junior no hay señors
    }
    
}
