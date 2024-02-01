/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class Autobus {

    public static void main(String[] args) {

        // Definir el autobús con 4 asientos por fila y 12 filas
        boolean[][] asientos = new boolean[12][4];

        // Inicializar todos los asientos como libres
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                asientos[i][j] = false;
            }
        }

        // Mostrar el estado inicial de los asientos
        mostrarEstadoAsientos(asientos);

        // Reservar un asiento
        reservarAsiento(asientos);

        // Mostrar el estado actualizado de los asientos
        mostrarEstadoAsientos(asientos);
    }

    // Método para mostrar el estado de los asientos
    public static void mostrarEstadoAsientos(boolean[][] asientos) {
        System.out.println("Estado actual de los asientos:");

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (asientos[i][j]) {
                    // Asiento reservado
                    System.out.print("R "); 
                } else {
                    // Asiento libre
                    System.out.print("L "); 
                }
            }
            System.out.println(); 
        }

        System.out.println();
    }

    // Método para reservar un asiento
    public static void reservarAsiento(boolean[][] asientos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fila del asiento (1-12):");
        int fila = scanner.nextInt() - 1; 

        System.out.println("Número del asiento (1-4):");
        int numeroAsiento = scanner.nextInt() - 1; 

        if (fila >= 0 && fila < 12 && numeroAsiento >= 0 && numeroAsiento < 4) {
            if (!asientos[fila][numeroAsiento]) {
                asientos[fila][numeroAsiento] = true;
                System.out.println("Asiento reservado con éxito.");
            } else {
                System.out.println("Este asiento ya está reservado. Prueba otro.");
            }
        } else {
            System.out.println("No valido. Asegúrate que pones los números de fila y asiento correctos.");
        }
    }
}
