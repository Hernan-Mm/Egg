/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //variables
        String cadenaIngresada;
        int longitudFrase;
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        
        do{
            System.out.println("Ingresa una Frase");
            cadenaIngresada = leer.nextLine();
            longitudFrase = cadenaIngresada.length();
            // Cuando la cadena tienen 5 caracteres
            if(longitudFrase <= 5){
               
              if(cadenaIngresada.equals("&&&&&")){

                   System.out.println("terminando programa");   
              }
              if(cadenaIngresada.substring(0,1).equals("X") && cadenaIngresada.substring(longitudFrase-1,longitudFrase).equals("O")){
                System.out.println("Ingresaste una cadena Correcta");
                contadorCorrectas += 1;
              
              }else{
               System.out.println("Ingresaste una cadena incorrecta no se contara");
               contadorIncorrectas += 1;
              }
            // cuando la cadena tiene mas de 5 caracteres o menos
            }else{
               System.out.println("Ingresaste una cadena incorrecta no se contara");
               contadorIncorrectas += 1;
            }
   
        }while(cadenaIngresada.equals("&&&&&") == false);
        
       //prints
        System.out.println("Ingresaste "+ contadorCorrectas +" Frases Correctas");
        System.out.println("Ingresaste "+ contadorIncorrectas +" Frases Incorrectas");
        
    }
  
}
