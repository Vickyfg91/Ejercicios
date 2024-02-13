/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.ArrayList;
import java.util.List;

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
        
        List<Vehiculo> lista = new ArrayList<>();
        //conversiones implícitas. Casting implicito
        //Aunque la variable sea turismo o furgoneta la estoy apuntando por vehiculo
        //lo qeu implica que solo tengo acceso a los metodos de vehiculo
        lista.add(v1);
        //lista.add(v2);
        //lista.add(f1);
        
        for (Vehiculo v : lista){
            //Método polimorfico toString
            //En función del tipo al que apunte v se ejecuta un código u otro
            System.out.println(v.toString());
            //Variable 
            if (v instanceof Turismo){
                //Castear un objeto
                ((Turismo) v).añadirRuedaRepuesto();
            }
            
        }
        
    }
}
