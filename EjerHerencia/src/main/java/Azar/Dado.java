/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azar;

/**
 *
 * @author vickyf
 */
public class Dado extends Azar{
    //asignada las posibilidades de dado 6
    public Dado() {
        this.posibilidades = 6; 
    }
    
    //genera y devuelve un numero aleatorio entre el 1 y el 6
    @Override
    public int lanzar() {
        return (int) (Math.random() * posibilidades) + 1;//(+1 ya que empieza en el 0)
    }
}
