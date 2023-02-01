/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import Entidad.Nacionalidad;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LuiG
 */
public class AlumnoServicio {
    
    ArrayList<Alumno> listaAlumnos = new ArrayList(); 
    
    public void cargarAlumnosParametro(){
        listaAlumnos.add(new Alumno("Pablo", "Brescasin", LocalDate.of(1983, 2, 2), Nacionalidad.ARGENTINA));
    
    }
    
    
    public void fabricaAlumnos(){
        
        for (int i = 0; i < 20; i++) {
            Random aux = new Random();
             listaAlumnos.add(new Alumno("Pablo "+i, "Brescasin", LocalDate.of(1983+i, 2, 2+i),asignarNacionalidad(aux.nextInt(3)) ));
        }
    
    }
    
    private Nacionalidad asignarNacionalidad(int valor){
        Nacionalidad aux=null;
        switch (valor) {
            case 0:
                aux = Nacionalidad.ARGENTINA;
                break;
            case 1:
                aux = Nacionalidad.CHILE;
                break;
            case 2:
                aux = Nacionalidad.VENEZUELA;
                break;
           
        }
       return aux;
    }
    
    public void mostrarLista(){
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    
    }
}
