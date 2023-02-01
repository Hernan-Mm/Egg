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
public class Ejer19GuiaJavaIntro {
     public static Scanner leer = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        // public static Random random = new Random();
   
    /**
     * @param args the command line arguments
     */
   
        
        
       
       
        int n;
        int m;
        
        
        System.out.println("Ingresar TamÃ±o Matriz");
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
        
        System.out.println("la matriz es anti " +esMatrizAntisimetrica(mat) );
        
    }
      public static void rellenar (int n,int m , int[][]mat){
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresar n");
                mat[i][j] = leer.nextInt();
               // mat[i][j] = random.nextInt(10); 
            }
           
              
            
        }
        
     }
      
      public static void mostra(int n,int m , int[][]mat){
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) 
              {System.out.print("[" + mat[i][j]+"]");
                  
                  
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
      public static boolean esMatrizAntisimetrica(int[][] mat) {

       
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != -mat[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    }
    

