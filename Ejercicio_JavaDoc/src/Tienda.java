
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una tienda de mascotas, gestiona las clases mascotas, clientes, productos y ventas
 */
public class Tienda {

    private List<Mascota> mascotas;
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Venta> ventas;

    /**
     * crea nueva instancia de tienda e inicializa las listas de mascotas, clientes, productos y ventas 
     */
    public Tienda() {
        this.mascotas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
/**
 * Agrega una nueva mascota a la clase tienda
 * @param mascota para agregar la mascota
 */
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
/**
 * Agrega un nuevo cliente  a la clase tienda
 * @param cliente para agregar un cliente
 */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
/**
 * Agrega un nuevo producto a la clase tienda 
 * @param producto para agregar producto
 */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
/**
 * Registra una nueva venta 
 * @param venta la venta a registrar
 */
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }
/**
 * Listar todas las mascotas disponibles que han sido resgistradas en tienda
 */
    public void listarMascotas() {
        for (Mascota mascota : mascotas) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Tipo: " + mascota.getTipo() + ", Edad: " + mascota.getEdad());
        }
    }
/**
 * Entrada principal del programa 
 * @param args
 */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Mascota mascota1 = new Mascota("Bobby", "Perro", 3);
        Cliente cliente1 = new Cliente("Ana Pérez", "ana@example.com");
        Producto producto1 = new Producto("Comida para perros", 20.0);

        tienda.agregarMascota(mascota1);
        tienda.agregarCliente(cliente1);
        tienda.agregarProducto(producto1);

        tienda.listarMascotas();
    }
}