
public class Ruta {
	//Atributos
	String nombre;
	String  paso;
	boolean inicio = false;
	boolean cerrada;
	boolean esCiclica;
	int numeroPasos;
	String rutaHecha;
	
	//constructores
	public Ruta() {
		
	}
	
	public Ruta(String nombreRuta, boolean ciclica ) {
		nombre=nombreRuta;
		paso="";
		rutaHecha = "";
		inicio=true;
		cerrada=false;
		esCiclica=ciclica;
		numeroPasos=0;
	}
	
public boolean getInicio() {
	
	return inicio;
}
	
	
//métodos
	
	
//método Añadir paso
	public int AnadirPaso(String paso, boolean inicio, boolean cerrada){
		if (!PasoOK(paso)) {return -1;
		}
		if(rutaHecha != null && rutaHecha.contains("FIN")) {
			System.out.println("La ruta está cerrada");
			return -1;
		}
		if (inicio) {
			rutaHecha = "INICIO(" +paso +")-" + rutaHecha;
	    } 
		else if (cerrada) {
	    	if (rutaHecha.contains("circular")) {
	    		System.out.println("Al ser circular, la ruta se ha cerrado automáticamente");
	    		rutaHecha += paso;
	    	}else { rutaHecha += "FIN (" + paso + ")";
	    	}
	    	rutaHecha +="";
	    	
	    }else {rutaHecha += paso + "-";
	    
	    }numeroPasos++;
	    return 0;
	}
	
	//metodo Paso ok
	private boolean PasoOK(String paso) {
		if (paso == null) {
        return false; 
		}

		int countComas = 0;

		for (int i = 0; i < paso.length(); i++) {
			char c = paso.charAt(i);

        if (c == ',') {
            countComas++; 
        	} else if (c == ' ') {
        		return false;
        	} else if (c < '0' || c > '9') {
        		return false; 
        }
    }
		if (countComas != 1) {
			return false;
    }
		int posicionComa = paso.indexOf(',');
		if (posicionComa == 0 || posicionComa == paso.length() - 1) {
			return false;
		}

		return true;
	}
		
	//metodo mostrar info
	public void mostrarInfo() {
		System.out.println("La Información de la ruta es:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Los puntos de paso de la ruta: " +rutaHecha);
		System.out.println("El número de pasos de la ruta es: " +numeroPasos);
		
		if (esCiclica) {System.out.println("La ruta es circular.");}
		else { System.out.println("La ruta no es circular.");}
		
		if (cerrada) {
		    System.out.println("La ruta está cerrada.");
		} else {System.out.println("La ruta no está cerrada.");}
	}
}
	