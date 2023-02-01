/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String menbresia;
        int tratamiento;
       
        menu(); 
        System.out.println("elegi tu opcion");
        menbresia = leer.nextLine();
        System.out.println("valor de tratamiento");
        tratamiento = leer.nextInt();
        
        descuento(menbresia, tratamiento);
    }
    
    public static void menu(){
    
        System.out.println("Menu");
        System.out.println("A - Descuento 50%");
        System.out.println("B - Descuento 35%");
        System.out.println("C - Descuento 0%");
    }
    
    public static void descuento(String menbresia,int tratamiento){
        double descuento=0;
        
        switch(menbresia){
            case "a":
                descuento=tratamiento*0.5;
                break;
            case "b":
                descuento=tratamiento*0.35;
                break;  
            case "c":
                descuento=0;
                break;
        }
        System.out.println("el coste de tramiento es "+tratamiento+" - descuento es "+descuento +" - nuevo precio "+(tratamiento-descuento));
    
    }
    
}
