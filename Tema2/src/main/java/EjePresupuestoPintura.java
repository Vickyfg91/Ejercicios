
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class EjePresupuestoPintura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Vamos a realizar su presupuesto de pintura.");
        

        final double precioPorLitro = 7;
  
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la medida del ancho de su pared: (m)");
        double anchoPared = teclado.nextDouble();
        teclado.nextLine ();
        
        System.out.println("Introduzca la medida del alto de su pared: (m)");
        double altoPared = teclado.nextDouble();
        teclado.nextLine ();
        
        System.out.println("Introduzca la medida del alto de su tejado: (m)");
        double altoTejado = teclado.nextDouble();
        teclado.nextLine ();
        
        double areaRectangulo = anchoPared*altoPared;
        double areaTriangulo = (anchoPared*altoTejado)/2;
        double areaTotal = areaTriangulo + areaRectangulo;
        
        double precioTotal = areaTotal * precioPorLitro;
        
        System.out.println("El precio para pintar su fachada es: " + precioTotal + "€");
        
        

             
    }
    
}
