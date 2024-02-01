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

/*En un nuevo proyecto llamado tarea4e+tunombre, incluye un paquete llamado daw.

Crea una clase, llamada ProductoFresco, con los siguientes atributos: id, precio sin iva, descripción, fecha caducidad (final) e IVA (que puede ser 7, 16 o 21, usa ENUM). Ten en cuenta que la fecha de caducidad del producto no puede ser 45 días posterior a la fecha actual del sistema. En tal caso el atributo fecha se inicializa a null en el constructor.
Incluye getters, setters y toString.*/
public class ProductoFresco {

    private String idProducto;
    private double precioSinIva;
    private String descripcion;
    private IVA iva;
    private final LocalDate fechaCaducidad;

    public ProductoFresco(String idProducto, double precioSinIva, String descripcion, IVA iva, LocalDate fechaCaducidad) {
        this.idProducto = idProducto;
        this.precioSinIva = precioSinIva;
        this.descripcion = descripcion;
        this.iva = iva;
        this.fechaCaducidad = null;
        LocalDate ahora = LocalDate.now();
        long diferenciaDias = ChronoUnit.DAYS.between(ahora, fechaCaducidad);
                if(diferenciaDias<=45){
        this.fechaCaducidad = fechaCaducidad;
                }
    }

}
