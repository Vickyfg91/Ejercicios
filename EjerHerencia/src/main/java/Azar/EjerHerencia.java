/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Azar;

/**
 *
 * @author vickyf
 */
public class EjerHerencia {

    public static void main(String[] args) {
        Dado dado = new Dado();
        int resultadoDado = dado.lanzar();
        System.out.println("Lanzar dado...\n Ha salido "   + resultadoDado);

        Moneda moneda = new Moneda();
        int resultadoMoneda = moneda.lanzar();
        System.out.println("Lanzar moneda...\n Ha salido " + resultadoMoneda);
    }
}
