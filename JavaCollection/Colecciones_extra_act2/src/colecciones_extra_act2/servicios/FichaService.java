/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_extra_act2.servicios;

import java.util.Locale;
import java.util.Scanner;
import colecciones_extra_act2.entidades.Ficha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class FichaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);

    ArrayList<Ficha> listaFicha = new ArrayList<>();

    private Integer vMax = valorMaximo();

    LinkedList<Ficha> mesa = new LinkedList<>();

    private Integer valorMaximo() {

        Integer op;

        do {
            System.out.print("Numero maximo en fichas: ");
            op = leer.nextInt();
            System.out.println("");

            if (op < 1 || op > 5) {
                System.out.println("Error: Ingrese una valor entre 1 y 5");
                System.out.println("");
            } else {
                break;
            }

        } while (true);

        return op;
    }

    private void generarFicha() {

        for (int i = 0; i < (vMax + 1); i++) {
            for (int j = i; j < (vMax + 1); j++) {
                Ficha f1 = new Ficha();
                f1.setN1(i);
                f1.setN2(j);

                listaFicha.add(f1);
            }
        }
    }

    private void girarFicha(Ficha ficha) {
        Integer aux;
        aux = ficha.getN1();
        ficha.setN1(ficha.getN2());
        ficha.setN2(aux);
    }

    private void mostrarFichaMano() {
        System.out.println("Fichas de la Mano");
        mostrarFicha(listaFicha);
    }

    private void mostrarFichaMesa() {

        System.out.println("Fichas de la mesa");

        mostrarFicha(mesa);
    }

    private void mostrarFicha(List<Ficha> lista) {

        for (Ficha ficha : lista) {
            System.out.print(ficha);
        }
        System.out.println("");
        System.out.println("_______________________________________________________________________");
    }

    private void dobleFicha() {

        Iterator<Ficha> it = listaFicha.iterator();

        Ficha f2;

        while (it.hasNext()) {

            f2 = it.next();

            if (f2.getN1() == vMax && f2.getN2() == vMax) {
                mesa.addFirst(f2);
                listaFicha.remove(f2);
                break;
            }

        }

    }

    public void jugar() {
        
        Boolean f;
        
        generarFicha();
        
        dobleFicha();
        
        
        do {
            
            mostrarFichaMano();
            mostrarFichaMesa();
            
        } while (analizarFichas() && !listaFicha.isEmpty());
        
        
        mostrarFichaMano();
        mostrarFichaMesa();

    }

    private Boolean analizarFichas() {
        Boolean b1, b2, b3 = true;

        for (Ficha ficha : listaFicha) {

            b1 = false;
            b2 = false;

            do {

                if (mesa.getFirst().getN1() == ficha.getN2()) {
                    mesa.addFirst(ficha);
                    listaFicha.remove(ficha);
                    b1 = true;
                    break;
                } else if (mesa.getLast().getN2() == ficha.getN1()) {
                    mesa.addLast(ficha);
                    listaFicha.remove(ficha);
                    b1 = true;
                    break;
                }

                if (b1) {
                    break;
                } else {
                    girarFicha(ficha);
                }

                if (b2) {
                    break;
                }

                b2 = true;

            } while (true);

            if (b1) {
                
                break;
                
            } else if (listaFicha.indexOf(ficha) == (listaFicha.size() - 1)) {
                
                b3 = false;
                break;
                
            }

        }
        
        return b3;
        
    }

//    public void removeCountry() {
//        System.out.println("ingrese nombre del país a eliminar");
//        String delete = scan.next();
//        if (countries.contains(delete)) {
//            countries.remove(delete);
//            aux.remove(delete);
//        } else {
//            System.out.println("País no encontrado");
//        }
//    }
}
