/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author vicky
 */
public class Ejer1Matrices {

    public static void main(String[] args) {
        /*Realiza un programa que pida al usuario el número de filas y columnas 
        de un array bidimensional de números enteros. El programa crea la matriz 
        con esos tamaños y debe rellenarla solicitando al usuario los valores a 
        introducir. Una vez esté rellena, se debe mostrar la matriz completa y 
        la suma de sus elementos.*/
        
        
        matriz.generarMatrizAleatoria();
        Scanner sc = new Scanner(System.in);

        //Pedir los datos por consola al usuario
        System.out.println("Array bidimensional. Introduzca numero de filas: ");
        int filas = Integer.parseInt(sc.next());
        sc.nextLine();
        System.out.println("Array bidimensional. Inrtroduzca numero de columnas: ");
        int columnas = Integer.parseInt(sc.next());
        sc.nextLine();

        //Matriz
        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz con los datos del usuario
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduzca el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(sc.next());
            }
        }
        // Mostrar la matriz completa
        System.out.println("Matriz completa:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
   /*     // Calcular la suma de los elementos de la matriz
    public int sumaValoresMatriz(int[][] matriz) {

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }*/
    }
}

