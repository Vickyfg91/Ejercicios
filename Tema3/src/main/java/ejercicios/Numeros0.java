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
public class Numeros0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitar números enteros hasta que el usuario ponga un cero. 
        //Una vez se pone el cero, el programa muestra la suma de todos los 
        //números introducidos

        Scanner sc = new Scanner(System.in);

        int numero;
        int sumaNumero = 0;
        do {
            System.out.println("Introduzca un número: ");
            numero = sc.nextInt();
            sc.nextLine();
            sumaNumero = sumaNumero + numero;// tambien se puede sumaNumero += numero;              
        } while (numero != 0);

        System.out.println("La suma de los números es: " + sumaNumero);
    }

}
