/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class numerospararitm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar al usuario un número concreto de números que debe introducir. 
        //El programa pedirá al usuario esa cantidad de números, uno a uno, 
        //y dirá si el número introducido es par, impar. 
        //Al terminar debe calcular la media aritmética.

        Scanner sc = new Scanner(System.in);
        int numero;
        int cantidadCiclos;
        int sumaNumero = 0;
        int mediaAritmetica;
        
        System.out.print("Introduce la cantidad de ciclos a ejecutar: ");
        cantidadCiclos = sc.nextInt();
        sc.nextLine();

        //
        for (int ciclo1 = 1; ciclo1 <= cantidadCiclos; 
                ciclo1++) {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            sc.nextLine();
            sumaNumero = sumaNumero + numero;

            if (numero % 2 == 0) {
                System.out.printf("Es par\n");
            } else {
                System.out.printf("Es impar\n");
            }

        }
        mediaAritmetica = sumaNumero / cantidadCiclos;
        System.out.println("La media Aritmética de tus números es: " 
                + mediaAritmetica);
    }
    
}
