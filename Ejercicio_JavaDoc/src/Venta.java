import java.util.Date;
/**
 * La clase venta que representa una venta que incluye un cliente, producto, fecha
 */
public class Venta {

    private Cliente cliente;
    private Producto producto;
    private Date fecha;
/**
 * Crea una nueva instancia de la clase venta con el cliente, producto y fecha 
 * @param cliente un cliente que realiza una compra en la tienda
 * @param producto el producto que se vende
 * @param fecha la fecha de la venta
 */
    public Venta(Cliente cliente, Producto producto, Date fecha) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
    }
/**
 * Obtiene el cliente que realiza la compra 
 * @return el cliente que realiza la compra
 */
    public Cliente getCliente() {
        return cliente;
    }
/**
 * Obtiene el rpoducto de la venta
 * @return el producto de la venta
 */
    public Producto getProducto() {
        return producto;
    }
/**
 * Obtiene la fecha de la venta
 * @return la fecha de la venta
 */
    public Date getFecha() {
        return fecha;
    }
}