/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica31;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class PracticaOctubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       int eleccion;
       Scanner sc = new Scanner(System.in);
       String menu = """
                      Elige la opcion
                      1 - 
                      2 - 
                      """;


       //bucle para controlar la eleccion
       do {
           try {
               System.out.println(menu);
               System.out.println("Introduce 1 o 2: ");
               eleccion = scanner.nextInt();


               if (eleccion == 1) {
                   System.out.println("Introduce dato A:");
                   int valorA = scanner.nextInt();
                   System.out.println("Introduce dato B:");
                   int valorB = scanner.nextInt();
                   try {
                       double division = valorA / valorB;
                       System.out.println("Resultado de A/B: " + division);
                   } catch (ArithmeticException e) {
                       System.out.println("No se puede dividir por 0, fin del programa");
                       break;
                   }
               } else if (eleccion == 2) {
                   System.out.println("Numero de dedos del usuario (de 0 a 10): ");
                   int dedosUsuario = scanner.nextInt();
                   if (dedosUsuario < 0 || dedosUsuario > 10) {
                       System.out.println("Debe introducir un valor de dedos en el rango");
                       break;
                   }
                   System.out.println("Pares o nones?");
                   String eleccionUsuario  = scanner.nextLine();
                   String eleccionMaquina = "";
                   Random rm = new Random();
                   int dedosMaquina = rm.nextInt(11);

                   if (eleccionUsuario.equalsIgnoreCase("PARES")) {
                       eleccionMaquina  = "NONES";

                   } else if(eleccionUsuario.equalsIgnoreCase("NONES")){
                       eleccionMaquina  = "PARES";
                   } else {
                       System.out.println("Debes elegir pares o nones, fin del programa");
                       break;

                   }
                   System.out.println("Eleccion usuario: " + dedosUsuario + "Dedos y " + eleccionUsuario);
                   System.out.println("Eleccion maquina: " + dedosMaquina + "Dedos y " + eleccionMaquina);
                   int totalDedos = dedosMaquina + dedosUsuario;
                   String ganador = "";
                   if (totalDedos % 2 == 0) {
                       // gana pares
                       ganador = eleccionMaquina.equalsIgnoreCase("pares") ? "Usuario" : "maquina";
                       System.out.println("Gana pares");

                   } else {
                       // gana nones
                       ganador = eleccionMaquina.equalsIgnoreCase("nones") ? "Usuario" : "maquina";
                       System.out.println("Gana nones");

                   }
                   System.out.println("El ganador es: ");

               } else {
                   System.out.println("Debe elegir 1 o 2. Fin del programa");
                   break;

               }


           } catch (InputMismatchException e) {
               System.out.println("Entrada incorrecta. Debe introducir 1 o 2 : ");
               break;

           }
       } while (true);
   }
    }
