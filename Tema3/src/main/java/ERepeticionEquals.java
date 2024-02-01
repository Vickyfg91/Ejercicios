
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class ERepeticionEquals {

    /**
     * @param args the command line arguments
     */
        // Todos los bucles tienen tres partes
        //1.- Inicialización de la variable de control
        //2.- Condición (Usando la variable de control)
        //3.- Actualizacón de la variable de control
        
        //En Java hay 3 bucles
        //mientras la condicion es verdadera
        // bucle while
        // bucle do-while
        // bucle for
    public static void main(String[] args) {
        
        int edad = 45; // Inicialización de la variable de control
        while (edad<=50){//Condición del bucle. Si es true se ejecuta otra vez
            System.out.println("Tu edad es : " + edad);
            edad++;//Actualización de la var. de control
        }
        System.out.println("Fuera del bucle while");
        
        //Bucle que no se ejecuta nunca
        while (edad>100&&edad<0){
            System.out.println("Hola");
        }
        
        //Bucle infinito
        while (edad>100){
            System.out.println("Hola.......");
            }
        
        // Bucle do while, ejecuta 1 y n veces
        String nombre;
        do{
            nombre = JOptionPane.showInputDialog("Escriba el nomre");
            System.out.println("Nombre " + nombre);
        }while(nombre.equalsIgnoreCase("Julia"));
   
        // Bucle for, se usa cuando se sabe el número de iteraciones a realizar
        int numero = 0;
        while (numero <=100){
            System.out.println("Número " + numero);
            numero++;
        }
        //Se usa cuando sabemos el numero de iteraciones 
        for (int numero2 = 0; numero2<=100; numero2++){
            System.out.println("Numero2" + numero2);
        }
    }
}

    

