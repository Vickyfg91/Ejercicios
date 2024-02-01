
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class EjeSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Opcion A preguntar numero si es par o impar
        //opcion B preguntar num si es un mes valido y el nombre del mes
        //op 3 pregunta 3 num, horas min y sgs y ver si es una hora valida
        Scanner teclado = new Scanner (System.in);
        
        String menu = """
                    -------------------------------
                        OPCIONES: 
                     A - PAR O IMPAR
                     B - MES DEL AÑO
                     C - HORAS, MINUTOS, SEGUNDOS
                      """ ;
        System.out.println(menu);
        System.out.println("Introduce una opción");
        String opcionString = teclado.nextLine();
        
        //Paso lo que introduce el usuario a mayusculas
        opcionString = opcionString.toUpperCase();
        //Para extraer la posicion que yo quiera en una cadena de texto
        char opcion = opcionString.charAt(0);
        
        //Hay tres opciones de tipo char
        //System.out.println(opcionString);
        //System.out.println("Opcion char: " + opcion);
        
        //Hay tres opciones de tipo char
        switch (opcion){
        case 'A' -> {
                //par o impar
                System.out.println("Introduce un número " 
                + "para saber si es par o impar ");
                int numero = teclado.nextInt();
                teclado.nextLine();
                String parOImpar = (numero%2==0) ? "es par " : "es impar ";
                System.out.println("El número " + numero + " es " + parOImpar);
                //otra opcion
                if (numero%2 ==0){                       
                    System.out.println("Es par ");
                }else{ 
                    System.out.println("Es impar ");
                }
            }
                
        case 'B' -> {
            int mes = 0;
            switch (mes){
            case 1-> {
                System.out.println("Enero");    
                }
            case 2-> {
                System.out.println("Febrero");    
                }
            case 3-> {
                System.out.println("Marzo");    
                }
            case 4-> {
                System.out.println("Abril");    
                }
            case 5-> {
                System.out.println("Mayo");    
                }
            case 6-> {
                System.out.println("Junio");    
                }
            case 7-> {
                System.out.println("Julio");    
                }
            case 8-> {
                System.out.println("Agosto");    
                }
            case 9-> {
                System.out.println("Septiembre");    
                 }   
            case 10-> {
                System.out.println("Octubre");    
                 }    
            case 11-> {
                System.out.println("Noviembre");    
                 }
            case 12-> {
                System.out.println("Diciembre");    
                 }
            default -> {
            System.out.println("No es un mes válido");
            }
        }
        }

    case 'C' -> {
          // HORAS MINUTOS SEGUNDOS
                System.out.println("Introduce un número" + 
                "entre 0 y 23 (HORAS): ");
                    int horas = teclado.nextInt();
                System.out.println("Introduce un número " 
                + "ente 0 y 59 (minutos): ");
                    int minutos = teclado.nextInt();
                System.out.println("Introduce un número " 
                + "ente 0 y 59 (segundos): ");
                    int segundos = teclado.nextInt();
        
        //Opción A - Todo junto
                if (horas>=0&&horas<=23&&
                    minutos>=0&&minutos<=59 &&
                    segundos>=0 && segundos<=59){
            System.out.println("Es una hora válida");
                } else {
            System.out.println("No es una hora válida");
                }
          
    }
    

        default-> { 
            System.out.println("No es una opción valida");
        }
    
    }
        }
    }

 