
import Servicio.PaisServicio;

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
        
        PaisServicio servicio = new PaisServicio();
        
        servicio.llenarLista();
        servicio.mostrarHashLista();
        System.out.println("sdfsdfsdfsdf");
        // servicio.mostrarTreeLista();
        
        servicio.eliminarElemento();
        servicio.mostrarHashLista();
        // TODO code application logic here
    }
    
}
