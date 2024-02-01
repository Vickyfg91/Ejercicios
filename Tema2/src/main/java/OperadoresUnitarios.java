/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class OperadoresUnitarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        int a = 12;
        int b = 7;
        //Suma uno al valor de la variable
        a++; //Se usa el valor de la variable y al terminar la instruccion completa se suma 1
        ++a; // Se suma 1 y luego se usa el vallr en la instruccion
     
        System.out.println("a vale " + a);
        
        //Resta uno al valor de la variable que acompaña
        
        a--;
        --a;
        
        System.out.println("a vale " + a);
        System.out.println("a vale " + (a++));
        System.out.println("a vale " + a);
     
    }
    
}
