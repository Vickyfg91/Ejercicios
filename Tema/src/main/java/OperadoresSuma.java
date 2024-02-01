/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class OperadoresSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int a=14;
        double b=5;
        
        double suma = a+b;
        System.out.println("Suma " + suma );
        
        double resta = a-b;
        System.out.println("Resta " + resta);
        
        double producto = a*b;
        System.out.println("Producto " + producto);
        
        //la division de numeros enteros con int devuelve entero(truncado)
        double division = a/b;
        System.out.println("División " + division);
        
        double resto = a%b; // Operador resto o módulo 
        //Devuelve el valor del resto de una división entera 
        System.out.println("Resto " + resto);
        
    }
    
}
