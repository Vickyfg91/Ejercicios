/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aleatorios;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author vickyfg
 */
public class EjeAdivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Un programa de java que genere un numero aleatorio entre 100 y 200 
    //incluido y que el usuario lo tenga que adivinar en 4 intentos
String mensaje = """
                              Adivina, Adivinanza...
                              ¿En qué número estoy pensando?
                              Tienes 4 intentos.
                              """;
        JOptionPane.showMessageDialog(null, mensaje);

        Random generadorNumeros = new Random();
        int limiteSuperior = 101;

        int aleatorioGenerado = generadorNumeros.nextInt(limiteSuperior) + 100; // numero generado de 0 a 100 sumandole 100, por lo que es de 100 a 200

        int intento = 1;
        boolean encontrado = false;
        System.out.println(aleatorioGenerado);
        while (intento < 5 && !encontrado) {
            String opcion = JOptionPane.showInputDialog("Introduce número:");
            int opcionInt = Integer.parseInt(opcion);
            if (aleatorioGenerado == opcionInt) {
                encontrado = true;
                JOptionPane.showMessageDialog(null,
                        "Has acertado!!");
            } else if (opcionInt < 100 || opcionInt > 200) {
                JOptionPane.showMessageDialog(null,
                        "El número debe estar en el rango 100, 200. Es el intento "
                        + intento);
            } else if (aleatorioGenerado < opcionInt) {
                JOptionPane.showMessageDialog(null,
                        "El número es más pequeño, es el intento "
                        + intento);
            } else if (aleatorioGenerado > opcionInt) {
                JOptionPane.showMessageDialog(null,
                        "El número es más grande, es el intento "
                        + intento);
            }

            intento++;
        }

    }

}
    

