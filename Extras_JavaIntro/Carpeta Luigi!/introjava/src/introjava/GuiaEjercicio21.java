/*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. 
    Para ello se debe verificar si entre todas las submatrices de 3x3 que
    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package introjava;

/**
 *
 * @author LuiG
 */
public class GuiaEjercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizGrande = {{1,26,36,47,5,6,72,81,95,10},
                                 {11,12,13,21,41,22,67,20,10,61},
                                 {58,78,87,90,9,90,17,12,87,67},
                                 {41,87,24,56,97,74,87,42,64,35},
                                 {32,76,79,1,36,5,67,96,12,11},
                                 {99,13,54,88,89,90,75,12,41,76},
                                 {67,78,87,45,14,22,26,42,56,78},
                                 {98,45,34,23,32,56,74,16,19,18},
                                 {24,67,97,46,87,13,67,89,93,24},
                                 {21,68,78,98,90,67,12,41,65,12}};
      
        int [][] matrizPequeña = {{36,5,67},
                                  {89,90,75},
                                  {14,22,26} };
        imprimirMatriz(matrizGrande);
        System.out.println("=================");
        imprimirMatriz(matrizPequeña);
        System.out.println("=================");
        buscarEnMatriz(matrizGrande, matrizPequeña);
        
    }
    
    
    public static void imprimirMatriz(int [][] matriz){
        int longitudMatriz= matriz.length;
        int elemento;
        String longitudElemento;
        String aux ="";
        for (int i = 0; i < longitudMatriz; i++) {
            for (int j = 0; j < longitudMatriz; j++) {
                elemento=matriz[i][j];
                longitudElemento = String.valueOf(elemento);
                elemento = longitudElemento.length();
                if(elemento<2){
                    aux+="0"+matriz[i][j]+" | ";
                }else{
                    aux+=matriz[i][j]+" | ";
                }

            }
            System.out.println(aux);
            aux="";
        }
    }
    
    public static void buscarEnMatriz(int[][]matriz, int [][]matrizBuscada){
        int longitudMatriz= matriz.length;
        int longitudMatrizBuscada=matrizBuscada.length;
        int contador=0;
        int contadorCoincidencias=0;
        int matrizPresente=0;
        
        for (int i = 0; i < longitudMatriz; i++) {
            for (int j = 0; j < longitudMatriz; j++) {
                /*
                System.out.println("valor de el bucle normal "+j); 
                */
                if(matriz[i][j]==matrizBuscada[0][0] && i<7 && j<7){
                    /*
                    System.out.println("concidencia aqui");
                    */
                    for (int k = 0; k < longitudMatrizBuscada; k++) {
                        for (int l = 0; l < longitudMatrizBuscada; l++) {
                            /*Probadores
                            System.out.println("valor i "+i+" valor j "+j);
                            System.out.println("valor k "+k+" valor l "+l);
                            */
                            if(matriz[i][j]== matrizBuscada[k][l]) {
                              contadorCoincidencias+=1;
                              
                            }
                            contador+=1;
                            j++;
                        }
                        j=j-contador;
                        contador=0;
                        i++;
                    }
                    i=i-longitudMatrizBuscada;
                    if(contadorCoincidencias==9){
                        matrizPresente+=1;
                        System.out.println("la matriz Pequeña esta presente en la Grande se Repite "+matrizPresente+" veces e inicia en la posicion "+i+"-"+j);
                    }  
                    contadorCoincidencias=0;
                }
              
                
            }
        }
        
        
    }
    
}
