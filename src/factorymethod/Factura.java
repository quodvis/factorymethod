/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author n
 */
public abstract class Factura 
{
    private int facturaId;
    private int facturaNumero;
    private int importe;

    public int getFacturaId() {
        return facturaId;
    }

    public int getFacturaNumero() {
        return facturaNumero;
    }

    public int getImporte() {
        return importe;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public void setFacturaNumero(int facturaNumero) {
        this.facturaNumero = facturaNumero;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    public abstract double getImporteIva();
    
    
}
