/*
  *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
   suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
   permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
   El programa deberá comprobar que los números introducidos son correctos, es decir,
   están entre el 1 y el 9.
 */
package introjava;

import java.sql.Types;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] cuadradoMagico = new int [3][3];
       
        Scanner leer = new Scanner(System.in);
        llenarMatriz(cuadradoMagico);
        imprimirMatriz(cuadradoMagico);
        System.out.println("================");
       //comprobaciones
        if(comprobarFilas(cuadradoMagico)== true){
            System.out.println("las filas suman lo mismo");
        }else{
            System.out.println("las filas no suman lo mismo");
        }
        if(comprobarColumnas(cuadradoMagico)== true){
            System.out.println("las columnas suman lo mismo");
        }else{
            System.out.println("las columnas no suman lo mismo");
        }if(comprobarDiagonales(cuadradoMagico)== true){
            System.out.println("las Diagonales suman lo mismo");
        }else{
            System.out.println("las Diagonales no suman lo mismo");
        }
        System.out.println("================");
        if(comprobarColumnas(cuadradoMagico)==comprobarFilas(cuadradoMagico)&& comprobarColumnas(cuadradoMagico)==comprobarDiagonales(cuadradoMagico)){
            System.out.println("es una matriz magica");
        }else{
            System.out.println("no es una matriz magica");
        }
        
        
        // TODO code application logic here
    }
    
    
    public static void llenarMatriz(int [][] matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.println("ingresa el valor para esta posicion "+ i +"-"+ j);
                matriz[i][j] = leer.nextInt();
                    if (matriz[i][j]>9 || matriz[i][j]<1) {
                        System.out.println("ingresa un numero valido entre 1 a 9");
                    }
                }while(matriz[i][j]>9 || matriz[i][j]<1 );
            }
        }
    }
    
    public static void imprimirMatriz(int [][] matriz){
        String aux = "";
        for(int[] fila:matriz){
            for(int elemento:fila){
                aux += elemento + " | ";
            }
            System.out.println(aux);
            aux="";
        }

    }
    //comprobaciones
    public static boolean comprobarFilas(int [][] matriz){
        
        boolean veredicto;
        int sumaFila1=0;
        int sumaFila2=0;
        int sumaFila3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                switch (i+1){
                    case 1:
                        sumaFila1+= matriz[i][j];
                        break;
                    case 2:
                        sumaFila2+= matriz[i][j];
                        break;
                    case 3:
                        sumaFila3+= matriz[i][j];
                        break;      
                }   
            }
        }
        if (sumaFila1==sumaFila2 && sumaFila1==sumaFila3 && sumaFila2 == sumaFila3) {
            veredicto = true;
        }else{
            veredicto = false;
        }
    return veredicto;       
    }
    
    
    public static boolean comprobarColumnas(int [][] matriz){
        
        boolean veredicto;
        int sumaFila1=0;
        int sumaFila2=0;
        int sumaFila3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 
                switch (i+1){
                    case 1:
                        sumaFila1+= matriz[i][j];
                        break;
                    case 2:
                        sumaFila2+= matriz[i][j];
                        break;
                    case 3:
                        sumaFila3+= matriz[i][j];
                        break;      
                }   
            }
        }
        if (sumaFila1==sumaFila2&&sumaFila1==sumaFila3&&sumaFila2==sumaFila3) {
            veredicto = true;
        }else{
            veredicto = false;
        }
    return veredicto;       
    }
    
    
    public static boolean comprobarDiagonales(int [][] matriz){
        boolean veredicto;
        int diagonalDerecha=0;
        int diagonalIzquierda=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i+j==2){
                    diagonalDerecha += matriz[i][j];
                }
                if(i-j==0){
                    diagonalIzquierda += matriz[i][j];
                }   
            }
        }
        if(diagonalDerecha==diagonalIzquierda){
            veredicto=true;
        }else{
            veredicto=false;
        }
        return veredicto; 
    }
}
