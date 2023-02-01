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
public class Ejer17GuiaJavaIntro {
    public static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        //de 2 dígitos, etcétera (hasta 5 dígitos).
        int n;
        
        
        System.out.println("Ingresar tama�o del vector");
        n = leer.nextInt();
        int v[]= new int [n];
        rellenar(n, v);
        numero(n, v);
        
        
    }
    public static void rellenar (int n , int[]v){
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            v[i] = random.nextInt(10000);
              
            
        }
        
     }
    public static void numero (int n , int[]v){
        String nc  ;
        int el = 0;
        int [] r = new int[5];
         for (int i = 0; i < n; i++) {
             el=v[i];
             nc=String.valueOf(el);
            el = nc.length();
             switch(el){
                 case 1:
                         r[0]=r[0]+1;
                         break;
                 case 2:
                         r[1]=r[1]+1;
                         break;
                 case 3:
                         r[2]=r[2]+1;
                         break;        
                 case 4:
                         r[3]=r[3]+1;
                         break;  
                 case 5:
                         r[4]=r[4]+1;
                         break;        
          
             }
           
         }
         
        System.out.println("Se encontratos "+r[0]+" numeros de 1 digito"); 
        System.out.println("Se encontratos "+r[1]+" numeros de 2 digito");    
        System.out.println("Se encontratos "+r[2]+" numeros de 3 digito");    
        System.out.println("Se encontratos "+r[3]+" numeros de 4 digito");    
        System.out.println("Se encontratos "+r[4]+" numeros de 5 digito");  
        
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
              
            
        }
        
        
    }
    }

   
    

