/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el numero que define el tamaño del cuadrado");
        int cuadradoDimension = leer.nextInt();
        
        String aux="";
        
        for (int i = 1; i <= cuadradoDimension; i++) {
            
            for (int j = 1; j <= cuadradoDimension; j++) {
                if(i == 1 || i == cuadradoDimension){
                aux += "*";
                }else{
                    if(j==1 || j== cuadradoDimension){
                        aux+="*";
                    }else{
                        aux+=" ";
                    }
                }

            }
            System.out.println(aux);
            aux="";
        }
        
        
    }
    
}
