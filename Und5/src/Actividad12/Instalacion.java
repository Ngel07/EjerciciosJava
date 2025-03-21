package Actividad12;

public class Instalacion {
	
		Aparato aparato1;
		Aparato aparato2;
		Aparato aparato3;
		
		
	    private int consumoTotal;

	    // Constructor
	    public Instalacion(Aparato aparato1,Aparato aparato2,Aparato aparato3) {
	    		this.aparato1 = aparato1;
	    		this.aparato2 = aparato2;
	    		this.aparato3 = aparato3;
	    	this.consumoTotal = 0; 
	    }

	    
	    public void actualizarConsumo() {
	        consumoTotal= aparato1.getConsumo()+aparato2.getConsumo()+aparato3.getConsumo();
	    }

	   
	    public String mostrarConsumoTotal() {
	    	StringBuilder consumo = new StringBuilder();
	    	consumo.append("Consumo total es: ").append(consumoTotal).append("W");
	    	return consumo.toString();
	     	}
	    }

