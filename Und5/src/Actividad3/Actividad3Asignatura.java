package Actividad3;
public class Actividad3Asignatura {

	public static void main(String[] args) {
		// instancia de asignatura
		Asignatura asignatura0 = new Asignatura("Matemáticas",1017, "1" );
		
		//Mostrar datos asignatura
		System.out.println("Los datos de la asignatura son: \n Nombre: "+asignatura0.getNombre()+
				"\n Codigo: "+asignatura0.getCodigo()+"\n Curso: "+asignatura0.getCurso());
	}

}
