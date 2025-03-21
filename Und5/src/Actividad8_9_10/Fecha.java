package Actividad8_9_10;

public class Fecha {
	int dia, mes, anio;
	
	//constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1900;
	}
	// constructor con parametros
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		if (!fechaCorrecta()) {
			 System.out.println("La fecha no es correcta, puede cambiarla o será asignada por defecto");
	            this.dia = 1;
	            this.mes = 1;
	            this.anio = 1900;
	        }
		}
		
	public boolean fechaCorrecta() {
		if(mes<1|| mes>12) {
			return false;
		}if (dia<1 || dia>diasMes()) {
			return false;
		}if(anio<1900) {
			return false;
		}return true;
		
	}
	public int diasMes() {
		switch(mes){
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return 28;
		case 1: case 3: case 10: case 5: case 7: case 8: case 12:
			return 31;
		default:
			return 0;
		}
	}
	
	public void diaSiguiente() {
        dia++;
        if (dia > diasMes()) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
               }
            }
       }
	public void modificarFecha(int d, int m, int a) {
		dia=d;
		mes=m;
		anio=a;		
	}
	public String toString() {

		return anio + "-" + mes + "-" + dia;
	}
}
