import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		//crear un array de 5 enteros
		int[] numerosEnteros = new int[5];
		pedirNumeros(numerosEnteros);
		
		//Array declarado no creado
		int [] numerosSinCrear = null;
		pedirNumeros(numerosSinCrear);
	}
	
	public static void pedirNumeros(int[] array) {
		if(array == null) {
			System.out.println("Error: El segundo array no esta creado");
			return;
		}
		
		Scanner leer = new Scanner(System.in);
		int indice = 0;
		
		while(true)  {
			try{
				 System.out.println("Ingresa un número entero: ");
				 int numero = leer.nextInt();
				 
				 array[indice] = numero;
				 indice++;
			} catch (InputMismatchException e) {
				System.out.println("Error: El numero introducido no es válido. /nDebe ingresar un número entero");
				leer.nextLine(); 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: Se ha excedido el límite del Array");
				break;
		}
	}
	System.out.println("Visualizando el contenido del Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		System.out.println();
        leer.close();
	}

}	
	


