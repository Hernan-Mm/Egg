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
public class Ejer18JavaIntro {
public static Random random = new Random();
public static Scanner leer = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
         traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
         cambiando sus filas por columnas (o viceversa).*/
       
       
        int n;
        int m;
        
        
        System.out.println("Ingresar Tamño Matriz");
        n=leer.nextInt();
        m=n;
        
        int [][] mat= new int [n][m];
        int [][] matB= new int [n][m];
        rellenar(n, m, mat);
        mostra(n, m, mat);
        trans(n, m, mat, matB);
        System.out.println("La matriz traspuesta es: ");
        for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) 
              {System.out.print("[" + matB[i][j]+"]");
                  
                  
              }
              System.out.println("");
          }
        
    }
      public static void rellenar (int n,int m , int[][]mat){
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              // mat[i][j] = leer.nextInt();
                mat[i][j] = random.nextInt(10); 
            }
           
              
            
        }
        
     }
      
      public static void mostra(int n,int m , int[][]mat){
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) 
              {
                  System.out.print("[" + mat[i][j]+"]");
                  
              }
              System.out.println("");
          }
      }
      public static void trans(int n,int m , int[][]mat,int[][]matB){
           for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) 
              matB[i][j]=mat[j][i];
                  
                  
              }
              
          }
          
          
      }
    

