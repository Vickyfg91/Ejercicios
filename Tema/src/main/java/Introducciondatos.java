
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class Introducciondatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              //System.out.println("Pepito");
    
    //clase Scanner sirve para introducir datos por teclado y leer ficheros de texto
    //En la variable teclado se ha creado un objeto usando un constructor
    // de la clase Scanner pasando como parametro System.in
    // cuando se crean objetos o metodos la primera letra May (String, Scanner...)
    Scanner teclado = new Scanner(System.in);
    System.out.print("Usuario introduce tu nombre ");
    
    String nombre = teclado.nextLine();
    
    System.out.println("Tu nombre es: " + nombre);
    System.out.print("Introduce tu primer apellido: ");
    
    String apellido1 = teclado.nextLine();
    
    System.out.println("Tu apellido es: " + apellido1);
    
    System.out.print(nombre + " introduce tu edad: ");
    int edad = teclado.nextInt();
    System.out.println("Tu edad es " + edad);
    
    System.out.print("Introduce tu peso: ");
    double peso = teclado.nextDouble();
    teclado.nextLine();//limpia la variable teclado siempre despues de una cambio (nextDouble)  
    System.out.println ("Tu peso es: " + peso);
    
    System.out.print("Introduce el nombre de tu mascota: ");
    String nombreMascota = teclado.nextLine();
    System.out.println ("Tu mascota es: " + nombreMascota);
    
    System.out.print("Introduce su estatura (m): ");
    
    String estaturaTexto = teclado.nextLine();
    int estatura = Integer.parseInt (estaturaTexto);
    System.out.println("La estatura de " + nombreMascota + " es " + estatura + " cm.");
    System.out.println("El valor de estatura es %d"  , estatura);
    
    
    String estaturaTexto = teclado.nextline();//leo estatura en modo texto
    int estatura = Integer.parseInt(: estaturaTexto);
    System.out.println("Estatura: " + estatura);
       
        
        
    
    //Cálculo de IMC
    double imc = (peso/(Math.pow(estatura 2)));
    }
    
}
