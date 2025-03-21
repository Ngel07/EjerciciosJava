import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el código postal a verificar: ");
		String postal = leer.nextLine();
		
		if(postal.matches("^([0][1-9]|[1-4][0-9]|[5][0-2])[0-9]{3}$")) {
		System.out.println("\nEl codigo postal es válido: ");
		}else
		System.out.println("\nEl codigo postal no es válido: ");
		
		 leer.close();
	}

}
