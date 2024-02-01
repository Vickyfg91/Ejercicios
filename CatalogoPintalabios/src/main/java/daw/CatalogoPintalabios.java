/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Collections;

/**tring marca, String gama, String color, String efecto, int codigoBarras
 *
 * @author vickyfg
 */
public class CatalogoPintalabios {

    public static void main(String[] args) {
 
        Pintalabios p1 = new Pintalabios ("Borjous", "Velvet", "Rojo", "Mate", 87549632, 7);
        Pintalabios p2 = new Pintalabios (p1);
        Pintalabios p3 = new Pintalabios ("MAYBELLINE", "Superstay", "Seductress", "Satinado", 87524681, 8);
        Pintalabios p4 = new Pintalabios (p3);
        Pintalabios p5 = new Pintalabios ("Lacome", "Mademoiselle Shine", "Red Brown", "Brillo", 87265845, 4);
        
        //Añadir objetos a la lista
        ArrayList<Pintalabios> lista = new ArrayList<>();
            lista.add(new Pintalabios ("Borjous", "Velvet", "Rojo", "Mate", 87549632, 7));
            lista.add(new Pintalabios (p1));
            lista.add(new Pintalabios ("MAYBELLINE", "Superstay", "Seductress", "Satinado", 87524681, 8));
            lista.add(new Pintalabios (p3));
            lista.add(new Pintalabios ("Lacome", "Mademoiselle Shine", "Red Brown", "Brillo", 87265845, 4));
        lista.forEach(System.out::println);
        
        //Ordenar por efecto
        Collections.sort(lista, (p1, p3) -> p1.getEfecto().compareToIgnoreCase(p3.getEfecto()));
           
       lista.forEach(System.out::println);
           
        
    }
}
