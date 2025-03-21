
public class PruebaRuta {
	
		//Atributos
		String nombre;
		String  paso;
		boolean inicio;
		boolean cerrada;
		boolean esCiclica;
		int numeroPasos;
		String rutaHecha;
		
		//constructores
		public PruebaRuta() {
			nombre="nombreRuta";
			paso="";
			rutaHecha = "";
			inicio=false;
			cerrada=false;
			esCiclica=false;
			numeroPasos=0;
		}
		
		public PruebaRuta(String nombreRuta,boolean ciclica ) {
			nombre=nombreRuta;
			paso="";
			rutaHecha = "";
			inicio=false;
			cerrada=false;
			esCiclica=ciclica;
			numeroPasos=0;
		}
		

		//métodos

		
		//método Añadir paso
		public int AnadirPaso(String paso, boolean inicio, boolean cerrada){
			if(!PasoOK(paso)) {System.out.println("No se pudo añadir el paso.");
		    	return -1;}
			else{				
				if (inicio==true) {
					rutaHecha = "INICIO("+paso+")-";
					System.out.println("La ruta ha sido iniciada correctamente");
					numeroPasos++;}
				
				else if (inicio==false)System.out.print("No hay una ruta creada, debes iniciar una");			
				
				else if(cerrada==true) { 
					if(cerrada) {
							rutaHecha += "FIN(" + paso + ")"+rutaHecha; 
							System.out.println("La ruta está cerrada");
							}
			        
			        else if(cerrada && esCiclica) {
						System.out.println("Al ser circular, la ruta se ha cerrado automáticamente");}
			        else System.out.println("Ya se encuentra cerrada, el psao no se ha añadido");
				}
				else rutaHecha += paso + "-";
				System.out.println("El paso ha sido añadido correctamente");
				numeroPasos++;
				return 0;					
			}
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


