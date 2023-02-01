/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Robins Z
 */
public class Circunferencia {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);

    /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
    e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).

     */
    private double radio;
    double area;
    double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingresa radio: ");
        setRadio(leer.nextDouble());
    }

    public void area() {

        area = Math.PI * (radio * radio);
    }

    public void perimetro() {
        perimetro = 2 * (Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Circunferencia{" + ", radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
