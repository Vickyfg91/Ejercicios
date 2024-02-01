/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funcionesvictoriafg;

import daw.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Victoria
 */
public class FuncionesVictoriaFG {

    public static void main(String[] args) {

        final String MENU = """
                      Menu de Opciones 
                      1.- Suma de int
                      2.- Suma de double
                      3.- Multipicación de float
                      4.- División de int 
                      5.- Mayor de dos int 
                      6.- Concatenación String
                      7.- Comparar int
                      8.- Comparar String 
                      9.- Multiplicaión de int + Arrays 
                      10.- Saber si un año es bisiesto
                      """;
        int option;
        JOptionPane.showMessageDialog(null, MENU);

        do {
            option = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce opción:"));
            switch (option) {
                case 1 -> {
                    int resultado = Metodos.sumaEnteros(3, 4);
                    System.out.println("La suma de los int es " + resultado);
                }
                case 2 -> {
                    double resultado = Metodos.sumaDouble(3.5, 4.3);
                    System.out.println("La suma de los double es " + resultado);
                }
                case 3 -> {
                    float resultado = Metodos.multiplicarFloat(3, 4);
                    System.out.println("La multiplicación de los float es " + resultado);
                }
                case 4 -> {
                    double resultado = Metodos.dividirInt(7, 8);
                    System.out.println("La division de los int es " + resultado);
                }
                case 5 -> {
                    int resultado = Metodos.numMayor(10, 8);
                    System.out.println("El numero mayor es " + resultado);
                }
                case 6 -> {
                    String resultado = Metodos.concatenarString("Hola", "Mundo");
                    System.out.println("La palabra concatenada es: " + resultado);
                }
                case 7 -> {
                    boolean resultado = Metodos.compararIgualesInt(5, 4);
                    if (resultado) {
                        System.out.println("Los números son iguales");
                    } else {
                        System.out.println("Los números son diferentes");
                    }

                }
                case 8 -> {
                   
                }
                case 9 -> {
                }
                case 10 -> {
                }

            }
        } while (option < 1 || option > 10);
    }
}
