/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class Ayudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*Pedir al usuario un número de animales que van a ser evaluados en el 
        veterinario. De cada animal vamos a guardar su peso, que vamos a pedir 
        por teclado. Una vez sepamos los pesos de todos los animales, queremos 
        saber la media de todos los pesos, cuantos animales hay por debajo de 
        la media y cuantos por encima. Si el usuarioDeAnimales pone un peso negativo 
        se considerará positivo*/
        Scanner sc = new Scanner(System.in);

        public static void numeroDeAnimales(String []arg){
        // Pedir al usuario el número de animales
        
        System.out.print("Ingrese el número de animales a evaluar: ");
        int numeroAnimales = sc.nextInt();

        if (numeroAnimales <= 0) {
            System.out.println("El número de animales debe ser positivo.");
            return;
        }
        }

        // Variables para calcular la suma de pesos y contar animales
        double sumaPesos = 0;
        int animalesPorDebajoDeLaMedia = 0;
        int animalesPorEncimaDeLaMedia = 0;

        // Pedir al usuario los pesos de los animales
        for (int i = 1; i <= numeroAnimales; i++) {
            System.out.print("Ingrese el peso del animal " + i + ": ");
            double peso = sc.nextDouble();

            // Si el peso es negativo, convertirlo a positivo
            if (peso < 0) {
                peso = -peso;
            }
            sumaPesos = ++peso;

            

        }

        // Calcular la media
        double media = sumaPesos / numeroAnimales;
        System.out.println("El peso medio es " + media);

        // Mostrar resultados
        System.out.println("La media de los pesos es: " + media);
        //System.out.println("Animales por debajo de la media: " + animalesPorDebajoDeLaMedia);
        //System.out.println("Animales por encima de la media: " + animalesPorEncimaDeLaMedia);

    }
    
}
