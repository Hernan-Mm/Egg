/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuiG
 */
public class Ejercicio21 {

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
      
        int [][] matrizPequena = {{36,5,67},
                                  {89,90,75},
                                  {14,22,26} };
        imprimirMatriz(matrizGrande);
        System.out.println("=================");
        imprimirMatriz(matrizPequena);
        System.out.println("=================");
        buscarMatriz(matrizGrande, matrizPequena);
        
        
        
    }
    public static void buscarMatriz(int[][]matrizgrande,int[][]matrizpequena) {
        int longitudMatrizGrande=matrizgrande.length;
        int contador=0;
        for (int i = 0; i < longitudMatrizGrande; i++) {
            for (int j = 0; j < longitudMatrizGrande; j++) {
                   if(matrizgrande[i][j]==matrizpequena[0][0]){
                       for (int k = 0; k <3; k++) {
                           for (int l = 0; l <3; l++) {
                               if (matrizgrande[i+k][j+l]==matrizpequena[k][l]) {
                               contador++;
                               } 
                           }
                       }
                       
                       if (contador==9) {
                           System.out.println("el primer elemento de coincidencia de la matriz se encuentra en la fila "+(i+1)+" columa "+(j+1));
                       }
                       contador=0;
                       
                   }
            }
            
        }
        
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
    
}
