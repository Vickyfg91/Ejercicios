/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author vickyfg
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 

        int[][] m = {
            {0, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        };
 
        int[][] posiciones3Pos = adyacentesA(m.length, m[0].length, 0, 0);
 
        System.out.println("3 posiciones");
        for (int i = 0; i < posiciones3Pos.length; i++) {
            for (int j = 0; j < posiciones3Pos[0].length; j++) {
                System.out.print(posiciones3Pos[i][j] + " ");
            }
            System.out.println("");
        }
 
        int[][] posiciones5Pos = adyacentesA(m.length, m[0].length, 1, 0);
 
        System.out.println("5 posiciones");
        for (int i = 0; i < posiciones5Pos.length; i++) {
            for (int j = 0; j < posiciones5Pos[0].length; j++) {
                System.out.print(posiciones5Pos[i][j] + " ");
            }
            System.out.println("");
        }
 
        int[][] posiciones8Pos = adyacentesA(m.length, m[0].length, 1, 1);
 
        System.out.println("8 posiciones");
        for (int i = 0; i < posiciones8Pos.length; i++) {
            for (int j = 0; j < posiciones8Pos[0].length; j++) {
                System.out.print(posiciones8Pos[i][j] + " ");
            }
            System.out.println("");
        }
    }
 
    public static int[][] adyacentes(int filas, int columnas, int filaOrigen, int columnaOrigen) {
 
        if (!(filaOrigen >= 0 && 
                filaOrigen <= (filas - 1) && 
                columnaOrigen >= 0 && 
                columnaOrigen <= (columnas - 1))) {
            return null;
        }
 
        int numPosiciones;
 
        if (filaOrigen == 0 || filaOrigen == (filas - 1)) {
            if (columnaOrigen == 0 || columnaOrigen == (columnas - 1)) {
                numPosiciones = 3;
            } else {
                numPosiciones = 5;
            }
        } else {
            if (columnaOrigen == 0 || columnaOrigen == (columnas - 1)) {
                numPosiciones = 5;
            } else {
                numPosiciones = 8;
            }
        }
 
        int[][] posiciones = new int[numPosiciones][2];
 
        int indicePosicion = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
 
                if ((i != 0 || j != 0)
                        && (filaOrigen + i) >= 0
                        && (filaOrigen + i) <= (filas - 1)
                        && (columnaOrigen + j) >= 0
                        && (columnaOrigen + j) <= (columnas - 1)) {
                    posiciones[indicePosicion][0] = filaOrigen + i;
                    posiciones[indicePosicion][1] = columnaOrigen + j;
                    indicePosicion++;
                }
 
            }
        }
 
        return posiciones;
 
    }
 public class RecorrerMatrizPorFilasYColumnas {
	public static void main(String[] args) {
		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
						   // 50 filas y 100 columnas.
	
		for (int i = 0; i < 50; i++)		// El primer índice recorre las filas.
			for (int j = 0; j < 100; j++){	// El segundo índice recorre las columnas.
				// Procesamos cada elemento de la matriz.
				System.out.println(matriz[i][j]);
			}
	}
}
}
    public static int[][] busquedaPrimera(int matriz[][]) {

    int[][] posicion = new int[matriz.length][matriz.length];

    int indicePosicion = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[i][j] == 1) {
                posicion[indicePosicion][0] = i;
                posicion[indicePosicion][1] = j;
                indicePosicion++;
                break;
            }
        }
    }

    return posicion;
}

int[][] posicion = new int[matriz.length][matriz.length];
   

