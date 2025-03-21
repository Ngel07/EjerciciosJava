
public class Actividad7 {

	public static void main(String[] args) {
		String[] cadenas = {"Primera Cadena","Segunda Cadena", "Tercera Cadena", null, "Cuarta Cadena" };
		mostrarCadenasArray(cadenas);
	}
	
	public static void mostrarCadenasArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null && !array[i].isEmpty()) {
				System.out.println("El primer carácter del elemento: "+array[i]+" es: "+array[i].charAt(0));
			}else {
				System.out.println("La posicion: "+i+" contiene un valor nulo o vacío");
			}
			
		}
	}

}
