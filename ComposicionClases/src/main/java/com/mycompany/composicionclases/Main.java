/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composicionclases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vickyfg
 */
public class Main {

    public static void main(String[] args) {
        
        /*Museo museo = new Museo();
        
        System.out.println(museo);
        
        museo.insertarObra(new ObraArte("MonaLisa", "Pintura"));
        System.out.println(museo );*/
        List<ObraArte> listaObras = new ArrayList<>();
        
        listaObras.add(new ObraArte("Guernica", "Oleo"));
        listaObras.add(new ObraArte("Maja Desnuda", "Escultura"));
        
        Museo reinaSofia = new Museo("Reina Sofía", "Castellana, 123", new Director("Pepita de la montaña", "254", 2000), listaObras);
        
    }
}
