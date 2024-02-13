/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea6a;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author vickyfg
 */
public class Tarea6a {

    public static void main(String[] args) {
                int[] array = {7, 9, 10, 5, 3, 7, 7, 9, 10, 1, 5, 4};
        Map<Integer, Integer> numRepeticionNumeros;
        System.out.println("Lista de números repetidos" + numRepeticionNumeros(array));

        System.out.println("Lista de números sin repetir");
        System.out.println(listaSinDuplicados(array));
        
        System.out.println("Buscar el numero 9. El número se ha encontrado en la posición: "
                + busquedaPosicionElementoRecursivo(array, 9, 0));

    }
    //A - Estructura de datos que indique, para cada numero, cuantas veces se repite
    private static Map<Integer, Integer> numRepeticionNumeros(int[] array){
        Map<Integer, Integer> repeticiones = new HashMap<>();
        int veces = 1;
            for (int i : array){
                if (repeticiones.containsKey(i)){
                    repeticiones.replace(i, repeticiones.get(i).intValue() + 1);
                }else{
                    repeticiones.put(i, veces);
                }
            }
        return repeticiones;
    }
    
    //B - Lista sin duplicar (lista) hacer una lista 
    //Método para buscar 
    public static Set<Integer> listaSinDuplicados(int[] array) {
        Set<Integer> repeticiones = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            repeticiones.add(array[i]);
        }
        return repeticiones;
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

