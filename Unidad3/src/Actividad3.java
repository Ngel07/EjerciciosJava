import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// Algoritmo para calcular la cuota del club
		
		//Definición de variables
		double cuota_gen=500, descMayor=0.5, descHijo=0.35, descMenor=0.25, cuotaPagar=0, descuento=0;
		int edad=0;
		String nombre = "";
		boolean hijo = false;
		
			
		Scanner leer = new Scanner(System.in);
		
		//Pide los datos al usuario
		System.out.println("Ingrese su nombre: ");
		nombre = leer.nextLine();
		
		System.out.println("Ingrese su edad: ");
		edad = leer.nextInt();
		
		leer.nextLine(); // se usa para que elbuffer elimine el caracter de lectura del número anterior y pueda funcionar correctamente
		
		if (edad<18) {
		System.out.println("¿Es hijo de socio? si/no: ");
		String esHijo = leer.nextLine();
		hijo = esHijo.equalsIgnoreCase("si");
		}
				
		
		if (edad>65) {
		     descuento = cuota_gen*descMayor;
		}	
		else if (edad<18) {
			 descuento = cuota_gen*descMenor;
		}
			
		else if (hijo) {
			 descuento = cuota_gen*descHijo;
		}
		
		else {
			descuento=0;
		}
		  
		//Calcular la cuota que debe pagar el nuevo socio
		cuotaPagar = cuota_gen - descuento;
		System.out.println("¡Hola! "+nombre+" el valor de su cuota es de :"+cuotaPagar+"€");
		leer.close();
		
	}		
		
}
	
	

