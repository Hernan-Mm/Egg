package servicio;

import entidad.Persona;
import java.util.Locale;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    int edad;
    char sexo;
    double peso, altura;
    
    
    public Persona crearPersona() {
        System.out.println("Ingrese Nombre");
        String nombre = leer.next();
        System.out.println("Ingrese edad");
        edad = leer.nextInt();
        System.out.println("Ingrese sexo");
        sexo = leer.next().toUpperCase().charAt(0);

        while (sexo != 'O' && sexo != 'H' && sexo != 'M') {
            System.out.println("Intente nuevamente");
            sexo = leer.next().toUpperCase().charAt(0);
        }

        System.out.println("Ingrese peso");
        peso = leer.nextFloat();
        System.out.println("Ingrese altura");
        altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double imc;
        int resultado;
        imc = p.getPeso() / (p.getAltura() * p.getAltura());
        if (imc < 20) { 
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorEdad(Persona p) {
        return p.getEdad() > 17;
    }

}
