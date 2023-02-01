/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;

public class ejercicioAprendizaje20 {
     public static Scanner lector= new Scanner (System.in);
    
    public static void main(String[] args) {
       int matriz [][]= new int [3][3];
       
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz.length; j++) {
                do {
                    System.out.println("ingrese un numero ");
                    matriz[i][j]= lector.nextInt();
                } while (matriz [i][j]<1 || matriz[i][j]>9);
        
                 
            }
   
        }
        int diagonal1=0,diagonal2=0,sumafila=0,sumacolumna=0,cont=0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal1+=matriz[i][i];
            diagonal2+=matriz[i][matriz.length-1-i];
            
        }
        if(diagonal1!=diagonal2){
            System.out.println("no es magico ");
            
        }else{
              
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    sumafila+=matriz[i][j];
                    sumacolumna+=matriz[j][i];
                }
                if(sumafila==diagonal1 && sumacolumna==diagonal2){
                    cont++;
                    sumafila=0;
                    sumacolumna=0;
                }
            }
            if (cont==matriz.length) {
                System.out.println("es magico ");
            }else{
                System.out.println("no es magico ");
            }
        }    
    }
    
}
