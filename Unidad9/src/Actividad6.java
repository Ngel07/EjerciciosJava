
public class Actividad6 {

	public static void main(String[] args) {
		int numero = 2;
		int[] array = {-2, -1, 0, 1, 2};
		
		dividirEntreArray(numero, array);
	}

	public static void dividirEntreArray(int numero, int[] array) {
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] == 0) {
				System.out.println("Error: de division por cero");
			}else {
				int resultado = numero/array[i];
				System.out.println(numero + " / " + array[i] + " = " + resultado);
			}
		}
	}
}
