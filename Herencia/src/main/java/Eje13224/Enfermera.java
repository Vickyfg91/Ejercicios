/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje13224;

/**
 *
 * @author vickyfg
 */
public class Enfermera extends Trabajador{
    
    private String hospital;

    public Enfermera(String hospital, String nombre, String nif) {
        super(nombre, nif);
        this.hospital = hospital;
    }

    public Enfermera(String hospital) {
        this.hospital = hospital;
    }

    public Enfermera() {
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enfermera{");
        sb.append("hospital=").append(hospital);
        sb.append("Nombre=").append(this.getNombre());
        sb.append("NIF=").append(this.getNif());
        sb.append('}');
        return sb.toString();
    }
    
    

    @Override
    public void cotizar() {
        System.out.println("Cotiza como enfermera.");
    }
    
     
}
