/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherenciavehiculos.herencia;

/**
 *
 * @author vickyfg
 */
public class Furgoneta extends Vehiculo{
    
    private double cargaMax;
    //Mismo método en la misma clase
    //constructor parametrizado con herencia

    public Furgoneta() {
    }
    
    public Furgoneta(double cargaMax, String matricula, String bastidor){
        super();
        this.cargaMax = cargaMax;
    }
}
