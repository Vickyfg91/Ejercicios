/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author Victoria
 */
public enum ESTADOELEV {
    
        ESTELEVSUB("Elevador subiendo"),
        ESTELEVBAJ("Elevador bajando"),
        ESTELEVPAR("Elevador parado"),
        ESTELEVAVD("Elevador averiado");
        private final String estadoElevador;

    public String getEstadoElevador() {
        return estadoElevador;
    }

    private ESTADOELEV(String estadoElevador) {
        this.estadoElevador = estadoElevador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ESTADOELEV{");
        sb.append("estadoElevador=").append(estadoElevador);
        sb.append('}');
        return sb.toString();
    }
        
        
    
}
