package EjercicioCOLA;

public class LanzarMensaje {

	public static void main(String[] args) {
		// Instancia de LocalQueue
		LocalQueue colaDeMensajes = new LocalQueue();
		
		añadirMensajes(colaDeMensajes);
		
		mostrarMensajes(colaDeMensajes);
	}
	
	public static void añadirMensajes(LocalQueue cola) {
		for(int i = 1; i<=10; i++) {
			cola.push("Mensajes" +i);
		}
	}
	
	public static void mostrarMensajes(LocalQueue cola) {
		while(!cola.isEmpty()) {
			System.out.println(cola.pop());
		}
	}
}
