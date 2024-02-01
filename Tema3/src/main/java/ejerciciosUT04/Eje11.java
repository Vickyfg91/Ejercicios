/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosUT04;

/**
 *
 * @author vickyfg
 */
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String abecedario ="abcdefghijklmnñopqrstuvwxyz";
        
        for (int x = 0; x<= 26; x++){
            char letra =  abecedario.charAt(x);
            int numeroLetra = abecedario.codePointAt(x);
            System.out.print(letra);
            System.out.print(" - ");
            System.out.println(numeroLetra);
        }
    }
    
}
