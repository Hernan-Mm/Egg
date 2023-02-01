/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pais;
import Utilidades.Comparadores;
import java.util.Comparator;
import java.util.HashSet;

import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author LuiG
 */
public class PaisServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> listaPaises = new HashSet();
    TreeSet<Pais> listaPaisesTree = new TreeSet(Comparadores.ordenarNombre);
    
    
   


    private Pais crearPais(){
        
        System.out.println("ingresa el nombre de pais");
        String aux = leer.next();
        return new Pais(aux);
    }
    
    public void llenarLista(){
        int opcion = 1;
        do {
            
            Pais aux = crearPais();
            listaPaises.add(aux.getNombre());
            listaPaisesTree.add(aux); 
            System.out.println("deseas continuar presiona 1 si no 2");
            opcion = leer.nextInt();
        } while (opcion==1);
       
    }
    
    
    
    public void mostrarHashLista(){
        for (String aux : listaPaises) {
            System.out.println(aux);
        }
    
    }
    
    public void mostrarTreeLista(){
       for (Pais aux : listaPaisesTree) {
            System.out.println(aux);
        }
    
    }
    
    public void eliminarElemento(){
        System.out.println("ingresa el pais a eliminar");
        String aux = leer.next();
         if (listaPaises.contains(aux)) {
                listaPaises.remove(aux);
                System.out.println("pais encontrado se elimino "+ aux);
         }else{
             System.out.println("pais no encontrado");
         
         }
        
    
    }
    
}


