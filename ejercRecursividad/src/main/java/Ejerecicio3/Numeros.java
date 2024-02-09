/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerecicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author vickyfg
 */
public class Numeros {

    /*
    {7,9,10,5,3,7,7,9,10,1,5,4}
    A - Estructura de datos que indique, para cada numero, cuantas veces se repite (Estructura)
    B - Lista sin duplicar (lista)
    C - Recursivo posicion busqueda de un elemento (Lista sin duplicar) ()
     */

    public static void main(String[] args) {
        int[] array = {7, 9, 10, 5, 3, 7, 7, 9, 10, 1, 5, 4};
        Map<Integer, Integer> numRepeticionNumeros;
        System.out.println("Lista de números repetidos" + numRepeticionNumeros(array));

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

}
