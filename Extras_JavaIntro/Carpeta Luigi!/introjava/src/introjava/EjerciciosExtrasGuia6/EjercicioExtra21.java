/*
    Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
    prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
    programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
    igual al 7 de sus notas del curso.
 */
package introjava.EjerciciosExtrasGuia6;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] notasPromedios = new int [10];
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            notasPromedios[i]= promedioAlumno(notasPromedios, contador);
            contador++;
            
            System.out.println("promedio alumno "+notasPromedios[i]);
        }
        aprobadosDesaprobados(notasPromedios);
        // TODO code application logic here
    }
    
    public static int promedioAlumno(int [] vector,int contador){
        Scanner leer = new Scanner(System.in);
        int promedio=0;    
        System.out.println("ingresa las notas del alumno " +(contador+1));
        //poner un do while con la condicion de examinar promedio 
        System.out.println("Primer trabajo práctico evaluativo 10% ");
        promedio+=leer.nextInt();
        System.out.println("Segundo trabajo práctico evaluativo 15%");
        promedio+=leer.nextInt();
        System.out.println("Primer Integrador 25%");
        promedio+=leer.nextInt();
        System.out.println("Segundo integrador 50%");
        promedio+=leer.nextInt();
        promedio=(int)(promedio/4);    
    return promedio;
    }
    public static void aprobadosDesaprobados(int [] vector){
        int aprobados=0;
        int desaprobados=0;
        for(int elemento:vector){
            if(elemento<7){
            desaprobados++;
            }else{
            aprobados++;
            }
        }
        System.out.println("el total de alumnos aprobados es "+aprobados+ " y los desaprobados son "+desaprobados);
    
    }
}
