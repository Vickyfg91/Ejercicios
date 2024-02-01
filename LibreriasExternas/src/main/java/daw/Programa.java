/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vickyfg
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final String CONJUNTOCARACTERES = "ABCD1234?!#";
        Scanner sc = new Scanner(System.in);

        String[] opcionesMenu = {"1.- PIN", "2.- Sistema operativo", "3.- Contraseña personalizada", "4.- Salir"};

        JOptionPane.showMessageDialog(null, opcionesMenu);
        String opcionElegida;
        //Bucle para repetir las opciones
        do { 
            opcionElegida = (String) JOptionPane.showInputDialog(null,
                    "Elige una opción", "Generador de contraseñas",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenu, "1.- PIN");

            switch (opcionElegida) {
                case "1.- PIN" -> {
                    //Generar pin de 4 digitos
                    String pin4Digitos = Generador.generadorPin4Dig();
                    JOptionPane.showMessageDialog(null,
                            "El PIN generado es: \n" + pin4Digitos);
                    break;
                }

                case "2.- Sistema operativo" -> {
                    //Generar contraseña de 8 caracteres incluyendo números y letras; 
                    String randomAlphaNumericString = Generador.generadorPassword8();
                    JOptionPane.showMessageDialog(null, "La contraseña generada es: \n"
                            + randomAlphaNumericString);
                    break;
                }

                case "3.- Contraseña personalizada" -> {
                    int n = 0;
                    //Controlar excepción si usuario introduce en la longitud letras o >0
                    do {
                        System.out.println("Introduce la longitud de la contraseña: ");
                        String longitud = sc.next();
                        sc.nextLine();

                        try {
                            n = Integer.parseInt(longitud);
                            if (n <= 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Debe introducir un valor mayor a 0");
                            } else {
                                String passwordPerson = Generador.generadorConjuntoCaracteres(CONJUNTOCARACTERES, n);
                                JOptionPane.showMessageDialog(null,
                                        "La contraseña generada es: \n" + passwordPerson);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Solo valido números mayores a 0");
                        }

                    } while (n <= 0);
                    break;
                }

                case "4.- Salir" -> {
                    break;
                }
            }
        } while (!opcionElegida.equals("4.- Salir"));
    }

}
