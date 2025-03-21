package Actividad4;

public class Nif {
	//Atributos
	private int dni;
	private char letraNif;
	
	
	//Constructor
	public Nif(int dni) {
		this.dni = dni;
	}
	
	//metodos
	private char calcularNif() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		
		int modulo23 =  this.dni % 23;
		
		return letras.charAt(modulo23);
		}
	public void mostrarNif() {
        System.out.println("El NIF es: " + this.dni + " "+calcularNif());
	}
}
