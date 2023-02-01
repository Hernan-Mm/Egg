/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 *
 */
public class Cadena {

    private String frase;
    private int fraseLongitud;

    public Cadena() {
    }

    public Cadena(String frase, int fraseLongitud) {
        this.frase = frase;
        this.fraseLongitud = fraseLongitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        setFraseLongitud(frase.length());
    }

    public int getFraseLongitud() {
        return fraseLongitud;
    }

    public void setFraseLongitud(int fraseLongitud) {
        this.fraseLongitud = fraseLongitud;
    }

    public int mostrarVocales() {
        int cantidadVocales = 0;
        for (int i = 0; i < fraseLongitud; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public void invertirFrase() {

        for (int i = fraseLongitud - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }

    public int vecesRepetido(char letra) {

        int contador = 0;
        for (int i = 0; i < fraseLongitud; i++) {
            if (letra == frase.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLongitud(String fraseNueva) {

        if (fraseLongitud == fraseNueva.length()) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    public void unirFrases(String fraseNueva) {
        System.out.println(frase + " " + fraseNueva);
    }

    public void reemplazar(char letra) {
        String nuevaFrase = "";
        for (int i = 0; i < fraseLongitud; i++) {
            if (frase.charAt(i) == 'a') {
                nuevaFrase += letra;
            } else {
                nuevaFrase += frase.charAt(i);
            }
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(char letra) {
        for (int i = 0; i < fraseLongitud; i++) {
            if (frase.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }

}
