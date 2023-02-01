/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_intro_SubPro_Matri_Vecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer21GuiaJavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/
        
        int[][]mM = new int [10][10];
        int[][]mP = new int [3][3];
        rellenarmM(mM, mP);
        rellenarmP(mM, mP);
        cheque(mM, mP);
    }
    public static void rellenarmM (int[][]mM, int [][]mP){
        
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mM[i][j]=ran.nextInt(99);
                
            }
            
        }
    }
    public static void rellenarmP(int[][]mM, int [][]mP){
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + mM[i][j]+"]");
                
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println("Ingresar Numero de la posicion: "+"["+i+"]"+"["+j+"]");    
              mP[i][j]= Sc.nextInt();
            }
         }
    }   
    
    public static void cheque (int[][]mM, int [][]mP){
         int c= 0;
        int a=0;
        int b=0;
        for (int i = 0; i < 7; i++) {
           
             for (int j = 0; j < 7; j++) {
                if(mM[i][j]==mP[0][0]){
                  a=i;
                  b=j;
                }
             }
             }
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (mM[a+k][b+l]==mP[k][l]){
                              
                            c++;
                            
                    }else{
                                c=0;
                            }
                  
                
                    
                
            }
            
        }
        if(c==9){
            System.out.println("Se encontro la sub Matriz");
            
           }else{
            System.out.println("No se encontro");
        }
        
    }
    
}