import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		// Algoritmo para calcular el número de la suerte
		
		Scanner leer = new Scanner(System.in);
		
		//solicitud de datos al usuario
		System.out.println("Vamos a conocer tu número de las suerte...");
		System.out.print("Ingresa tu facha de nacimiento. Usa este formato DD/MM/AAAA : ");
		String fecha = leer.nextLine();
		
		//llamado a funciones
		String numerosFecha = soloNumeros(fecha);
		int luckyNum = sumarFecha(numerosFecha);
		
		//mostrar resultado
		System.out.println("Tu número de la suerte es: "+luckyNum);
		
		
		leer.close();
		
	} // quita caracteres no numericos
	public static String soloNumeros (String fecha) {				
		return fecha.replaceAll("/", "");
		}
	//realiza la suma hasta reducir a un dígito
	public static int sumarFecha(String numerosFecha) {
		int suma; 
        
		do {
			suma=0;
			for (int i = 0; i < numerosFecha.length(); i++) {
            suma += Character.getNumericValue(numerosFecha.charAt(i));
			}
			numerosFecha = Integer.toString(suma);
		}while (suma>9);
       
		return suma;
	}
		
}



