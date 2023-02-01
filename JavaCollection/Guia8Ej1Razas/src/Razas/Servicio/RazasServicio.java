/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.Servicio;

import Razas.Entidades.RazasEntidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class RazasServicio {
    Scanner leer= new Scanner(System.in);
   
    
    private List<RazasEntidades> razasPerros ;

    public RazasServicio() {
        this.razasPerros = new ArrayList();
    }
    private void ingresarRazas(){
        RazasEntidades raza = new RazasEntidades();
        System.out.println("ingrese la raza deseada ");
        raza.setRaza(leer.next());
        agregarRaza(raza);
    }
    private void agregarRaza(RazasEntidades r ){
        
        razasPerros.add(r);
        
    }
    private void mostrarArrayList(){
        for (RazasEntidades aux : razasPerros) {
            System.out.println(aux);
        }

    }
    
    public void menu(){
        int opc = 1;
        do {
            ingresarRazas();
            System.out.println("desea ingresar otra raza?");
            System.out.println("1) SI");
            System.out.println("2) NO");
            opc = leer.nextInt();
        } while (opc == 1);
        System.out.println("las razas de perros son " + razasPerros.size());
        mostrarArrayList();
    }
}

