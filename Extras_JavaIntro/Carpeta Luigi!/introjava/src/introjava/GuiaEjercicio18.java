/*
 
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package introjava;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [4][4];
        llenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("======================");
        imprimirMatrizTranspuesta(matriz);
        
    }
    public static void llenarMatriz(int[][] matriz){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz [i][j] = (int)(Math.random()*10);
                
            }
        }
    }
    
    public static void imprimirMatriz(int [][] matriz){
        String aux="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux +=  matriz[i][j]+"|";
            }
            System.out.println(aux);
            aux="";
        }
          
    }
    
      public static void imprimirMatrizTranspuesta(int [][] matriz){
        String aux="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux +=  matriz[j][i]+"|";
            }
            System.out.println(aux);
            aux="";
        }
          
    }
    
}
