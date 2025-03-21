package Actividad2;

public class Coche {
	
	enum TipoCoche {
		MINI, UTILITARIO, FAMILIAR, DEPORTIVO
	}
	enum ModalidadSeguro{
		TERCEROS, TODO_RIESGO
	}

		//Atributos
		String modelo;
		String color;
	    boolean pinturaMetalizada;
	    String matricula;
	    TipoCoche tipo;
	    int anioFabricacion;
	    ModalidadSeguro modalidadSeguro;
	    
	   

	//Constructor vacío
	public Coche() {
		modelo = "Unico";
		color = "blanco";
		pinturaMetalizada = false;
		matricula = "1111-AAA";
		tipo = TipoCoche.FAMILIAR;
		anioFabricacion = 2000;
		modalidadSeguro = ModalidadSeguro.TERCEROS;
	}
	//Constructor con parámetros
	public Coche(String modeloCoche, String colorCoche, boolean metalizada, String matriculaCoche,TipoCoche tipoCoche, int anio, ModalidadSeguro seguro) {
		modelo = modeloCoche;
		color = colorCoche;
		pinturaMetalizada = metalizada;
		matricula = matriculaCoche;
		tipo = tipoCoche;
		anioFabricacion = anio;
		modalidadSeguro = seguro;
	}
	public void mostrarInfo() {
		 System.out.println("Modelo: " + modelo);
	     System.out.println("Color: " + color);
	}
	
	public void mostrarInfoCompleta() {
		 System.out.println("Modelo: " + modelo);
	     System.out.println("Color: " + color);
	
	if (pinturaMetalizada) {
		System.out.println("Pintura metalizada: Sí");
	} else {
		System.out.println("Pintura metalizada: No");
	        }
	System.out.println("Matrícula: " + matricula);
    System.out.println("Tipo de coche: " + tipo);
    System.out.println("Año de fabricación: " + anioFabricacion);
    System.out.println("Modalidad de seguro: " + modalidadSeguro);
	}
}


