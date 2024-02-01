
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class EjeServicioPatinetesPublicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        //Inicio del servicio 0.21€
        //Minuto de uso 0.15€
        //21% IVA
        //Queremos saber cuanto le cuesta el trayecto solicitando al usuario
        //el tiempo que duro el viaje 
        
      
       String textoUsuario = """
                       --------------------------------------
                                  Patin Municipal
                       --------------------------------------
                       Introduce el tiempo de uso 
                             de tu patin (minutos):
                      """; 
    String textoAux = JOptionPane.showInputDialog(textoUsuario); 
    //Guardar variable
    //Este resultado lo tengo que convertir en un double 
        //Imprimir pantalla en ventana emergente
    
    double tiempoUso = Double.parseDouble(textoAux); //Cambio de String a double
         
   //Declaro constantes del precio
    final double precioInicioServicio = 0.21; 
    final double precioServicioMinuto = 0.15;
    final double incrementoIva = 1.21;
    
    //Operaciones del programa
    double totalCosteTiempo = precioServicioMinuto * tiempoUso; //Hayo el coste de los minutos 
    double totalServicio = totalCosteTiempo + precioInicioServicio; //Añado el precion del Start
    double totalServicioIva = totalServicio * incrementoIva; //Añado el IVA
    
    String resultado = """
                             ---------------------------------------
                             El precio final del servicio
                             ---------------------------------------
                                                %.2f €
                             """ .formatted(totalServicioIva);  
    
   //Mostrar consola emergente el String
   JOptionPane.showMessageDialog(null , resultado);
   
    }
    
}

