/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase171023;

import java.util.Scanner;

/**
 *
 * @author vickyfg
 */
public class EjeHorasDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String respuesta;
        int hora, minutos, segundos;
        //Bucle externo para repetir el programa
        do{
            //Pedir la hora y filtramos
            do{
                System.out.println("Escribe las horas(0-23h): ");
                hora = sc.nextInt();
                sc.nextLine();
            } while (!(hora>=0&&hora<24));//Hay que negarlo para que se cumpla
                        do{
                            System.out.println("Escribe las minutos(0-59h): ");
                            minutos = sc.nextInt();
                            sc.nextLine();
                        } while (!(minutos>=0&&minutos<59));
                        do{
                            System.out.println("Escribe las segundos(0-59h): ");
                            segundos = sc.nextInt();
                            sc.nextLine();
                        } while (!(segundos>=0&&segundos<59));
                      
            System.out.println("La hora es " + hora +":"+ minutos +":"+ segundos);
            System.out.println("Quieres repetir? SI/NO");
            respuesta = sc.nextLine();
        }while (respuesta.equalsIgnoreCase("SI"));
       
    }
    }

    

