import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		// algoritmo para calcular una funcion
		// variables solicitud a usuario
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int n = leer.nextInt();
		
		//llamado al método
		int resultado = funcionX(n);
		
		System.out.print("funcionX(" + n + ") = " + resultado);
		
		leer.close();

	} //calculo de la funcionX
	public static int funcionX(int n) {
		 if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        } else if (n == 2) {
	            return 2;
	        } else {
	        	return funcionX(n-3)+2* funcionX(n-2) + funcionX(n-1);	        }
	}
}
