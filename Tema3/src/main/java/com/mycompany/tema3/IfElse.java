/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema3;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
                System.out.println("Es mayor de edad");
        } else {
                System.out.println("No es mayor de edad");
        }
        
       System.out.println("Mostrar la edad: " );
       System.out.println(edad);
        
        
        
    }
    
}
