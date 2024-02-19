/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

/**
 *
 * @author vickyf
 */
public class CuentaCorriente extends Cuenta {

    private double interesFijo = 0.015;
    private double saldoMinimo;

    public CuentaCorriente(Persona cliente, double saldoMinimo) {
        super(cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresFijo() {
        return interesFijo;
    }

    public void setInteresFijo(double interesFijo) {
        this.interesFijo = interesFijo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void actualizarSaldo() {
        // Abona el interés fijo al saldo
        saldo += saldo * interesFijo;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= saldoMinimo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar la retirada.");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + ", interesFijo=" + interesFijo
                + ", saldoMinimo=" + saldoMinimo
                + '}';
    }

public CuentaCorriente(String numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
    }
}
