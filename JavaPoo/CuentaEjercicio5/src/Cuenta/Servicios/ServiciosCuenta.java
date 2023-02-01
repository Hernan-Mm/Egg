/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta.Servicios;

import Cuenta.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);
    Cuenta Ec = new Cuenta();

    public void crearCuenta() {

        System.out.println("ingrese un numero de cuenta");
        Ec.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su numero de DNI");
        Ec.setDNI(leer.nextInt());
    }

    public void ingresarDinero() {
        System.out.println("Cuanto dinero desea ingresar?");
        int ingreso = leer.nextInt();
         int suma = Ec.getSaldoActual()+ingreso;
                Ec.setSaldoActual(suma);
                System.out.println("Se ingreso el dinero correctamente! su saldo actual es : " + Ec.getSaldoActual());
    }

    public void retirarDinero() {
        System.out.println("Cuanto dinero desea retirar?");
        
        int retiro = leer.nextInt();
        if (retiro > Ec.getSaldoActual()) {
            Ec.setSaldoActual(0);
        } else {
            int resta = Ec.getSaldoActual()-retiro;
            Ec.setSaldoActual(resta);
            System.out.println("se retiro el dinero correctamente! su saldo actual es : " + Ec.getSaldoActual());
        }
    }

    public void extraccionRapida() {
        System.out.println("cuanto dinero quiere retirar?");
        int retiro = leer.nextInt();
        if (retiro <= (Ec.getSaldoActual() * 0.20)) {
            System.out.println("Extraccion rapida exitosa");
        } else {
            System.out.println("el valor a extraer es mayor al 20% de su saldo actual. Saldo actual : " + Ec.getSaldoActual());
        }
    }

    public void consultarSaldo() {
        System.out.println("su saldo actual es : " + Ec.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("los datos de su cuenta son:");
        System.out.println("numero de cuenta: " + Ec.getNumeroCuenta());
        System.out.println("numero de DNI: " + Ec.getDNI());
    }

    public void menu() {

        System.out.println("Bienvenido al banco Santander Rio");
        System.out.println("_________________________________");
        crearCuenta();
        int opc = 0;
        do {
            System.out.println("       Ingrese una opcion      ");
            System.out.println("       1) Ingresar dinero      ");
            System.out.println("       2) retirar dinero       ");
            System.out.println("       3) extraccion rapida    ");
            System.out.println("       4) mostrar saldo        ");
            System.out.println("       5) mostrar datos        ");
            System.out.println("       6) salir                ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ingresarDinero();
                    continue;
                case 2:
                    retirarDinero();
                    continue;
                case 3:
                    extraccionRapida();
                    continue;
                case 4:
                    consultarSaldo();
                    continue;
                case 5:
                    consultarDatos();
                    continue;
            }
        } while (opc != 6);
    }
}
