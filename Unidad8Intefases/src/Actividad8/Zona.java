package Actividad8;

public class Zona {
	
	private String nombre;
	private int localidadesTotales;
	private int localidadesVendidas;
	private double precioNormal;
	private double precioAbonado;
	
	public Zona() {
		this.nombre=nombre;
		this.localidadesTotales=localidadesTotales;
		this.localidadesVendidas=0;
		this.precioNormal=precioNormal;
		this.precioAbonado=precioAbonado;
	}
	
	public Zona(String nombre,int localidadesTotales, double precioNormal, double precioAbonado) {
		this.nombre=nombre;
		this.localidadesTotales=localidadesTotales;
		this.localidadesVendidas=0;
		this.precioNormal=precioNormal;
		this.precioAbonado=precioAbonado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getLocalidadesTotales() {
		return localidadesTotales;
	}
	
	public int getLocalidadesVendidas() {
		return localidadesVendidas;
	}
	
	public double getPrecioNormal() {
		return precioNormal;
	}
	
	public double getPrecioAbonado() {
		return precioAbonado;
	}
	
	public boolean venderEntrada() {
		if(localidadesVendidas<localidadesTotales) {
			localidadesVendidas++;
			
			return true;
		}else return false;
	}
	
	@Override
	public String toString() {
		return "Zona: "+nombre
				+"/n Localidades vendidas: "+ localidadesVendidas
				+"/"+localidadesTotales;
	}
	
	
	
}
