package EjercicioPILA;

public class Reverted {

	public static void main(String[] args) {
		// Funcion ShowReverted
		String cadena = "Texto de prueba PILA";
		showReverted(cadena);
	}
	public static void showReverted(String args) {
		PILA pila = new PILA();
		
		for(int i = 0; i<args.length(); i++) {
			pila.push(args.charAt(i));
		}
		
		StringBuilder cadenaRevertida = new StringBuilder();
		while(!pila.isEmpty()) {
			cadenaRevertida.append(pila.pop());
		}
		
		System.out.println(cadenaRevertida.toString());
	}
}
