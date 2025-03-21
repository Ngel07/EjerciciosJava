package Actividad8_9_10;
public class Persona {
	Fecha fechaNacimiento;
	String nombre;
	String apellidos;
	String dni;
	String direccion;
	String email;
	
	
public Persona () {
	this.fechaNacimiento = null;
    this.nombre = "";
    this.apellidos = "";
    this.dni = "";
    this.direccion = "";
    this.email = "";
	}
	
	// constructor todos los parametris
	public Persona(Fecha fechaNacimento, String nombre, String apellidos, String dni, String direccion, String email) {

		this.fechaNacimiento = fechaNacimento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
	}
	
	// Constructor sin apellidos y direccion
	public Persona(Fecha fechaNacimento, String nombre, String dni, String email) {

		this.fechaNacimiento = fechaNacimento;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		
	}
	
	public String toString() {
		return "Persona [fechaNacimento=" + fechaNacimiento + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", direccion=" + direccion + ", email=" + email + "]";
	}
}
