/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccunaleño;

/**
 *
 * @author fausto.gomez
 */
public class Producto {
    private String nombreProducto;
    private int cantProducto;
    private int precioProducto;
    private int costoTotalProducto;
    
    
    public Producto(String nombre, int cant, int precio) {
        this.nombreProducto = nombre;
        this.cantProducto = cant;
        this.precioProducto = precio;
        this.costoTotalProducto = cant * precio;
    }
    
    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the cantProducto
     */
    public int getCantProducto() {
        return cantProducto;
    }

    /**
     * @param cantProducto the cantProducto to set
     */
    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    /**
     * @return the precioProducto
     */
    public int getPrecioProducto() {
        return precioProducto;
    }

    /**
     * @param precioProducto the precioProducto to set
     */
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    public int calcularCostoTotalProducto(){
        costoTotalProducto = this.precioProducto * this.cantProducto;
        return costoTotalProducto;
    }

    public int getCostoTotalProducto() {
        return costoTotalProducto;
    }
    
    @Override
    public String toString(){
        return nombreProducto + " x" + cantProducto + " $" + costoTotalProducto;
    }
    
}
