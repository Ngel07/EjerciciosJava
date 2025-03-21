package Actividad1;
import java.util.ArrayList;

public class Empleado {
	String nombre;
	String apellidos;
	double sueldo;	
	
	public Empleado () {
		this.nombre = "";
	    this.apellidos = "";
	    this.sueldo = 0;
		}
	
	public Empleado (String nombre, String apellidos, double sueldo) {
		this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.sueldo = sueldo;
		}
	
	//Getters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellidos;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public String toString() {
		return "\nNombre completo: " + nombre+" "+apellidos+ " Sueldo: " +sueldo+" €";
	}
}
