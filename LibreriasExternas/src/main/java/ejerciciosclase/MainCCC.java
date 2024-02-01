/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

/**
 *
 * @author vickyfg
 */
public class MainCCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(CuentaBancaria.NUMERO_DIGITOS);
        //Creamos una instancia 
        CuentaBancaria c1 = new CuentaBancaria("JC", "123F",
                400_000, 4.25);
        CuentaBancaria copiaC1 = new CuentaBancaria(c1);
        copiaC1 = c1;
        /*System.out.println("Num cuenta de c1 " + c1.getNumeroDeCuenta());
        //Métodos toString 
        System.out.println(c1);
        CuentaBancaria c2 = new CuentaBancaria("VFG", "123", 100_00, 1.25);
        System.out.println(c2);
        boolean retirada = c2.retirar(10);
        System.out.println("Retirada de 10 de c1: " + retirada);
        System.out.println(c1);*/
        
    
    }

}
