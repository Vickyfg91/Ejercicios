/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author vickyfg
 */
public class CuentaBancaria {

    //Atributo de clase
    //Accesible mediante el nombre de la clase
    //No se usan con this
    //No es necesario crear ningun objeto para usar este atributo
    public static final int NUMERO_DIGITOS = 20;

    /*Atributos de instancia
    Accesible mediante el nombre del objeto
    Se usan con this
    HAY que crear un objeto cuenta para que cada cuenta tenga sus propios valores*/
    private final String numCuenta;
    private String nombre;
    private String nif;
    private double saldo;
    private double interes;//porcentaje

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        boolean respuesta = false;
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            respuesta = true;
        }
        return respuesta;
    }

    public void abonarIntereses() {
        this.saldo += (this.saldo * this.interes) / 100;
    }

    //Establecer en el constructor el numCuenta
    public CuentaBancaria(String nombre, String nif, double saldo, double interesMensual) {
        this.numCuenta = RandomStringUtils.randomNumeric(NUMERO_DIGITOS);
        this.nombre = nombre;
        this.nif = nif;
        this.saldo = saldo;
        this.interes = interes;
    }

    //Creacion Arrays para nombres        
    /*public static Empleado[] arrayEmpleado(int numEmpleados){
        
        Empleado[] arrayEmpleados = new Empleado[numEmpleados];
        for (int i = 0; i < arrayEmpleados.length; i++){
            arrayEmpleados
        }
    }*/

    //Construstor sin parámetros. Sobrecarga de métodos
    public String getNumeroDeCuenta() {
        return numCuenta;
    }

    public String getNombreCliente() {
        return nombre;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombre = nombreCliente;
    }

    public String getNifCliente() {
        return nif;
    }

    public void setNifCliente(String nifCliente) {
        this.nif = nifCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresMensual() {
        return interes;
    }

    public void setInteresMensual(double interesMensual) {
        this.interes = interesMensual;
    }

    private String generarNumeroDeCuenta() {
        // Utilizando la clase RandomStringUtils de Apache Commons Lang
        return RandomStringUtils.randomNumeric(20);
    }

}
