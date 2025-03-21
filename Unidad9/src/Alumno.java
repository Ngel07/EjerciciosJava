import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private  int edad;
	private double altura;
	
	//constructor sin parámetros
	public Alumno() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa el nombre del alumno: ");
		this.nombre = leer.nextLine() ;
		
		while(true) {
			try {
				System.out.print("Ingresa la edad del alumno: ");
				this.edad = leer.nextInt();
				break;
			}catch (InputMismatchException e) {
				System.out.println("Error: Ingresa un número válido para la edad.");
				leer.nextLine();
			}
		}
		
		while(true) {
			try {
				System.out.print("Ingresa la estatura del alumno: ");
				this.altura = leer.nextDouble();
				break;
			}catch (InputMismatchException e ){
				System.out.println("Error: Ingresa un número válido para la estatura.");
				leer.nextLine();
			}
			
		}
			
	}
	
	public Alumno(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad=edad;
		this.altura=altura;		
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getAltura() {
		return altura;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	@Override
	public String toString() {
		return "La información del alumno es: "
				+ "\n Nombre: "+nombre
				+"Edad: "+edad+
				"Altura: "+altura;
	}
}
