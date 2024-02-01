/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author vickyfg
 */
public class MainProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       ProductoFresco yogur = new ProductoFresco("1", 0.45, "Yogur Desnatado", IVA.IVA7, LocalDate.of(2023, 12, 1));
       ProductoFresco pollo = new ProductoFresco(" 2 ", 7.84, " Pollo troceado ", IVA.IVA16, LocalDate.of(2023, 12, 24));
       ProductoFresco dorada = new ProductoFresco("3", 5.45, " Pieza de Dorada ", IVA.IVA7, LocalDate.of(2023, 11, 29));
       ProductoFresco leche = new ProductoFresco("4", 1.22, "Carton de Leche enterea ", IVA.IVA21, LocalDate.of(2023, 12, 21));
       ProductoFresco manzanas = new ProductoFresco("5", 3.21, " Paquete de 6 Manzanas PinkLady ", IVA.IVA16, LocalDate.of(2024, 1, 2));
        System.out.println(yogur);
        System.out.println("El Precio del producto con iva es: " + FuncionesProducto.calcularPrecioIVA(yogur) + "€");
        System.out.println("Le quedan para caducar: " + FuncionesProducto.calcularDiasCaducidad(yogur) + " dias.");
        System.out.println(pollo);
        System.out.println("El Precio del producto con iva es: " + FuncionesProducto.calcularPrecioIVA(pollo) + "€");
        System.out.println("Le quedan para caducar: " + FuncionesProducto.calcularDiasCaducidad(pollo) + " dias.");
        System.out.println(dorada);
        System.out.println("El Precio del producto con iva es: " + FuncionesProducto.calcularPrecioIVA(dorada) + "€");
        System.out.println("Le quedan para caducar: " + FuncionesProducto.calcularDiasCaducidad(dorada) + " dias.");
        System.out.println(leche);
        System.out.println("El Precio del producto con iva es: " + FuncionesProducto.calcularPrecioIVA(leche) + "€");
        System.out.println("Le quedan para caducar: " + FuncionesProducto.calcularDiasCaducidad(leche) + " dias.");
        System.out.println(manzanas);
        System.out.println("El Precio del producto con iva es: " + FuncionesProducto.calcularPrecioIVA(manzanas) + "€");
        System.out.println("Le quedan para caducar: " + FuncionesProducto.calcularDiasCaducidad(manzanas) + " dias.");
        
        
        
        
    }
}
