/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package introjava;
import  java.util.Scanner;
/**
 *
 * @author LuiG
 */
    public class GuiaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de euros a convertir");
        int cantidadEuros = leer.nextInt();
        String monedaConvertir = menu();
        convertir(cantidadEuros, monedaConvertir);
        
        // TODO code application logic here
    }
    public static void convertir(int cantidadEuros,String monedaConvertir){
        double divisaConvertirValor = 0;
        switch(monedaConvertir){
          case "Libras":
                divisaConvertirValor = 0.86;
                break;
            case "Dolares":
                divisaConvertirValor = 1.28611;
                break;
            case "Yenes":
                divisaConvertirValor = 129.852;
                break;
        }
        double totalConversion = cantidadEuros * divisaConvertirValor;
        
        System.out.println("los "+ cantidadEuros +" Euros equivalen a "+ totalConversion+" en "+ monedaConvertir );
    }
    
    public static String menu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona Moneda a Convertir");
        System.out.println("01 - Libras");
        System.out.println("02 - Dolares");
        System.out.println("03 - Yenes");
        int seleccion = leer.nextInt();
        String convertirSeleccionTexto="";
        switch (seleccion){
            case 1:
                convertirSeleccionTexto = "Libras";
                break;
            case 2:
                convertirSeleccionTexto = "Dolares";
                break;
            case 3:
                convertirSeleccionTexto = "Yenes";
                break;
        }
        return convertirSeleccionTexto;
    }
            
    
}
