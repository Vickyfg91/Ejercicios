/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package prueba2_24victoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vickyfg
 */
public class Prueba2_24Victoria {

    public static void main(String[] args) {
        int numero = 1;
        int[][] matriz = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}

        };

        // Imprimir las celdas encontradas
        for (Celda celda : busquedaPrimera) {
            System.out.println("Fila: " + celda. + ", Columna: " + celda.columna);
        }
        
    }

    //Método que busca las cordenadas adyacentes al 1 y devuelve la posicion donde la encuentra
    /*public static int[][] busquedaPrimera(int matriz[][]) {

        int[][] posicion = new int[matriz.length][matriz.length];

        int indicePosicion = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1) {
                    posicion[indicePosicion][0] = i;
                    posicion[indicePosicion][1] = j;
                    indicePosicion++;
                    
                }
            }
        }

        return posicion;
    }*/
    private static class Celda<celda> {

        public Celda() {
        }
    }
    
    static List<Celda> busquedaPrimera(int[][] matriz, int numero) {
        List<Celda> posicion = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numero) {
                    posicion.add(new Celda());
                }
            }
        }

        return posicion;
    }    
}
   

    /*private static List<ArrayList> posicionesDeSerpiente(int[][] matriz){
        List<posiciones> posicion = new ArrayList<>();
        
        
    
    };

            

    public void cambiar(int fila, int columna, int matriz[][]) {
        if (fila < n && columna < n) {
            if (matriz.length() <= (matriz.length - columna)) {
                for (int i = columna; i < (columna + matriz.length()); i++) {
                    matriz[fila][i] = matriz.int(i - columna
                
                            
              
                );                                     
                }
           
        }
    }*/

