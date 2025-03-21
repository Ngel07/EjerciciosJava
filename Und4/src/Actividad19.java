
public class Actividad19 {

	public static void main(String[] args) {
		// Método que sustituye todas las ocurrencias de "es" por "no por"
		//declaracion de variable
		String cadenaInicial = "esto1234es5678bueno900";
		
		//llamado a la función
		String cadenaResultado = reemplazar(cadenaInicial);
		
		//mostrar resultados
		System.out.println("Cadena Inicial: "+cadenaInicial);
		System.out.println("Cadena Final: "+cadenaResultado);
	}
	//método que reemplaza los valores
	public static String reemplazar(String cadena) {
		return cadena.replace("es", "no por");
	}
}
