
package PUNTO5;

/**
 *
 * @author eblanco
 */
public class Producto {
    private int cantidad;
    private double iva;
    private double precio;

    public Producto(int cantidad, double iva, double precio) {
        this.cantidad = cantidad;
        this.iva = iva;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularPrecio(){
    costo=cantidad*precio-iva/100;
    return costo;
    }
    

    double costo=0;

    
}
