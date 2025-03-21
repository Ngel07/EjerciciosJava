package Actividad8;

import java.util.Iterator;

public class Teatro {
	private Zona[] zonas;
	
	public Teatro() {
		
		zonas  = new Zona[] {
				new Zona("Principal", 200, 25, 17.5),
				new Zona("Palco", 40, 70, 40),
				new Zona("Central", 400, 20, 14),
				new Zona("lateral", 100, 15.5, 10)
		};
		
	}

	public boolean venderEntrada(String nombreZona,String tipoEntrada) {
	
		for (int i = 0; i < zonas.length; i++) {
			if (zonas[i].getNombre().equals(nombreZona)) {
				if(zonas[i].venderEntrada()){
					double precio = calcularPrecio(zonas[i], tipoEntrada);
					System.out.println("Precio de la entrada: "+precio+"€");
					return true;
				}else {
					System.out.println("No hay localidades disponibles en esta zona" +nombreZona);
					return false;
				}
						
			}
		}System.out.println("No se reconoce esta zona");
		return false;
	}
	
	private double calcularPrecio(Zona zona, String tipoEntrada) {
		switch (tipoEntrada.toLowerCase()) {
		case "normal":
			return zona.getPrecioNormal();
		case "reducida":
			return zona.getPrecioNormal()*0.85;
		case "abonado":
			return zona.getPrecioAbonado();
		default:
			System.out.println("Tipo de entrada no valido, Aplica precio normal.");
			return zona.getPrecioNormal();
		}
	}
	public void consultarZona(String nombreZona) {
		for (int i = 0; i < zonas.length; i++) {
			if(zonas[i].getNombre().equals(nombreZona)) {
				System.out.println(zonas[i]);
				return; 
			}
		}System.out.println("Zona no encontrada");
	}
	
	public void informeZonas() {
		for (int i = 0; i < zonas.length; i++) {
			System.out.println(zonas[i]);
		}
	}
}
