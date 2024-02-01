/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Victoria
 */
public class Elevador {

    //Se definen los atributos 
    private String numSerie;
    private String fabricante;
    private int capacidadPersona;
    private double pesoMaximo;
    private LocalDate fechaRevision;
    private LocalDate fechaFabricacion;
    private ESTADOELEV estado;
    private int planta;

    //Se crea constructor para crear el elevador
    public Elevador(String fabricante, int capacidadPersona, double pesoMaximo) {
        //Se crea excepción por si la capacidad esta fuera de rango
        if (capacidadPersona < 0 || capacidadPersona > 10) {
            throw new IllegalArgumentException("La capacidad máxima de personas "
                    + "debe ser inferior a 10 y superior a 0.");
        }
        //Se crea excepción por si el peso esta fuera de rango
        if (pesoMaximo < 0 || pesoMaximo > 800) {
            throw new IllegalArgumentException("El peso máximo soportado debe "
                    + "ser inferior a 800kg y superior a 0kg.");
        }
        this.numSerie = this.generarNumeroSerie();
        this.fabricante = fabricante;
        this.capacidadPersona = capacidadPersona;
        this.pesoMaximo = pesoMaximo;
        this.fechaRevision = LocalDate.now();
        this.fechaFabricacion = LocalDate.now();
        this.planta = 0;

    }

    //Método para cambiar la planta del elevador
    public boolean moverAscensor(int numViajeros, double pesoTotal, int viajePlanta) {
        if (getPesoMaximo() >= pesoTotal && getCapacidadPersona() >= numViajeros 
                && viajePlanta >= 0 && viajePlanta <= 8 && viajePlanta != getPlanta() && getEstado() != ESTADOELEV.ESTELEVAVD) {
            if (viajePlanta > getPlanta()) {
                setEstado(ESTADOELEV.ESTELEVSUB);  
            } else {
                setEstado(ESTADOELEV.ESTELEVBAJ);                    
            }
            setPlanta(viajePlanta);
            return true;
        }
        return false;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadPersona() {
        return capacidadPersona;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public ESTADOELEV getEstado() {
        return estado;
    }

    public int getPlanta() {
        return planta;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public void setEstado(ESTADOELEV estado) {
        this.estado = estado;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", fabricante=").append(fabricante);
        sb.append(", capacidadPersona=").append(capacidadPersona);
        sb.append(", pesoMaximo=").append(pesoMaximo);
        sb.append(", fechaRevision=").append(fechaRevision);
        sb.append(", fechaFabricacion=").append(fechaFabricacion);
        sb.append(", estado=").append(estado);
        sb.append(", planta=").append(planta);
        sb.append('}');
        return sb.toString();
    }

    //Método privado para generar número de serie aleatorio
    private String generarNumeroSerie() {
        return RandomStringUtils.randomNumeric(8);
    }

}
