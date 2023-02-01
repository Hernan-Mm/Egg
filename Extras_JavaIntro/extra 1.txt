package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra01 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos a calcular");
        int num = scan.nextInt();
        double s=0, d=0, h=0;
        h= (num/60);
        d= (h/24);
        s= (d/7);
        if ((int)s!=0){
        System.out.print("cantidad de semanas = "+(int)s);
        System.out.print(", cantidad de días = "+(int)(d));
        System.out.println(" y cantidad de horas = "+(int)h);
        }else if((int)d!=0){
        System.out.print("Cantidad de dias = "+(int)d);
        System.out.print(" y cantidad de horas = "+(int)h);
        }else{
        System.out.print("cantidad de horas = "+(int)h);
        
        }
        System.out.println("");
    }

}
