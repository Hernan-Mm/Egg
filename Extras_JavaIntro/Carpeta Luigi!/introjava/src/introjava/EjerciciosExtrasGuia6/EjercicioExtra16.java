/*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona,
    el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] nombres;
        int [] edad;
        System.out.println("ingresa la cantidad de personas que desea leer sus datos");
        int numeroPersonas = leer.nextInt();
        nombres= new String[numeroPersonas];
        edad= new int[numeroPersonas];
        int contador=0;
        String continuar="Si";
        
        do {
            nombreEdad(nombres,edad,contador);
            contador++;
            continuar=seguir();
            System.out.println(continuar);
        } while (numeroPersonas!=contador && continuar=="Si" );

    }
    public static void nombreEdad(String [] nombres,int []edad,int contador){
            System.out.println("ingrese el nombre de la persona "+ (contador+1));
            Scanner leer = new Scanner(System.in);
            nombres[contador]= leer.nextLine();
            System.out.println("ingresa la edad de la persona "+(contador+1));
            edad[contador]=leer.nextInt();
            if(edad[contador]<18){
                System.out.println("persona nombre : "+ nombres[contador]+" edad "+edad[contador]+" es menor de edad");
            }else{
                System.out.println("persona nombre : "+ nombres[contador]+" edad "+edad[contador]+" es mayor de edad");
            }
                
            // TODO code application logic here
    }
    public static String seguir(){
            Scanner leer = new Scanner(System.in);
            System.out.println("deseas seguir Si o No");
            String eleccion = leer.nextLine();
            
            
        return eleccion;    
    }
}
