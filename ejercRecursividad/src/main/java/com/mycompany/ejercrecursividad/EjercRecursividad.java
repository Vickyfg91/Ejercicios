/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercrecursividad;

/**
 *
 * @author vickyfg
 */
public class EjercRecursividad {
    //1- Recorrer un array de forma recursiva e imprimir los valores
    
    //2- Sumar de forma recursiva los elementos de un array
    
    //3- Clase carrito
    public static void main(String[] args) {

       int[] arrayNumeros= {1,2,3,4,5,6,7,8,9};         
       int num = 0;
       
       mostrarValoresRecursivos(arrayNumeros, num);
        System.out.println("Suma " + sumarValoresRecursivos( arrayNumeros, num));

       
    }
    
    public static void mostrarValoresRecursivos(int[] arrayNumeros, int posicion) {
        if (posicion < arrayNumeros.length) {
            System.out.print("[" + arrayNumeros[posicion] + "]" + " ");
            mostrarValoresRecursivos(arrayNumeros, ++posicion);
        } else {
            System.out.println("\nSe ha excedido el array");
        }

    }


    public static int sumarValoresRecursivos(int[] arrayNumeros, int posicion) {
        int suma = 0;
        if (posicion < arrayNumeros.length) {
            suma = arrayNumeros[posicion];
            return suma + sumarValoresRecursivos(arrayNumeros, ++posicion);
        }

        return suma;
    }
}
