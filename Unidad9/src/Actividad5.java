import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		
		Alumno nuevoAlumno1 = new Alumno();
		Alumno nuevoAlumno2 = new Alumno();
		
		System.out.println(nuevoAlumno1.toString());
		System.out.println(nuevoAlumno2.toString());
		
		//Indicar cual delos alumnos es mayor
		if(nuevoAlumno1.getEdad()>nuevoAlumno2.getEdad()) {
			System.out.println("El alumno: "+nuevoAlumno1+" es el mayor");
		}else if (nuevoAlumno1.getEdad()<nuevoAlumno2.getEdad()) {
			System.out.println("El alumno: "+nuevoAlumno2+" es el mayor");
		}else 
			System.out.println("Los dos alumnos tienen la misma edad");
	}

}
