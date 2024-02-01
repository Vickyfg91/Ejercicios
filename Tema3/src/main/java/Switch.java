/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vickyfg
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    char departamento = 'B';
    switch(departamento)
      {
        case 'A' :
            System.out.println("Desarrollo");
        break;
        
        case 'B' :
            System.out.println("Recursos Humanos");
        break;
        case 'C' :
            System.out.println("Finanzas");
        break;
        case 'D' :
            System.out.println("RRHH");
        default :
            System.out.println("Departamento no válido");
      }
        
    System.out.println("Código para el departamento es " +
            departamento);
   switch (departamento){
       case 'A' ->{
           //Código case A, sin BREAK
           System.out.println("Desarrollo");   
           
            }
        case 'B' -> {
            System.out.println("");
        }
     
    }
}}

    
    

