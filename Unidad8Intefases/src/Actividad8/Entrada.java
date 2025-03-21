package Actividad8;

public class Entrada {
	private static int contador = 1;
	private int id;
	private Zona zona;
	private String nombreCliente;
	private Descuento descuento;
	
	public Entrada() {
		this.id= contador++;
		this.zona= zona;
		this.nombreCliente=nombreCliente;
		this.descuento=descuento;
	}
	
	public Entrada(Zona zona, String nombreComprador, Descuento descuento) {
		 this.id = contador++;
	     this.zona = zona;
	     this.nombreCliente = nombreCliente;
	     this.descuento = descuento;
	}
	
	public int getId() {
		return id;
	}
	
	public Zona getZona() {
		return zona;
	}
	
	public double getPrecio() {
		return descuento.aplicarDescuento(zona.getPrecioNormal());
	}
	
	public String toString() {
		return "Entrada ID: "+id
				+"/nZona: "+zona.getNombre()
				+"Comprador: "+nombreCliente
				+"Precio: "+getPrecio()+"€";
	}
}
