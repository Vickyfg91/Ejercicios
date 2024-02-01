/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author vickyfg
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numPalabras = solicitarNumeroPalabras();
        String[] palabras = arrayPalabrasIntroducidas(numPalabras);
        mostrarPalabrasConca(palabras);
        
        

    }

    //Método solicita, lee y devuelve el número de palabras a guardar
    public static int solicitarNumeroPalabras() {
        int numPalabras = 0;
        boolean entradaValida = true;

        do {
            try {
                numPalabras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de palabras:"));
                entradaValida = false;

            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "No has introducido un numero entero");
            }
        } while (entradaValida);
        return numPalabras;
    }

    //Método genera array almacene palabra
    public static String[] arrayPalabrasIntroducidas(int numPalabras) {
        String[] palabras = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
            palabras[i] = JOptionPane.showInputDialog("Introduce la palabra " + (i + 1));
        }

        return palabras;
    }

    //Método para mostrar la concatenación del array
    public static void mostrarPalabrasConca(String[] palabras) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            resultado.append("Posición ").append(i + 1).append(" - ").append(" Palabra: ").append(palabras[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ej1{");
        sb.append('}');
        return sb.toString();
    }

    //Método para contar vocales
    public static int contarVocales(String palabras) {
        int numVocales = 0;
        palabras = palabras.toLowerCase();
        for (int i = 0; i < palabras.length(); i++) {
            if ((palabras.charAt(i) == 'a')
                    || (palabras.charAt(i) == 'e')
                    || (palabras.charAt(i) == 'i')
                    || (palabras.charAt(i) == 'o')
                    || (palabras.charAt(i) == 'u')) {
                numVocales++;
            }
        }
        return numVocales;
    }

    //Método que, a partir del array original de palabras devuelve otro array solo con las que tienen 3 vocales o más.
    public static String[] palabrasConTresVocales(String[] palabras) {
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            //Cuenta palabras con mas de 3 vocales
            if (contarVocales(palabras[i]) >= 3) {
                contador++;
            }
        }
        String[] palabrasVocales = new String[contador];
        int index = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (contarVocales(palabras[i]) >= 3) {
                palabrasVocales[index++] = palabras[i];
            }

        }
        return palabrasVocales;

    }

    //Método para obtener un array con dos o menos vocales
    public static String[] palabrasConDosVocales(String[] palabras) {
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            //Cuenta palabras con mas de 3 vocales
            if (contarVocales(palabras[i]) <= 2) {
                contador++;
            }
        }
        String[] palabrasDosVocales = new String[contador];
        int index = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (contarVocales(palabras[i]) <= 2) {
                palabrasDosVocales[index++] = palabras[i];
            }

        }
        return palabrasDosVocales;

    }

    //Ej2
    public static int[] busquedaCaracteres(String[] palabras, char letra) {
        int[] palabrasConVocales = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            palabrasConVocales[i] = -1;
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].toLowerCase().charAt(j) == letra) {
                    palabrasConVocales[i] = j;
                    break;
                }
            }
        }
        return palabrasConVocales;
    }

}
