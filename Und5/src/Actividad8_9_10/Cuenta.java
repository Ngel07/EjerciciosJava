package Actividad8_9_10;
public class Cuenta {
	
	    String numeroCuenta;
	    double tipoInteres;
	    double saldo;
	    Persona cliente;
	    
	    
	 // Constructor
	    public Cuenta(String numeroCuenta, double tipoInteres, double saldo, Persona cliente) {
	        this.numeroCuenta = numeroCuenta;
	        this.tipoInteres = tipoInteres;
	        this.saldo = saldo;
	        this.cliente = cliente;
	    }
	    
	 // Método para realizar ingreso a la cuenta
	   public void ingreso(double cantidad) {
	       if (cantidad > 0) {
	    	   saldo += cantidad;
	            System.out.println("Ingreso realizado: " + cantidad);
	        } else {
	            System.out.println("La cantidad a ingresar debe ser positiva.");
	        }
	    }
	   
	   
	   // Método para raelizar reintegro
	    public void reintegro(double cantidad) {
	        if (cantidad > 0 && cantidad <= saldo) {
	            saldo -= cantidad;
	            System.out.println("Reintegro realizado: " + cantidad);
	        } else {
	            System.out.println("Reintegro no realizado. Verifique la cantidad.");
	        }
	    }
	    
	 // Método para transferencia
	    public void transferencia(Cuenta cuentaDestino, double cantidad) {
	        if (cantidad > 0 && cantidad <= saldo) {
	            this.reintegro(cantidad); 
	            cuentaDestino.ingreso(cantidad); 
	            System.out.println("Transferencia realizada: " + cantidad + " a la cuenta " + cuentaDestino.numeroCuenta);
	        } else {
	            System.out.println("Transferencia no realizada. Verifique la cantidad.");
	        }
	    }
	    
	    
	    public String toString() {
	        return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoInteres=" + tipoInteres + ", saldo=" + saldo
	                + ", cliente=" + cliente + "]";
	    	}
}
