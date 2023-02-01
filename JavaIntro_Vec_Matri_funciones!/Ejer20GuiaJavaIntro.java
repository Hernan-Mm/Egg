/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_intro_SubPro_Matri_Vecto;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejer20GuiaJavaIntro {
    public static Scanner Sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
        
        int n,m;
        
        System.out.println("Ingresar el tamaño del cubo");
        n = Sc.nextInt();
        m=n;
        int[][] mat = new int [n][m];
        rellenar(mat, n, m);
        esMagico(mat, n, m);
        
    
    
    }
    public static void rellenar (int[][] mat,int n,int m ){
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresar Numero de la posicion: "+"["+i+"]"+"["+j+"]");
                mat[i][j]=Sc.nextInt();
                
            }
            
        }
            
        }
        
     public static void esMagico (int[][] mat,int n,int m ){
         int sum1=0;
         int sum2=0;
         int dp=0;
         int ds=0;
         int c = 0;
         int[] v1 = new int [n];
         int[] v2 = new int [n];
         
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 v1[i]= v1[i] + mat[i][j];
                 v2[i]= v2[i] + mat[i][j];
               if(i==j) {
                   dp=dp+mat[i][j];
               } 
               if(i+j==n-1){
                 ds=ds+mat[i][j];
               }
                 
             }
         }
             for (int j = 0; j < n; j++) {
                 sum1=sum1+v1[j];
                 sum2=sum2+v2[j];
                 
             }
             
             
           for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) 
              {System.out.print("[" + mat[i][j]+"]");
                  
                  
              }
              System.out.println("");
          }
           if(sum1==sum2 && dp==ds){
                 System.out.println("La Matriz es magica");
             }else{
                 System.out.println("La Matriz no es magica");
             }
         
    }
    
    
     
}
