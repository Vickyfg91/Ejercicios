/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

import java.util.Random;

/**
 *
 * @author vickyfg
 */
public class CaraOCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] arrayMonedas = generarArrayMonedas(2000000);
        int numCaras = contarCaras(arrayMonedas);
        int numCruces = contarCruces(arrayMonedas);

        System.out.println("Número de caras: " + numCaras);
        System.out.println("Número de cruces: " + numCruces);
    }

    // Método para generar un array de booleanos con caras (true) y cruces (false) aleatorios.
    public static boolean[] generarArrayMonedas(int size) {
        boolean[] array = new boolean[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextBoolean();
        }

        return array;
    }

    // Método para contar el número de caras en el array.
    public static int contarCaras(boolean[] array) {
        int count = 0;
        for (boolean valor : array) {
            if (valor) {
                count++;
            }
        }
        return count;
    }

    // Método para contar el número de cruces en el array.
    public static int contarCruces(boolean[] array) {
        int count = 0;
        for (boolean valor : array) {
            if (!valor) {
                count++;
            }
        }
        return count;
    }
}
