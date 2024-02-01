
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class EjeMayoMen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        
        String resultado = (numero >= 135)?"Mayor":"Menor";
        System.out.println(resultado);
                
        }
        
            
    }
    

