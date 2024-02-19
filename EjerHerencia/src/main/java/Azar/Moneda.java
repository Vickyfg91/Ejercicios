/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azar;

/**
 *
 * @author vickyf
 */
public class Moneda extends Azar {

    //Asignado valor 2 una moneda tiene dos caras
    public Moneda() {
        this.posibilidades = 2;
    }
    
    //Genera dos numeros aleatorios y devuelve 1 o 2 
    @Override
    public int lanzar() {
        return (int) (Math.random() * posibilidades) + 1; //Genera un número aleatorio entre 1 y 2
    }
}
