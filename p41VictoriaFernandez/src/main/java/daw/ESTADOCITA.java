/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author vickyfg
 */
public enum ESTADOCITA {
    
    // CREACION ATRIBUTO ENUM
    CITAACTIVA(" Cita activa "),
    CITAANULADA(" Cita anulada "),
    CITAREALIZADA(" Cita realizada "),
    CINTANOREALIZADA("Cita no realizada");
    
    //Atributo 
    private final String descripcionCita;

    //constructor del ENUM
    private ESTADOCITA(String estadoCita) {
        this.descripcionCita = estadoCita;
    }
    //GET
    public String getEstadoCita() {
        return descripcionCita;
    }
    
    //String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UtilidadesCita{");
        sb.append("estadoCita=").append(descripcionCita);
        sb.append('}');
        return sb.toString();
    }

}
