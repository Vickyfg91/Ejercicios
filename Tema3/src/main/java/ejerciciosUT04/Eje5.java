/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosUT04;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,x;
        System.out.println("Ingrese valor final: ");
        n = teclado.nextInt();
        x=1;
        
        do{
            System.out.println(x);
            System.out.println(" - ");
        }while(x<=n);
        {
        } 
    }
    
}
