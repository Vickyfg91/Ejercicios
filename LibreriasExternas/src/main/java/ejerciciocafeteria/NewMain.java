/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocafeteria;

/**
 *
 * @author vickyfg
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                           
    Cafetera laCafetera = new Cafetera(1500);
        System.out.println("Cantidad actual de café en la cafetera: " + laCafetera.getCantidadActual() + "ml");

        laCafetera.llenarCafetera();
        System.out.println("Después de llenar la cafetera: " + laCafetera.getCantidadActual() + "ml");

        laCafetera.servirCafe(500);
        System.out.println("Después de servir café: " + laCafetera.getCantidadActual() + "ml");

        laCafetera.agregarCafe(2000);
        System.out.println("Después de poner café: " + laCafetera.getCantidadActual() + "ml");

        laCafetera.vaciarCafetera();
        System.out.println("Después de vaciar la cafetera: " + laCafetera.getCantidadActual() + "ml");
    }
}