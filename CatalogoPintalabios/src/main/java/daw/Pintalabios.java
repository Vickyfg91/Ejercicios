/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author vickyfg
 */
public class Pintalabios {
    private String marca;
    private String gama;
    private String color;
    private String efecto;
    private int codigoBarras;
    private int stock;
    
    //Constructor por defecto
    public Pintalabios() {
    }    
    
    //Constructor parametrizado

    public Pintalabios(String marca, String gama, String color, String efecto, int codigoBarras, int stock) {
        this.marca = marca;
        this.gama = gama;
        this.color = color;
        this.efecto = efecto;
        this.codigoBarras = codigoBarras;
        this.stock = stock;
    }
        
    //Constructor copia
    public Pintalabios(Pintalabios origen) {
        this.marca = origen.marca;
        this.gama = origen.gama;
        this.color = origen.color;
        this.efecto = origen.efecto;
        this.codigoBarras = origen.codigoBarras;
        this.stock = origen.stock;
    }
    
    //Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    
    //TOSTRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pintalabios{");
        sb.append("marca=").append(marca);
        sb.append(", gama=").append(gama);
        sb.append(", color=").append(color);
        sb.append(", efecto=").append(efecto);
        sb.append(", codigoBarras=").append(codigoBarras);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }

    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.gama);
        hash = 29 * hash + Objects.hashCode(this.color);
        hash = 29 * hash + Objects.hashCode(this.efecto);
        hash = 29 * hash + this.codigoBarras;
        hash = 29 * hash + this.stock;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pintalabios other = (Pintalabios) obj;
        if (this.codigoBarras != other.codigoBarras) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.gama, other.gama)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.efecto, other.efecto);
    }

    
   
    
    
}
