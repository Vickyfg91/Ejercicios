/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author vickyfg
 */
public class FuncionesProducto {

    public static double calcularPrecioIVA(ProductoFresco p) {
        return (p.getPrecioSinIva() * p.getIva().getValorIva() + p.getPrecioSinIva());
    }

    public static long calcularDiasCaducidad(ProductoFresco p) {
        if (p.getFechaCaducidad() != null) {

            return ChronoUnit.DAYS.between(LocalDate.now(), p.getFechaCaducidad());
        }
        return Long.MAX_VALUE;
    }

    public static double[] funcionArray(ProductoFresco[] array) {
        double[] arrayPrecios = new double[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arrayPrecios[i] = calcularPrecioIVA(array[i]);
        }
        return arrayPrecios;
    }
}
