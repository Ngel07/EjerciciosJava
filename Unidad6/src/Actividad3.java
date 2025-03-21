import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
		String elementos[];
		int i;
		elementos= new String[20];
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce los caracteres para el Array");
		for (i=0;i < elementos.length; i++) {
			System.out.println("Introduce el valor "+i);
			elementos[i]  = leer.nextLine();
		}

		System.out.print("Las elementos introducidos son: ");
		System.out.println();
		
		for (i=0;i < elementos.length; i++) {
			
			System.out.print(elementos[i]+"-");
		
			if ((i+ 1) % 4 == 0) {
	            System.out.println();
	            }
		}  leer.close();
		

	}

}
