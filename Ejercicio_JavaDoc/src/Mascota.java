/**
 * @author luzan
 * @version 1.0
 * La clase mascota representa una mascota con nombre, tipo y edad
 */

public class Mascota {

    private String nombre;
    private String tipo;
    private int edad;
/**
 * 
 * @param nombre de la amscota 
 * @param tipo de mascota 
 * @param edad la edad de la mascota 
 */
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
/**
 * Se obtiene el nombre de la mascota
 * @return el nombre de la mascota
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Obtiene el tipo de la mascota
 * @return el tipo de la mascota
 */
    public String getTipo() {
        return tipo;
    }
/**
 * Obtiene la edad de la mascota
 * @return la edad de la mascota
 */
    public int getEdad() {
        return edad;
    }
}