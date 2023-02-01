
import Servicio.AlumnoServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LuiG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicio servicio = new AlumnoServicio();
        servicio.fabricaAlumnos();
        servicio.mostrarLista();
        // TODO code application logic here
    }
    
}
