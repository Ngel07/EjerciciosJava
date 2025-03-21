package Actividad11;


enum ModoLinterna {
		LUZ_FIJA, PARPADEO_RAIPO, PARPADEO_LENTO
	}
	
public class Linterna {
	private ModoLinterna modoInicial;
	private int bateria;
	
	//Constructor
	public Linterna() {
		this.modoInicial = ModoLinterna.LUZ_FIJA;
		this.bateria = 1000;
	}
	
	public void cambiarModoLinterna(ModoLinterna cambioModo) {
		if (bateria> 0) {
			this.modoInicial = cambioModo;
			System.out.print("Modo cambiado a: "+cambioModo);
		}else 
			System.out.print("Batería insuficiente");
		}
	
	public void estadoLinterna() {
		System.out.println("Modo actual: " + modoInicial);
        System.out.println("Batería restante: " + bateria + "%");
	}
	public void encenderLinterna() {
		
		if(bateria >=0) {
			switch(modoInicial) {
			case LUZ_FIJA: bateria -=5; break;
			case PARPADEO_RAIPO : bateria -=10; break;
			case PARPADEO_LENTO : bateria -=4; break;
			default:
                System.out.println("Modo no reconocido.");
                break;
			}
			if (bateria < 0 || bateria == 0)
			System.out.println("La batería está agotada");
			else 
				System.out.println("Linterna está encendida.... Batría: "+bateria+ "%");
			}
		}
	}

