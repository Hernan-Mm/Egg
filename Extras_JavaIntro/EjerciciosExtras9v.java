
import java.util.Scanner;

    /*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

/**
 *
 * @author LuiG
 */
public class EjerciciosExtras9v {
 
public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ingresa un numero");
        int numero1 = leer.nextInt();
        System.out.println("ingresa otro numero");
        int numero2 = leer.nextInt();
        int contador=0;
        do {
            numero1-=numero2;
            contador++;
        } while (numero1>numero2);

        System.out.println("el residuo es "+numero1+" el cociente es "+contador);
        // TODO code application logic here
    }
    
}
