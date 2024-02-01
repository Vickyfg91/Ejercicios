/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilidadesUsos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class Utilidades {

        // Método de clase público (visible por otras clases)
        // Static no necesitas objetos de la clase Utilidades
        // devuelve un dato tipo int
        // nombre del método
        // El método no tiene parámetros
    public static int solicitarDatoInt(){
        Scanner sc = new Scanner(System.in);
        
        boolean seguir = true;
        int dato = 0;
        do {
            try{
                System.out.println("Introduce un número: ");
                dato = sc.nextInt();
                seguir = false;
            } catch(InputMismatchException ime){
                System.out.println("No has introducido un numero correcto");
            }
            sc.nextLine();
        }while (seguir);
        //Aqui ya hay un número
        //Devolución del dato
        return dato;
    }
    
    
    
}
