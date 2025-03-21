package Actividad8;

public class DescuentoAbonado implements Descuento {
	private double precioAbonado;
	
	public DescuentoAbonado(double precioAbonado) {
		this.precioAbonado = precioAbonado;
	}
	
	public double aplicarDescuento(double precioNormal) {
		return precioAbonado;
	}
	
}
