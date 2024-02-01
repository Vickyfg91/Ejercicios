/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author Victoria
 */
public class Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elevador elevador = new Elevador("Orona", 8, 700.0 );
        boolean moverElevador = elevador.moverAscensor(7, 658, 9);
        System.out.println(elevador.toString());
        System.out.println(moverElevador);
        System.out.println(fechaProximaRevision(elevador));
        
        
       /* boolean moverElevador1 = elevador.moverAscensor(5, 420, 2);
        System.out.println(moverElevador1);
        System.out.println(elevador.toString());
        fechaProximaRevision( elevador);
        //Elevador elevador2 = new Elevador("FAIN", 15, 1000.0 );
       // mostrarFecha(elevador);*/
      
    }
    //Método que dice Elevador
    public static LocalDate fechaProximaRevision(Elevador elevador){
        return elevador.getFechaRevision().plusMonths(6);
    }
    /*public static void mostrarFecha(Elevador elevador){
        System.out.println(fechaProximaRevision(elevador));
    }*/
}
