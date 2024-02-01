/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class EjeLanzarDado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    
        LanzarDado l1 = new LanzarDado();
        System.out.println("Lista inicial:\n" + l1.toString());
        
                
        //lista de veces que salio 
       
        l1.numCaras(6);
        
        System.out.println("La cara ha salido " + l1.numCaras(cara) + " veces.");
        
        //Borrar las tiradas de una cara concreta
        l1.borrarCaras(5);
        System.out.println("Como queda la lista borrando la cara 5 "  + l1.toString());
        
        System.out.println("La cara " + cara + " ha salido " + contador + " veces.");
        //Método lanzar dado con n iteraciones 
        System.out.println("¿Cuantas tiradas quieres completar?: ");
        int numTirada = teclado.nextInt();
        LanzarDado l2= new LanzarDado(numTirada);
        
        
        
        System.out.println("Lista l2: \n" + l2.toString());
        l2.borrarCaras(numTirada);
        
        
        
        
    }
}