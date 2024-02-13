/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("123","3223","Maserati",23.56);
        System.out.println(v1);
        Turismo t1 = new Turismo(1,"123","4243","Citroen",234.3);
        System.out.println(t1);
        //cuando uso la variable de la subclase tengo aceso a  ametodos publicos de la superclase
        t1.descontarTarifa(0);
        t1.añadirRuedaRepuesto();
        v1.descontarTarifa(0);
        
        // v1 no tiene acceso a los metodos de t1 pero t1 si tiene acceso a los de v1
    }
}
