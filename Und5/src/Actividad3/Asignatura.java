package Actividad3;

public class Asignatura {

	//Atributos
	 String nombre;
	 int codigo;
	 String curso;
	 
	//constructor 		 }
	 public Asignatura(String nomAsignatura, int codAsignatura, String curAsignatura) {
		 nombre = nomAsignatura;
		 codigo=codAsignatura;
		 curso=curAsignatura;
	 }
	//metodos
	 public String getNombre() {
		 return nombre;
	 }
	 public int getCodigo() {
		 return codigo;
	 }
	 public String getCurso() {
		 return curso;
	 }
}
