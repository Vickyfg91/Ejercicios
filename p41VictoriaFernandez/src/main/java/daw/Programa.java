/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author vickyfg
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] opcionesMenu = {"1-. Crear cita por defecto y anular",
            "2-. Usuario crea la cita",
            "3-. Cita por defecto, modificar fecha",
            "4-. Salir",};
        JOptionPane.showMessageDialog(null, opcionesMenu);
        String opcionElegida;
        boolean continuar = true;
        
        
        do {
        
        opcionElegida = (String) JOptionPane.showInputDialog(null,
                "Elige una opción", "Opciones de creación de cita",
                JOptionPane.QUESTION_MESSAGE, null,
                opcionesMenu, "1-. Crear cita por defecto y anular");
        switch (opcionElegida) {
            case "1-. Crear cita por defecto y anular" -> {
                 Cita cita = new Cita( );
                 
            break;
        }
            
            case "2-. Comprobar formato de fecha" -> {
                break;
            }
            case "3-. Cita por defecto, modificar fecha"-> {
                
            break;
            }
            default -> {
                continuar = false;
            }
            }
        
        
        } while(continuar);


        }
}
