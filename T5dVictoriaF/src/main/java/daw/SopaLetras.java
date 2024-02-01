/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author vickyfg
 */
public class SopaLetras {
    
    
    //Matriz NxN
    private char matriz[][];
    int n;
    int m;

    public SopaLetras() {
        this.matriz = new char[n][m];
    }
       

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append("matriz=").append(matriz);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Arrays.deepHashCode(this.matriz);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SopaLetras other = (SopaLetras) obj;
        return Arrays.deepEquals(this.matriz, other.matriz);
    }  
    
    public SopaLetras(int n){
        
    }

    public char[][] getMatriz() {
        return matriz;
    }
    
    // Método para generar una matriz aleatoria de nXn elementos de tipo char
    public void mostrarMatriz(){
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Elemento i, j " + i + j + " : " + 
                        matriz[i][j]);
            }
        }
    }
    // Método para generar una matriz aleatoria de nXn elementos de tipo char
    static void generarMatrizAleatoria(int n) {
        char[][] matriz = new char[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = RandomStringUtils.randomAlphabetic(1, 1).toUpperCase().charAt(0); // Genera un char aleatorio de la A a la Z
            }
        }

        return matriz;
    }
    
    
}
