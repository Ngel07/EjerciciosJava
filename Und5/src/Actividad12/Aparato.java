package Actividad12;

public class Aparato {
	
	    private String nombre;
	    private int consumo; 
	    private boolean encendido; 

	    // Constructor
	    public Aparato(String nombre, int consumo) {
	        this.nombre = nombre;
	        this.consumo = consumo;
	        this.encendido = false; 
	    }

	    //métodos
	    public void encender() {
	        this.encendido = true;
	    }
	    
	    public void apagar(){
	    	this.encendido = false;
	    }
	    
	    public int getConsumo() {
	    	if(encendido) {
	    		return consumo;
	    	}else return 0;
	    }

	   public String mostrarEstado() {
		   StringBuilder estado = new StringBuilder();
	        estado.append(nombre).append(" (").append(consumo).append("W): ");
	        if (encendido) {
	            estado.append("Encendido");
	        } else {
	            estado.append("Apagado");
	        }
	        return estado.toString();
	   		}
}



