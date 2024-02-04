/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author vickyfg
 */
public class T5dVictoriaF {

    public static void main(String[] args) {
        
       int tamañoSopa = 5;
        SopaLetras sopaLetras = new SopaLetras(tamañoSopa);

        System.out.println("Sopa de Letras:");
        sopaLetras.mostrarMatriz();
        sopaLetras.colocarPalabraHorizontal(1, 2, "OSO");
        System.out.println("-----------------HORIZONTAL--------------");
        sopaLetras.mostrarMatriz();
        sopaLetras.colocarPalabraHorizontalInvertida(1, 4, "HOLA");
        System.out.println("-----------------HORIZONTAL INVERTIDA--------------");
        sopaLetras.mostrarMatriz();
        sopaLetras.colocarPalabraVertical(1, 4, "HOLA");
        System.out.println("-----------------VERTICAL--------------");
        sopaLetras.mostrarMatriz();
        sopaLetras.colocarPalabraVerticalInvertida(4, 2, "RAIZ");
        System.out.println("-----------------VERTICAL INVERTIDA--------------");
        sopaLetras.mostrarMatriz();
        
    }
    
}
