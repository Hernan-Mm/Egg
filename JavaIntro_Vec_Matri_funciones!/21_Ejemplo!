package guia6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author akila
 */
public class Ejercicio21 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        int auxA = 0, auxB = 0, c = 0;
        boolean aux = false;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ingrese valor para matriz M (10x10) en posición " + (i + 1) + ", " + (j + 1));
                M[i][j] = leer.nextInt();
            }
        }
        System.out.println("Números ingresados correctamente");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para matriz P (3x3) en posición " + (i + 1) + ", " + (j + 1));
                P[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Números ingresados correctamente");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (M[i][j] == P[0][0]) {
                    auxA = i;
                    auxB = j;
                    aux = true;
                    System.out.println("jackpot");
                    if (aux = true) {
                        for (i = 0; i < 3; i++) {
                            for (j = 0; j < 3; j++) {
                                if (P[(i)][(j)] == M[(i + auxA)][(j + auxB)]) {
                                    System.out.println("check i=" + (i + auxA) + ", j=" + (j + auxB));
                                    c++;
                                    System.out.println(c);
                                } else {
                                    aux = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c == 9) {
            System.out.println("Se encontró la matriz P en la posicion " + (auxA + 1) + ", " + (auxB + 1));
        } else {
            System.out.println("No se encontró la matriz P dentro de la matriz M");
        }
    }
}
