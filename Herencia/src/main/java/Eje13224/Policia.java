/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje13224;

/**
 *
 * @author vickyfg
 */
public class Policia extends Trabajador implements CursoReciclaje{
    
    private String numeroPlaca;

    public Policia(String numeroPlaca, String nombre, String nif) {
        super(nombre, nif);
        this.numeroPlaca = numeroPlaca;
    }

    public Policia(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public Policia() {
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Policia{");
        sb.append("numeroPlaca=").append(numeroPlaca);
        sb.append("Nombre=").append(this.getNombre());
        sb.append('}');
        return sb.toString();
    }
    
    public void ponerDenuncia(){
        System.out.println("El policía está poniendo una denuncia");
    }
    
    
    @Override
    public void cotizar() {
        System.out.println("Cotiza como policía.");
    }
    
    @Override
    public void hacerCurso(int numeroHoras) {
        if (numeroHoras>200){
            System.out.println("Profesor");
        }
    }
}
