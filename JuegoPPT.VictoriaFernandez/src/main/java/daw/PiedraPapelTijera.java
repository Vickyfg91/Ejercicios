/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vickyfg
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implementar el juego PiedraPapelTijera comienza con un menú con JOptionPane 
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        int puntosJugador = 0;
        int puntosMaquina = 0;
        int eleccionParseada;

        String menu = """    
                                        JUEGO PIEDRA PAPEL TIJERA
                            -----------------------------------------------
                                         Elige una opcioń (1,2,3)
                        
                         1.- Juego de dos jugadores
                         2.- Juego de un jugador contra la máquina
                         3.- Salir
                      
                     """;

        //Bucle para repetir el programa
        do {
            //recogemos la respuesta del usuario
            do {

                String eleccion = JOptionPane.showInputDialog(menu);
                eleccionParseada = Integer.parseInt(eleccion);
                try {
                    break;//si esta bien continua
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Parametro incorrecto, repite elección");
                }
            } while (eleccionParseada != 1 || eleccionParseada != 2 || eleccionParseada != 3);

            switch (eleccionParseada) {//eleccion usuario programa que quiere
                case 3 -> {
                    break;
                }
                case 2 -> {
                    System.out.println("Juega contra la Máquina. Introduce tu nombre: ");
                    String jugador = sc.next();
                    sc.nextLine();

                    for (int i = 1; i < 6; i++) {
                        String eleccionJugador;
                        String eleccionMaquina;
                        int rmEleccion = rm.nextInt(3);
                        switch (rmEleccion) {
                            case 0 ->
                                eleccionMaquina = "PIEDRA";
                            case 1 ->
                                eleccionMaquina = "PAPEL";
                            default ->
                                eleccionMaquina = "TIJERA";
                        }

                        System.out.println("Introduce tu elección: "
                                + "(PIEDRA; PAPEL; TIJERA)" + eleccionMaquina);
                        eleccionJugador = sc.nextLine();
                        

                        if (!((eleccionJugador.equalsIgnoreCase("PIEDRA")
                                || eleccionJugador.equalsIgnoreCase("PAPEL")
                                || eleccionJugador.equalsIgnoreCase("TIJERA")))) {
                            System.out.println("Tu elección no es correcta, reescribela.");

                        }
                        if ((eleccionJugador.equals("PIEDRA")
                                && eleccionMaquina.equals("TIJERA"))
                                || (eleccionJugador.equals("PAPEL")
                                && eleccionMaquina.equals("PIEDRA"))
                                || (eleccionJugador.equals("TIJERA")
                                && eleccionMaquina.equals("PAPEL"))) {
                            puntosJugador++;
                            System.out.println(jugador + " ha elegido "
                                    + eleccionJugador + ", la Máquina ha elegido "
                                    + eleccionJugador + ".\n" + jugador
                                    + " gana la ronda. Llevas " + i + " rondas");
                        } else if ((eleccionMaquina.equals("PIEDRA")
                                && eleccionJugador.equals("TIJERA"))
                                || (eleccionMaquina.equals("PAPEL")
                                && eleccionJugador.equals("PIEDRA"))
                                || (eleccionMaquina.equals("TIJERA")
                                && eleccionJugador.equals("PAPEL"))) {
                            puntosMaquina++;
                            System.out.println("La Máquina ha elegido "
                                    + eleccionMaquina + " y " + jugador
                                    + " ha elegido "
                                    + eleccionJugador + " .\n La Máquina "
                                    + "gana la ronda. Llevas " + i + " rondas");
                        } else if (eleccionJugador.equals(eleccionMaquina)) {
                            System.out.println("Empate en esta ronda."
                                    + "Llevas " + --i + "rondas");// Restar 1 al contador si la elección del jugador es incorrecta                                                                  
                        }
                        
                        
                        }
                    if (puntosJugador > puntosMaquina) {
                            System.out.println("El ganador es " + jugador);
                        } else if (puntosMaquina > puntosJugador) {
                            System.out.println("Te gana la Máquina");
                        } else if ((puntosJugador == puntosMaquina)) {
                            System.out.println("Empataste!");
                    }
                }
                case 1 -> {
                    String eleccionJugador1;
                    String eleccionJugador2;
                    System.out.println("Introduzca el nombre del jugador 1: ");
                    String jugador1 = sc.next();
                    sc.nextLine();
                    System.out.println("Introduzca el nombre del jugador 2: ");
                    String jugador2 = sc.next();
                    sc.nextLine();
                    for (int i = 1; i < 6; i++) {
                        if (rm.nextBoolean()) {
                            System.out.println("Introduzca elección " + jugador1
                                    + "(PIEDRA; PAPEL; TIJERA)");
                            eleccionJugador1 = sc.next();
                            sc.nextLine();
                            System.out.println("Introduzca elección " + jugador2
                                    + "(PIEDRA; PAPEL; TIJERA)");
                            eleccionJugador2 = sc.next();
                            sc.nextLine();
                        } else {
                            System.out.println("Introduzca elección " + jugador2
                                    + "(PIEDRA; PAPEL; TIJERA)");
                            eleccionJugador2 = sc.next();
                            sc.nextLine();
                            System.out.println("Introduzca elección " + jugador1
                                    + "(PIEDRA; PAPEL; TIJERA)");
                            eleccionJugador1 = sc.next();
                            sc.nextLine();
                        }
                        if (!(eleccionJugador1.equalsIgnoreCase("PIEDRA")
                                || eleccionJugador1.equalsIgnoreCase("PAPEL")
                                || eleccionJugador1.equalsIgnoreCase("TIJERA"))) {
                            System.out.println("La elección de " + jugador1
                                    + " no es correcta, reinicie.");
                        } else if (!(eleccionJugador2.equalsIgnoreCase("PIEDRA")
                                || eleccionJugador2.equalsIgnoreCase("PAPEL")
                                || eleccionJugador2.equalsIgnoreCase("TIJERA"))) {
                            System.out.println("La elección de " + jugador2
                                    + " no es correcta, reinicie.");
                        } else {
                            if (eleccionJugador1.equals(eleccionJugador2)) {
                                System.out.println("Empate en esta ronda.");
                            } else if ((eleccionJugador1.equals("PIEDRA")
                                    && eleccionJugador2.equals("TIJERA"))
                                    || (eleccionJugador1.equals("PAPEL")
                                    && eleccionJugador2.equals("PIEDRA"))
                                    || (eleccionJugador1.equals("TIJERA")
                                    && eleccionJugador2.equals("PAPEL"))) {
                                puntosJugador1++;
                                System.out.println(jugador1 + " ha elegido "
                                        + eleccionJugador1 + ", " + jugador2 + " ha elegido "
                                        + eleccionJugador2 + ".\n" + jugador1
                                        + " Gana la ronda. Llevas " + i + " rondas");
                            } else {
                                puntosJugador2++;
                                System.out.println(jugador1 + " ha elegido "
                                        + eleccionJugador1 + ", " + jugador2 + " ha elegido "
                                        + eleccionJugador2 + ".\n" + jugador2
                                        + " Gana la ronda. Llevas " + i + " rondas");
                            }
                        }
                    }
                    if (puntosJugador1 > puntosJugador2) {
                        System.out.println("El ganador es " + jugador1);
                    } else if (puntosJugador2 > puntosJugador1) {
                        System.out.println("El ganador es " + jugador2);
                    } else if ((puntosJugador1 == puntosJugador2)) {
                        System.out.println("Empate!");
                    }
                }
                default -> {
                    break;
                }
            }

        } while (eleccionParseada != 3);
    }
}
