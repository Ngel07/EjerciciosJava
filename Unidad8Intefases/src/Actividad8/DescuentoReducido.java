package Actividad8;

public class DescuentoReducido implements Descuento {
	
	public double aplicarDescuento(double precioNormal) {
		return precioNormal *0.85;
	}

}
