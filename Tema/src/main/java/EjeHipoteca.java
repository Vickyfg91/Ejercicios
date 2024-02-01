
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class EjeHipoteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("No hago nada");
        //Variable tipo int
        int numero = 5;
        numero = 4;
        int numero2 = 7;
        numero = numero2;
        numero2 = 9;
        System.out.println("Número: " + numero + "Número 2: " + numero2);

        // Constante
        //La palabra reservada final implica que la variable pasa a ser 
        // una constante -- > No puede cambiar de valor
        // a lo largo del programa
        final double EURIBOR = 4.1;
        System.out.println("Euribor: " + EURIBOR);

        System.out.println("Introduce la cantidad de la hipoteca: ");

        //forma a
        double importe = teclado.nextDouble();
        teclado.nextLine();//Quitamos la porquería
        System.out.println("El importe es " + importe);

        //forma b
        //System.out.println("Introduce la cantidad hipotecada: ");
        //String importeTexto = teclado.nextLine();
        //double importeTexto = teclado.nextDouble();

        //Transformo a número el texto leído
        //float importe2 = Float.parseFloat(importeTexto);
        float importe2 = 3.4f;
        System.out.printf("La cantidad leída es %.3f ", importe2);
        //System.out.println("Introduce la cantidad de la hipoteca: ");

        //forma a
        //double importe = teclado.nextDouble();
        teclado.nextLine();//Quitamos la porquería
        System.out.println("El importe es " + importe);

        //forma b
        System.out.println("Introduce la cantidad hipotecada: ");
        String importeTexto = teclado.nextLine();
        //Transformo a número el texto leído
        //float importe2 = Float.parseFloat(importeTexto);
 
        System.out.printf("La cantidad leída es %.3f", importe2);
        
    }
    
}
