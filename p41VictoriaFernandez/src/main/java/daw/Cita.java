/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author vickyfg
 */
public class Cita {

    //Se definen los atributos 
    private String nombreUsuario;
    private LocalDateTime citaAgendada;
    private final LocalDate fechaCitaCreada;
    private String nombreMascota;
    private ESTADOCITA estado;

    //Constructor del objeto
    public Cita() {

        this.nombreUsuario = "";
        this.citaAgendada = LocalDate.now().minusDays(15).atTime(10, 0);
        this.fechaCitaCreada = LocalDate.now();
        this.nombreMascota = "";
        this.estado = ESTADOCITA.CITAACTIVA;

    }

    public Cita(String nombreUsuario, String nombreMascota, LocalDateTime citaAgendada) {
        this.fechaCitaCreada = LocalDate.now();
        //Se crea excepción por si la cita agendada esta fuera de rango
        long diasTranscurridos = ChronoUnit.DAYS.between(citaAgendada, fechaCitaCreada);
        if (diasTranscurridos < 0) {
            throw new IllegalArgumentException("Los dias entre la cita agendada y "
                    + "la fecha de creacion deben ser al menos 1");
        }

        //Se crea excepción por si el dia de cita esta fuera de rango      
        if (citaAgendada.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            throw new IllegalArgumentException("El día de la cita no puede ser "
                    + "miércoles ya que está cerrado por descanso.");
        }
        //la hora de la cita debe estar entre las 10h y las 19h

        if (citaAgendada.getHour() < 10 || citaAgendada.getHour() >= 19) {
            throw new IllegalArgumentException("La cita debe estar dentro del horario entre las 10h y las 19h.");
        }

        this.nombreUsuario = nombreUsuario;
        this.citaAgendada = citaAgendada;
        this.nombreMascota = nombreMascota;
        this.estado = ESTADOCITA.CITAACTIVA;
    }

    

    public void anulaCita() {
        setEstado(ESTADOCITA.CITAANULADA);
    }

    public String activarCita(String citaCreada, String descripcionCita) {
        setEstado(ESTADOCITA.CITAACTIVA);
        return descripcionCita;
    }

    public String realizarCita(String citaAnulada, String descripcionCita) {
        setEstado(ESTADOCITA.CITAREALIZADA);
        return descripcionCita;
    }

    public String noRealizarCita(String citaAnulada, String descripcionCita) {
        setEstado(ESTADOCITA.CINTANOREALIZADA);
        return descripcionCita;
    }

    //Implementacion de getter para todos los atributos
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public LocalDateTime getCitaAgendada() {
        return citaAgendada;
    }

    public LocalDate getFechaCitaCreada() {
        return fechaCitaCreada;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public ESTADOCITA getEstado() {
        return estado;
    }

    //Implementacion setter
    public void setCitaAgendada(LocalDateTime citaAgendada) {
        this.citaAgendada = citaAgendada;
    }

    public void setEstado(ESTADOCITA estado) {
        this.estado = estado;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cita{");
        sb.append("nombreUsuario=").append(nombreUsuario);
        sb.append(", citaAgendada=").append(citaAgendada);
        sb.append(", fechaCitaCreada=").append(fechaCitaCreada);
        sb.append(", nombreMascota=").append(nombreMascota);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

}
