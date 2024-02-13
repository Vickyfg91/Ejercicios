/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Eje13224;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author vickyfg
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Trabajador> lista = new ArrayList();
        //lista.add(new Trabajador ("Maria", "123"));
        lista.add(new Enfermera( "Estepona", "Marta", "123"));
        lista.add(new Policia("E1d2", "Juan", "777"));
        
        for (Trabajador trabajador : lista){
        
            trabajador.cotizar();
        }
        
        Set<CursoReciclaje> hacenCursos= new HashSet();
        hacenCursos.add(new Policia());
        hacenCursos.add(new Profesor());
        
        for (CursoReciclaje hacenCurso : hacenCursos){
            hacenCurso.hacerCurso(300);
            if (hacenCurso instanceof Policia){
                ((Policia)hacenCurso).ponerDenuncia();
            }
        }
    }
    
}
