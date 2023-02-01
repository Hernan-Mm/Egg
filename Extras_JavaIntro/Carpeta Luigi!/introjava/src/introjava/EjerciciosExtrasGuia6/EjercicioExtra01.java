/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un tiempo en minutos");
        int tiempoEnMinutos = leer.nextInt();
        convertirTiempo(tiempoEnMinutos);
        
        
    }
    
    public static void convertirTiempo(int tiempoEnMinutos){
        final int DIAS=1440;
        final int HORAS=60;
        int diasTotal;
        int horasTotal;
        if (tiempoEnMinutos >= 1440){
            diasTotal=tiempoEnMinutos/DIAS;
            tiempoEnMinutos %=  DIAS ;
            horasTotal = tiempoEnMinutos/HORAS;
            tiempoEnMinutos%=  HORAS;
           
            System.out.println("la cantidad de minutos es equivalante a "+diasTotal+" dias "+ horasTotal+" horas "+tiempoEnMinutos+" minutos ");
        }else{
            horasTotal = tiempoEnMinutos/HORAS;
            tiempoEnMinutos%=HORAS;
            System.out.println("la cantidad de minutos es equivalante a "+ horasTotal+" horas "+tiempoEnMinutos+" minutos ");
           
        }
        
        //hola
    }
    
}
