package Actividad6;

public class Reloj {

	//Atributos
	int hora;
	int minuto;
	int segundo;
	
	//Constructor por defecto
	public Reloj() {
		hora = 0;
		minuto = 0;
		segundo = 0;
	
	}
	//constructor con parametros
	public Reloj (int hora, int minuto, int segundo) {
		if(hora >= 0 && hora<=23) {
			this.hora = hora;
		}else {
			this.hora = 0;
		}
		if(minuto >= 0 && minuto<=59) {
			this.minuto = minuto;
		}else {
			this.hora = 0;
		}
		if(segundo >= 0 && segundo<=59) {
			this.segundo = segundo;
		}else {
			this.segundo = 0;
		}
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
		
	}public int getSegundo() {
		return segundo;
	}
	
	public void setHora(int hora) {
		if(hora >= 0 && hora<=23) {
			this.hora = hora;
			}
	}
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto<=59) {
			this.minuto = minuto;
			}
	}
	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
		}
	}
	public void formatoHora12() {
		int formato = hora % 12;
		if (formato == 0) formato = 12;
		String periodo = (hora < 12) ? "AM" : "PM";
		System.out.print(formato+":"+minuto+":"+segundo);
	}
	public void formatoHora24() {
		System.out.print(hora+":"+minuto+":"+segundo);
	}
	
	public void reiniciarReloj() {
		 this.hora = 0;
	     this.minuto = 0;
	     this.segundo = 0;
	}
	
	public void ponerRelojEnHora(int hora, int minutos) {
		 setHora(hora);
	     setMinuto(minutos);
	     setSegundo(0);
	}
	public void ponerRelojEnHora(int hora, int minutos,int segundos) {
		 setHora(hora);
	     setMinuto(minutos);
	     setSegundo(segundos);
	}
}
