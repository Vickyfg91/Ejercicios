/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class EjeBurguerPromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Cual es el importe de tu pedido: ");
            double importePedido = scanner.nextDouble();

            int dado = random.nextInt(6) + 1; // Tirada de dado (1-6)

            double descuento = 0;
            String mensajeDescuento = "";

            if (dado % 2 == 0) { // Dado par
                descuento = importePedido * 0.25;
                mensajeDescuento = "Descuento del 25%";
            } else {
                System.out.println("Debes sacar una bolita.");
                int bola = random.nextInt(3); // 0 para blanca, 1 para roja, 2 para amarilla

                if (bola == 0) {
                    mensajeDescuento = "No hay descuento ";//Bola blanca
                } else if (bola == 1) {
                    descuento = importePedido * 0.12;
                    mensajeDescuento = "Descuento del 12% ";//Bola roja
                } else {
                    descuento = importePedido * 0.05;
                    mensajeDescuento = "Descuento del 5% ";//Bola amarilla
                }
            }

            double totalAPagar = importePedido - descuento;

            System.out.println("Tirada del dado: " + dado);
            System.out.println("Descuento aplicado: " + mensajeDescuento);
            System.out.println("Total a pagar: " + totalAPagar);

            System.out.print("¿Hay más clientes? (Sí/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("no")) {
                break;
            }
        }

    }
}
