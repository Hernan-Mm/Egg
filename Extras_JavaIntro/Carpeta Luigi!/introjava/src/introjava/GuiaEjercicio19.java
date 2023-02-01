/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package introjava;
import  java.util.Scanner;
/**
 *
 * @author LuiG
 */
public class GuiaEjercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizNormal = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] transpuesta = new int [3][3];
        imprimirMatriz(matrizNormal);
        System.out.println("======================");
        transponerMatriz(matrizNormal, transpuesta);
        System.out.println("======================");
        imprimirMatriz(transpuesta);
        System.out.println("======================");
        if(comprobarAT(matrizNormal, transpuesta)){
            System.out.println("las Matrizes son Anti-Simetricas");
            
        }else{
            System.out.println("las Matrizes no son Anti-simetricas");
        }
            
        
    }
    
    public static void imprimirMatriz(int [][]matriz){
        int longitud = matriz.length;
        String aux="";
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j< longitud; j++) {
                aux+= matriz[i][j] + " | ";
              
            }
            System.out.println(aux);
            aux="";
        }
    
    }
    
    public static void transponerMatriz(int [][] matriz,int [][] matrizTranspuesta){
        int longitud = matriz.length;
        
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matrizTranspuesta[i][j] = -matriz[j][i];
            }
            
        }
  
    }
    
    public static boolean comprobarAT(int [][]matriz, int [][]matriz2){
        int longitud = matriz.length;
        int contador = 0;
        boolean veredicto=false;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                if( matriz[i][j]== -matriz2[i][j]){
                    contador+=1;
                }
            }
        }
        
        if(contador != longitud){
            veredicto=false;
        }else{
            veredicto=true;
        }
        return veredicto;
    } 

}
