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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factura f = FactoriaFactura.getFactura("iva");
        //Factura f =  new FactoriaFactura.getFactura("iva"); 
        f.setFacturaId(1);
        f.setFacturaNumero(001);
        f.setImporte(100);
        System.out.println(f.getImporteIva());
        
    }
    
}
