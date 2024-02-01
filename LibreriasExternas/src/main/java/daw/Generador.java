/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author vickyfg
 */
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Generador {

    public static final int DIGITOS_PIN = 4;//constante atributo de clase
    public static final int DIG_PASSWORD = 8;//constante atributo de clase
    public static String generadorPin4Dig() {
        // Genera una cadena aleatoria de dígitos numéricos con longitud 4
        return RandomStringUtils.randomNumeric(DIGITOS_PIN);
    }

    public static String generadorPassword8() {
        //
        return RandomStringUtils.randomAlphanumeric(DIG_PASSWORD);

    }

    public static String generadorConjuntoCaracteres(String conjuntoCaracteres, int n) {
        char[] conjuntoCaracteresArray = conjuntoCaracteres.toCharArray();
        //Sacar posiciones random para generar el conjunto de caracteres aleatorios
        Random rm = new Random();
        String password = "";
        //Bucle para las iteracciones de longitud de contraseña
        for (int i = 0; i < n; i++) {
            int posicion = rm.nextInt(conjuntoCaracteresArray.length);
            char caracter = conjuntoCaracteresArray[posicion];
            password += caracter;

        }
        return password;
    }
}
