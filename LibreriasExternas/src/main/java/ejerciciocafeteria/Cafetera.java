/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocafeteria;

/**
 *
 * @author vickyfg
 */
public class Cafetera {
    //Atributos  son privados 
    private int capacidadMaxima;
    private int cantidadActual;
    private static final int CAPACIDAD_MAX = 1000;
    private static final int VACIA = 0;
    
    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = CAPACIDAD_MAX;
        this.cantidadActual = VACIA;
    }
    
     // Constructor con capacidad máxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }
    
    // Constructor con capacidad máxima y cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }
    //Método llenar cafetera
     public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    ///Método simula servir una taza de café
     public void servirCafe(int cantidadAServir) {
        if (cantidadAServir <= this.cantidadActual) {
            this.cantidadActual -= cantidadAServir;
        } else {
            this.cantidadActual = cantidadAServir;
        }
    }
     //Método para contador a 0
    public void vaciarCafetera() {
        this.cantidadActual = VACIA;
        }
    
    //Método para agregarle café a la cafetera
    public void agregarCafe(int cantidadAPoner) {
        if (this.cantidadActual + cantidadAPoner <= this.capacidadMaxima) {
            this.cantidadActual += cantidadAPoner;
        } else {
            this.capacidadMaxima = (this.cantidadActual += cantidadAPoner);
        }
    }
    
    //Llamadas a la clase
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cafetera{");
        sb.append("capacidadMaxima=").append(capacidadMaxima);
        sb.append(", cantidadActual=").append(cantidadActual);
        sb.append('}');
        return sb.toString();
    }

    
    
}
