package e7_escuela;

import entidad.Persona;
import servicio.PersonaServicio;

public class E7_Escuela {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        
    //Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
    //los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
    //sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
    //mayor de edad.
        Persona p1=ps.crearPersona();
        Persona p2=ps.crearPersona();
        Persona p3=ps.crearPersona();
//        Persona p4=ps.crearPersona();
        
        int [] pesos = new int[3];
        boolean [] edades = new boolean[3];
        
        System.out.println(ps.calcularIMC(p1));
        pesos[0] = ps.calcularIMC(p1);
        System.out.println(ps.esMayorEdad(p1));
        edades[0] = ps.esMayorEdad(p1);
        
        System.out.println(ps.calcularIMC(p2));
        System.out.println(ps.esMayorEdad(p2));
        pesos[1] = ps.calcularIMC(p2);
        edades[1] = ps.esMayorEdad(p2);
        
        System.out.println(ps.calcularIMC(p3));
        System.out.println(ps.esMayorEdad(p3));
        pesos[2] = ps.calcularIMC(p3);
        edades[2] = ps.esMayorEdad(p3);
        
//        System.out.println(ps.calcularIMC(p4));
//        System.out.println(ps.esMayorEdad(p4));
//        pesos[3] = ps.calcularIMC(p4);
//        edades[3] = ps.esMayorEdad(p4);

    //Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
    //distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
    //cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
    //también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
    
        //CONTADORES    
        int debajo = 0;
        int ideal = 0;
        int encima = 0;
        
        int mayores = 0;
        int menores = 0;
        
        for (int i = 0; i < 3; i++) {
            if (pesos[i] == -1) {
                debajo++;
            }else if (pesos[i] == 0) {
                ideal++;
            }else if (pesos[i] == 1) {
                encima++;
            }
            
            if (edades[i] == true) {
                mayores++;
            }else if (edades[i] == false) {
                menores++;
            }
        }
        
        System.out.println("Promedio de pesos de las personas");
        System.out.println("Por debajo del promedio: "+ debajo*100/3 + "%");
        System.out.println("En el peso ideal : "+ ideal*100/3 + "%");
        System.out.println("Por encima del promedio: "+ encima*100/3 + "%");
        
        System.out.println("Promedio de edades");
        System.out.println("Mayores: "+mayores*100/3 + "%");
        System.out.println("Menores: "+menores*100/3 + "%");
        
    }
    
}
