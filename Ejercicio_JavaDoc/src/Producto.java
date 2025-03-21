/**
 * @author luzan
 * @version 1.0
 * La clase Producto representa un producto con nombre y precio
 */

public class Producto {

    private String nombre;
    private double precio;
/**
 * Crea ka instancia del producto con nombre y precio
 * @param nombre del producto
 * @param precio del producto
 */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
/**
 * Obtiene el nombre del producto
 * @return el nombre del producto
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Obtiene el precio del producto
 * @return el precio del producto
 */
    public double getPrecio() {
        return precio;
    }
}