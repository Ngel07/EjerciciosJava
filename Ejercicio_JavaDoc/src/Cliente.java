/**
 * @author luzan
 * @version 1.0
 * Clase cliente que representa un cliente
 */

public class Cliente {

    private String nombre;
    private String contacto;
/**
 * 
 * @param nombre del cliente
 * @param contacto del cliente
 */
    public Cliente(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }
/**
 * Obtiene el nombre del cleinte
 * @return el nombre del cliente
 */
    public String getNombre() {
        return nombre;
    }
    /**
     * obtiene el contacto del cliente
     * @return el contacto del cliente
     */

    public String getContacto() {
        return contacto;
    }
}