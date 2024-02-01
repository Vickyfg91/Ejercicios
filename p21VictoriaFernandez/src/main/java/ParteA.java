
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String patatasProducto = "Patatas";
        String piminetosProducto = "Piminetos";
        String cebollasProducto = "Cebollas";
        
        System.out.println("Indica el precio de las patatas:" );
        double precioPatatas = teclado.nextDouble();
        teclado.nextLine ();
        
        System.out.println("Indica el precio de los pimientos:" );
        double precioPimientos = teclado.nextDouble();
        teclado.nextLine ();
        
        System.out.println("Indica el precio de las cebollas:" );
        double precioCebollas = teclado.nextDouble();
        teclado.nextLine ();
        
        System.out.println("El coste de "+patatasProducto + "es" +
                precioPatatas + "€");
        System.out.println("El coste de "+piminetosProducto + "es" +
                precioPimientos + "€");
        System.out.println("El coste de "+cebollasProducto + 
                "es" + precioCebollas + "€");
        
        double precioTotal = precioPatatas + precioPimientos + precioCebollas;
        System.out.printf ("El precio total de los productos es %.2f", precioTotal );
    }
    
}
