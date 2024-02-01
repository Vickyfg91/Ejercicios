/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vickyfg
 */
public class LanzarDado {

    
    private ArrayList<Integer> listaTiradas;

    
    // Constructor sin parametros para 1000 tiradas
    public LanzarDado() {
        listaTiradas = new ArrayList<>();
        llenarLista(1000);
    }
    
    
    // Constructor parametrizado
    public LanzarDado(int numTiradas) {
        listaTiradas = new ArrayList<>();
        llenarLista(numTiradas);
    }
    
    //Método para simular lanzar un dado 6 caras
    private void llenarLista(int numTiradas) {
        Random random = new Random();
        for (int i = 0; i < numTiradas; i++) {
            int resultado = random.nextInt(6) + 1; 
            listaTiradas.add(resultado);
        }
    }
    // Método toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanzarDado{");
        sb.append("listaTiradas=").append(listaTiradas);
        sb.append('}');
        return sb.toString();
    }
    
    // Método para conocer el número de veces que ha salido una cara
    public int numCaras(int cara) {
        int contador = 0;
        for (int valor : listaTiradas) {
            if (valor == cara) {
                contador++;
            }
        }
        
        return contador;
    }

    // Método para borrar el número de veces que salió la cara seleccionada
    public void borrarCaras(int cara) {
        listaTiradas.removeIf(valor -> valor == cara);
    }
}

    

    
   
