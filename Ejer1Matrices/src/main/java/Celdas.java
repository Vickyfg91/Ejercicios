
import static Main.encontrarCeldas;
import static Main.generarMatrizAleatoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class Celdas {
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

        /*int n = 5; // Puedes cambiar este valor según tus necesidades
        char[][] matriz = generarMatrizAleatoria(n);
        

        // Puedes cambiar el char que buscas en la matriz
        char charBuscado = 'A';

        List<celda> celdasEncontradas = encontrarCeldas(matriz, charBuscado);

        // Imprimir las celdas encontradas
        for (Celda celda : celdasEncontradas) {
            System.out.println("Fila: " + celda. + ", Columna: " + celda.columna);
        }
    }*/
    private static class Celda<celda> {

        public Celda() {
        }
    }
    
    // Método para generar una matriz aleatoria de nXn elementos de tipo char
    static char[][] generarMatrizAleatoria(int n) {
        char[][] matriz = new char[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (char) (random.nextInt(26) + 'A'); // Genera un char aleatorio de la A a la Z
            }
        }

        return matriz;
    }

    // Método para encontrar las celdas que contienen un char específico en la matriz
    static List<Celda> encontrarCeldas(char[][] matriz, char buscarChar) {
        List<Celda> celdasEncontradas = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == buscarChar) {
                    celdasEncontradas.add(new Celda(i, j));
                }
            }
        }

        return celdasEncontradas;
    }    
}
