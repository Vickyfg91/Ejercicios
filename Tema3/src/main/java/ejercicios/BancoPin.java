/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class BancoPin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un banco establece una contraeña secreta para acceso a sus cajeros. 
        //Debe tener cuatro dígitos numéricos (entre 0 y 9) de forma que 
        //ninguno se repita y la suma de los digitos intermedios sea par. 
        // El programa debe solicitar al usuario tantos pin como sean necesarios 
        //hasta encontrar uno  válido.

        Scanner sc = new Scanner(System.in);
        int digito1;
        int digito2;
        int digito3;
        int digito4;
        int sumadigitos = 0;

       
            do {
                do {
                    System.out.println("Introduzca su primer digito: ");
                    digito1 = sc.nextInt();
                    sc.nextLine();
                } while (digito1 < 0 || digito1 > 9);
                do {
                    System.out.println("Introduzca su segundo digito: ");
                    digito2 = sc.nextInt();
                    sc.nextLine();
                } while ((digito2 < 0 || digito2 > 9));
                do {
                    System.out.println("Introduzca su tercer digito: ");
                    digito3 = sc.nextInt();
                    sc.nextLine();
                } while (digito3 < 0 || digito3 > 9);
                do {
                    System.out.println("Introduzca su cuarto digito: ");
                    digito4 = sc.nextInt();
                    sc.nextLine();
                } while (digito4 < 0 || digito4 > 9);

                sumadigitos = digito2 + digito3;

                if (sumadigitos % 2 != 0) {
                    System.out.println("La suma del segundo y tercer dígito no es par.");
                }

                if (digito1 == digito2 || digito1 == digito3 || digito1 == digito4
                        || digito2 == digito3 || digito2 == digito4 || digito3 == digito4) {
                    System.out.println("Los dígitos se han repetido.");
                }
             } while (sumadigitos % 2 != 0 || digito1 == digito2 || 
                        digito1 == digito3 || digito1 == digito4 || digito2 == digito3 
                        || digito2 == digito4 || digito3 == digito4);
            
        
        System.out.printf("Su PIN se ha generado " + digito1 + digito2 + digito3 + digito4); 
                
        }
     
    }
