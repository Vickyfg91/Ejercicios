/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author aiman
 */

//clase turismo hereda d vehiculo turismo es la subclase
public class Turismo extends Vehiculo {
    private int numPuertas;

    public Turismo(int numPuertas, String matricula, String bastidor, String marca, Double tarifa) {
        //llamada al constructor de vehciulo
        super(matricula, bastidor, marca, tarifa);
        //una vez el vehiculo esta creado se inicializan los atributos del turismo
        this.numPuertas = numPuertas;
    }

    public Turismo() {
        //la llamada al constructor sin parametros está pero no la vemos
        super();
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"Turismo{" + "numPuertas=" + numPuertas + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.numPuertas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turismo other = (Turismo) obj;
        return this.numPuertas == other.numPuertas;
    }
    public void añadirRuedaRepuesto(){
        System.out.println("Añadiendo rueda...");
    }
    
    @Override
    public void pasarItv(){    
            System.out.println("Soy un vehiculo y estoy pasando la ITV.");
    }
}
