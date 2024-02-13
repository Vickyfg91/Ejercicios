/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author aiman
 */
public class Furgoneta extends Vehiculo {
    private double cargaMax;

    public Furgoneta(double cargaMax, String matricula, String bastidor, String marca, Double tarifa) {
        super(matricula, bastidor, marca, tarifa);
        this.cargaMax = cargaMax;
    }

    public Furgoneta() {
    }
    
    public Furgoneta (double cargaMax,String matricula,String bastidor){
        super(matricula,bastidor,null,0.0);
        this.cargaMax = cargaMax;
    }
}
