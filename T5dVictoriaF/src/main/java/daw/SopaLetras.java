/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author vickyfg
 */
public class SopaLetras {

    //Matriz NxN
    private char[][] matriz;
    private int n;

    public SopaLetras(int tamaño) {
        this.n = tamaño;
        this.matriz = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = RandomStringUtils.randomAlphabetic(1, 1).toUpperCase().charAt(0); // Genera un char aleatorio de la A a la Z
            }
        }
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

    public SopaLetras() {

    }

    public char[][] getMatriz() {
        return matriz;
    }

    // Método para generar una matriz aleatoria de nXn elementos de tipo char
    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    
                }System.out.print(" ");
            }
            
            System.out.println("|");
        }
    }

    /*colocarPalabraHorizontal, que recibe una coordenada de la matriz y un String 
    con la palabra y pone la palabra horizontalmente en la matriz a partir de la 
    coordenada indicada, si se puede.*/
    public void colocarPalabraHorizontal(int fila, int columna, String palabra) {
        if (fila < n && columna < n) {
            if (palabra.length() <= (matriz.length - columna)) {
                for (int i = columna; i < (columna + palabra.length()); i++) {
                        matriz[fila][i] = palabra.charAt(i - columna);                                     
                }
            } else {
                System.out.println("La palabra no tiene un tamaño adecuado");
            }
        } else {
            System.out.println("Elije una posicion adecuada.");

        }
    }
    /*colocarPalabraHorizontalInvertida,que recibe una coordenada de la matriz y 
    un String con la palabra y pone la palabra horizontalmente, de forma invertida, 
    en la matriz a partir de la coordenada indicada, si se puede.*/
    public void colocarPalabraHorizontalInvertida(int fila, int columna, String palabra) {
        if (fila < n && columna < n) {
            if (palabra.length() <= (columna + 1)) {
                for (int i = columna; i > (columna - palabra.length()); i--) {
                        matriz[fila][i] = palabra.charAt(columna - i);                                     
                }
            } else {
                System.out.println("La palabra no tiene un tamaño adecuado");
            }
        } else {
            System.out.println("Elije una posicion adecuada.");

        }
    }
    
    /*colocarPalabraVertical, que recibe una coordenada de la matriz y un String 
    con la palabra y pone la palabra verticalmente en la matriz a partir de la
    coordenada indicada, si se puede.*/
    public void colocarPalabraVertical(int fila, int columna, String palabra) {
        if (columna < n && fila < n) {
            if (palabra.length() <= (matriz.length - fila)) {
                for (int i = fila; i < (fila + palabra.length()); i++) {
                        matriz[i][columna] = palabra.charAt(i - fila);                                     
                }
            } else {
                System.out.println("La palabra no tiene un tamaño adecuado");
            }
        } else {
            System.out.println("Elije una posicion adecuada.");

        }
    }
    /*colocarPalabraVerticalInvertida, que recibe una coordenada de la matriz y 
    un String con la palabra y pone la palabra verticalmente, de forma invertida, 
    en la matriz a partir de la coordenada indicada, si se puede.*/
    public void colocarPalabraVerticalInvertida(int fila, int columna, String palabra) {
        if (fila < n && columna < n) {
            if (palabra.length() <= (fila + 1)) {
                for (int i = fila; i > (fila - palabra.length()); i--) {
                        matriz[i][columna] = palabra.charAt(fila - i);                                     
                }
            } else {
                System.out.println("La palabra no tiene un tamaño adecuado");
            }
        } else {
            System.out.println("Elije una posicion adecuada.");

        }
    }
}
