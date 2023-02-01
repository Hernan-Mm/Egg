/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioRaza;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Robins Zuñiga
 */
public class ServiceRaza {

    Scanner sc = new Scanner(System.in, "UTF-8").useDelimiter("\n");
    Raza r = new Raza();

    List<Raza> raza = new ArrayList<Raza>();

    public Raza ingresarRaza() {

        System.out.println("Escriba la raza: ");
        String aux = sc.next();

        return new Raza(aux);
    }

    public void generaRaza() {
        System.out.println("Cantidad a ingresar de razas: ");
        int n = sc.nextInt(), i;
        for (i = 0; i < n; i++) {
            raza.add(ingresarRaza());
        }

    }
    
    public void mostrarRaza(){
        for (Raza aux : raza) {
            System.out.println(aux.getRaza());
            
        }
    }

}
