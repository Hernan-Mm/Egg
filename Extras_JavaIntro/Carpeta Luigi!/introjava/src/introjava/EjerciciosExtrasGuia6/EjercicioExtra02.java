/*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package introjava.EjerciciosExtrasGuia6;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux=0;
        int varA = 1;
        int varB = 2;
        int varC = 3;
        int varD = 4;
        // TODO code application logic here
        System.out.println("valores iniciales");
        System.out.println(" variable A valor inicial "+varA+" - variable B valor inicial "+varB+" - variable C valor inicial "+varC+" - variable D valor inicial "+ varD);
        aux = varB;
        varB=varC;
        varC=varA;
        varA=varD;
        varD=aux;
        System.out.println("valores finales");
         System.out.println(" variable A valor final "+varA+" - variable B valor final "+ varB+" - variable C valor final "+ varC+" - variable D valor final "+ varD);
    }
    
}
