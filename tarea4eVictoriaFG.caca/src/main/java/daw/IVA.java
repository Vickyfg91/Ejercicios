/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author vickyfg
 */
public enum IVA {
    
    IVA7("Iva 7%", 0.07),
    IVA16("Iva 16%", 0.16),
    IVA21("Iva 21%", 0.21);
    
        private final String tipoIva;
        private final double valorIva;

    public String getTipoIva() {
        return tipoIva;
    }

    public double getValorIva() {
        return valorIva;
    }

    private IVA(String tipoIva, double valorIva) {
        this.tipoIva = tipoIva;
        this.valorIva = valorIva;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IVA{");
        sb.append("tipoIva=").append(tipoIva);
        sb.append(", valorIva=").append(valorIva);
        sb.append('}');
        return sb.toString();
    }
        
        
}
