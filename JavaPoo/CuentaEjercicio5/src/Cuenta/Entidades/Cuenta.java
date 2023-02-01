/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta.Entidades;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;


    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

   /* public void crearCuenta() {
        
        System.out.println("ingrese un numero de cuenta");
        setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su numero de DNI");
        setDNI(leer.nextInt());
    }
    public void ingresarDinero(){
        System.out.println("Cuanto dinero desea ingresar?");
        Double ingreso = leer.nextDouble();
        String validar;
        if (ingreso > 0) {
            System.out.println("esta seguro que desea ingresar $" + ingreso + "a su cuenta? (si/no)");
            validar = leer.next();
            if ( validar == "si" ) {
                saldoActual+= ingreso;
            System.out.println("Se ingreso el dinero correctamente! su saldo actual es : " + saldoActual);

            }
             } else{
            System.out.println("el valor ingresado es incorrecto");
        }
    }
    public void retirarDinero(){
        System.out.println("Cuanto dinero desea retirar?");
        Double retiro = leer.nextDouble();
        String validar;
        if (retiro > saldoActual) {
        saldoActual=0;
        }else{
            saldoActual-= retiro;
            System.out.println("se retiro el dinero correctamente! su saldo actual es : "+ saldoActual);
        }
    }
    public void extraccionRapida(){
        System.out.println("cuanto dinero quiere retirar?");
        Double retiro = leer.nextDouble();
        if (retiro < (saldoActual*0.20)) {
            System.out.println("Extraccion rapida exitosa");
        }else{
            System.out.println("el valor a extraer es mayor al 20% de su saldo actual. Saldo actual : " + saldoActual);
        }
    }
    public void consultarSaldo(){
        System.out.println("su saldo actual es : " + saldoActual);
    }
    public void consultarDatos(){
        System.out.println("los datos de su cuenta son:");
        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("numero de DNI: " + DNI);
    }
*/

}
