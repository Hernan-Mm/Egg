/*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
 */
package introjava.EjerciciosExtrasGuia6;

/**
 *
 * @author LuiG
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contador;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                      contador = i+"-"+j+"-"+k;
                      contador=replazar(contador);
                      System.out.println(contador);

                }
            }
        }
    }
    
    public static String replazar(String contador){
        int longitudCadena= contador.length();
        String subCadena="";
        String contadorFinal="";
        for (int i = 0; i < longitudCadena; i++) {
            subCadena=contador.substring(i,i+1);
            if(subCadena.equals("3")){
                subCadena="E";
            }else{
            subCadena=subCadena;
            }
            contadorFinal+=subCadena;
        }
        contador=contadorFinal;
        
        return contador;
    }
    
}
