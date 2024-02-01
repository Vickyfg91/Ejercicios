/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

/**
 *
 * @author Victoria
 */
public class Metodos {

    private static Object Interger;

    //Método para sumar dos int
    public static int sumaEnteros(int num1, int num2) {
        return num1 + num2;
    }

    //Método para sumar dos double
    public static double sumaDouble(double num1, double num2) {
        return num1 + num2;
    }

    //Método para mutiplicar Float
    public static float multiplicarFloat(float num1, float num2) {
        return num1 * num2;
    }

    //Método para dividir Int controlando excepciones
    public static int dividirInt(int numerador, int denominador) {
    int resultado = 0;

    try {
        resultado = numerador / denominador;
    } catch (ArithmeticException e) {
        // Manejo de excepciones
        resultado = Integer.MIN_VALUE; // Usar "Integer" en lugar de "Interger"
    }

    return resultado;
}

    //Método para ver si un num es mayor que otro
    public static int numMayor(int num1, int num2) {
        int resultado = 0;
        if(num1>num2){
            resultado = num1;
        }else resultado = num2;
        return resultado;
    }

    // Método para concatenar String
    public static String concatenarString(String palabra1, String palabra2) {
        String resultado = palabra1 + palabra2;
        return resultado;
    }

    // Método para comprobar si dos int son iguales 
    public static boolean compararIgualesInt(int num1, int num2) {
        boolean resultado = false;
        if (num1 == num2) {
            resultado = true;
        } return resultado;
        }
    

    //Método para ver si dos String son iguales ignorando mayusculas y minusculas
    public static boolean equalsIgnoreString(String palabra1, String palabra2) {
        
        return palabra1.equalsIgnoreCase(palabra2);
    }

    //Método con arrays y producto 
    public static int[] resultadoMultiplicacion(int num1, int num2, int num3) {

        int res1 = num1 * 2;
        int res2 = num2 * 2;
        int res3 = num3 * 2;
        int resultado[] = {res1, res2, res3};
        return resultado;
    }

    //Método para saber si un año es bisiesto
    public static boolean unAñoBisiesto(int year) {
        boolean comprobacion = false;
        //paso 1
        if (year % 4 == 0) {
            // Paso 2
            if (year % 100 == 0) {
                // Paso 3
                if (year % 400 == 0) {
                    // Paso 4
                    comprobacion = true;
                } else {
                    // Paso 5
                    comprobacion = false;
                }
            } else {
                comprobacion = true;
            }
        } else {
            comprobacion = false;
        }return comprobacion;
    } 

}
