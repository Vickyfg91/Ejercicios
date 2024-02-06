/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicionclases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vickyfg
 */
public class Museo {//Clase contenedora
    
    //Clases contenidas
    private String nombre;
    private String direccionPostal;
    private Director director;
    private List<ObraArte> listaObras;

    
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
      
    public Museo(){
        this.nombre = "Reina Sofía";
        this.direccionPostal = "Castellana, 23";
        this.director = new Director("Pilar de los montes", "123", 1500);
        this.listaObras = new ArrayList();
    }

    public Museo(String nombre, String direccionPostal, Director director, List<ObraArte> listaObras) {
        this.nombre = nombre;
        this.direccionPostal = direccionPostal;
        this.director = director;
        this.listaObras = listaObras;
    }

    

       
    
    
    private void rellenarListaObras(){
        this.listaObras.add(new ObraArte("Gernica", "Pintura"));
    }
    
    public void insertarObra(ObraArte obra){
        this.listaObras.add(obra);
    }
    public void borrarObra(ObraArte obra){
        this.listaObras.remove(obra);
    }
    
    
    
}
