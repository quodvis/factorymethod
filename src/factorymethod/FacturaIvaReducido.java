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
public class FacturaIvaReducido extends Factura {

    @Override
    public double getImporteIva() {
        return getImporte()*1.07;
    }


}

