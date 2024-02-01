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
public class CompraCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una persona compra un coche por un precio X y lo va a pagar en N meses. 
        //Realiza el cuadro de pagos suponiendo que cada mes paga la mitad de lo 
        //que quede por pagar, excepto el último mes del préstamo que paga el 
        //resto que quede.
        
        final double PRECIOCOCHE;
        final int MESESPAGO;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el precio de su coche: ");
        PRECIOCOCHE = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca los meses de pago: ");
        MESESPAGO = sc.nextInt();
    }
    
}
