/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje13224;

/**
 *
 * @author vickyfg
 */
public abstract class Trabajador {
    private String nombre;
    private String nif;

    public Trabajador(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trabajador{");
        sb.append("nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract void cotizar();
    
}
