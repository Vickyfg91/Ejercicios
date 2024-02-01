/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author vickyfg
 */
public class CatalogoLibros {

    public static void main(String[] args) {
        Libro l1 = new Libro("123", "Platero y yo", "JRJ", "Planeta", 54);
        Libro l2 = new Libro(l1);
        Libro l3 = new Libro("1234", "Platero y yo", "JRJ", "Planeta", 54);
        
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro("123", "Platero y yo", "JRJ", "Planeta", 54));
        lista.add(new Libro("456", "Caperucita", "Anónimo", "Planeta", 24));
        lista.add(new Libro("789", "Don Quijote de la Mancha", "Miguel de Cervantes", "Alfaguara", 254));
        
        lista.forEach(System.out::println);
        
        //Ordenar pos isbn
        Collections.sort(lista, (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        
       lista.forEach(System.out::println);
       
       
       /*System.out.println("---------------Ordenado por paginas ----------------");
       //Ordenar por numPaginas
       Collections.sort(lista, (k1,k2)-> k1.getNumPag() - k2.getNumPag());
       lista.forEach(System.out::println);*/
       
       //Ordenar por numPaginas      
       System.out.println("---------------Ordenado por paginas ----------------");

       Collections.sort(lista, (k1,k2)-> k1.getNumPag() - k2.getNumPag());
       lista.forEach(System.out::println);
       
        System.out.println("---------------Autor---------------");
        Comparator<Libro> criterioAutor = (k1, k2)-> k1.getAutor().compareToIgnoreCase(k2.getAutor());
        
        Collections.sort(lista, criterioAutor.reversed()) ;
        lista.forEach(System.out::println);
        
        System.out.println("---------------ISBN----------------");
        Collections.sort(lista, (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        lista.forEach(System.out::println);
        
        /*Recibe la lista donde buscar, un objeto del mismo tipo
        que contenga la lista con la clave a buscar y el criterio de ordenacion 
        de la lista 
        lista -- > lista
        objeto - > new Libro().setIsbn("lo que yo quiera")
        criterio -> (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn())*/
        Libro x = new Libro();
        x.setIsbn("123");
        int posicion = Collections.binarySearch(lista, x, (e1, e2) 
                -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        
        System.out.println();
        
        /*System.out.println(l1);
        System.out.println(l2);
        System.out.println("¿Son iguales? " + l1.equals(l2));
        System.out.println(l3);
        System.out.println("¿Son iguales? " + l1.equals(l3));*/
        
        
        
    }
}
