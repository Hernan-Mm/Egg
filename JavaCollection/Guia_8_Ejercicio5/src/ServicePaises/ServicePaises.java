/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePaises;

import Entidad.Pais;
import Entidad.UtilidadesPais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * 
 */
public class ServicePaises {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    TreeSet<Pais> listaPais = new TreeSet(UtilidadesPais.ordenar);
    
    
    
// CREANDO PAISES 
    public Pais crearPaises(){
        System.out.println("Ingrese pais: ");
        String aux = leer.next().toLowerCase();
        return new Pais(aux);     
    }

// AGREGANDO PAIS
    public void agregarPais() {
        int opc;
        do {
            Pais aux = crearPaises();
            listaPais.add(aux);
            
            System.out.println("Agregar otro país; 1:si , 2:no ");
            opc = leer.nextInt();
            
        } while (opc == 1);
           
    }
   
//MOSTRANDO PAISES  
  public void mostrarPais() {
        System.out.println("\nPaises ordenado alfabeticamente: ");
        for (Pais lp : listaPais) {
            System.out.println(lp.toString());
        }
    }
// BORRAR PAISES 
    public void borrarPais() {
        String opc;
        do {
            System.out.println("\nQue pais quiere eliminar? ");
            String aux = leer.next();
            Pais paisEliminar = new Pais(aux);
            if (!listaPais.remove(paisEliminar)) {
                System.out.println("No se encontro el pais con el nombre ingresado");
            } else {
                System.out.println("El pais ha sido eliminado con exito");
            }
            System.out.println("Deseas eliminar pais. S/N");
            opc = leer.next();
        } while (!"N".equalsIgnoreCase(opc));

    }

    public void mostrarPais2() {
        System.out.println("\nPaises ordenado alfabeticamente: ");
        for (Pais lp : listaPais) {
            System.out.println(lp.toString());
        }
    }

}
  

    

