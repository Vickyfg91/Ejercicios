/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejere12224;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Victoria
 */
public class Numeros {
    

    public static void main(String[] args) {

        int[] lista = {7, 9, 10, 5, 5, 3, 7, 7, 9, 10, 1, 5, 4};
        System.out.println("Lista de números repetidos");
        System.out.println(vecesQueSeRepite(lista));
        System.out.println("Lista de números sin repetir");
        System.out.println(listaSinDuplicados(lista));
        System.out.println("Buscar el numero 9. El número se ha encontrado en la posición: "
                + busquedaPosicionElementoRecursivo(lista, 9, 0));

    }
    //Método para mostrar las veces que se repite un elemento en base a una key
    public static Map<Integer, Integer> vecesQueSeRepite(int[] array) {
        Map<Integer, Integer> lista = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (lista.containsKey(array[i])) {
                lista.put(array[i], lista.get(array[i]) + 1);
            } else {
                lista.put(array[i], 1);
            }
        }
        return lista;
    }
    
    //Método para buscar 
    public static Set<Integer> listaSinDuplicados(int[] array) {
        Set<Integer> lista = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            lista.add(array[i]);
        }
        return lista;
    }

    public static int busquedaPosicionElementoRecursivo(int[] array, int num, int posicion) {
        if (posicion < array.length) {
            if (num == array[posicion]) {
                return posicion;
            } else {
                return busquedaPosicionElementoRecursivo(array, num, ++posicion);
            }
        }
        return -1;
    }
}
    

