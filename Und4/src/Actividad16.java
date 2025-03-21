import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {
		//Algoritmo para mostrar métodos de la clase String 
		Scanner leer = new Scanner(System.in);
		
		//solicitud de datos al usuario
		System.out.print("Ingresa tu nombre: ");
		String nombre= leer.nextLine();
		System.out.print("Ingresa tu primer apellido: ");
		String primerApellido = leer.nextLine();
		System.out.print("Ingresa tu segundo apellido: ");
		String segundoApellido= leer.nextLine();
		
		//concatenar
		String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;
		
		System.out.println("Nombre completo: "+nombreCompleto);
		
		//cambios de mayusculas y minusculas
		System.out.println("Nombre en minúsculas: "+ nombreCompleto.toLowerCase());
		System.out.println("Nombre en mayúsculas: "+ nombreCompleto.toUpperCase());
		System.out.println("Tiene:"+ nombreCompleto.length()+" letras");
		
		//extracción de substrins
		if (nombreCompleto.length()>=2) {
			System.out.println("Los dos primeros caracteres son: "+nombreCompleto.substring(0, 2));
			System.out.println("Los dos últimos caracteres son: "+nombreCompleto.substring(nombreCompleto.length()-2));
		}
		
		//conteo de caracteres determinados en la misma cadena
		char ultimoCaracter = nombreCompleto.charAt(nombreCompleto.length()-1);
		int ocurrencias = 0;
		
		for(int i = 0;i<nombreCompleto.length();i++) {
			if (nombreCompleto.charAt(i) == ultimoCaracter)
			ocurrencias++;
		}System.out.println("Número de ocurrencias del último carácter ('" + ultimoCaracter + "'): " + ocurrencias);
		
		//cambios mayuscula/minuscula de caracteres determinados
		char caracter1 = nombreCompleto.charAt(0);
        String cadenaConMayuscula = nombreCompleto.replace(caracter1, Character.toUpperCase(caracter1));
        System.out.println("Cadena con el primer carácter en mayúscula: " + cadenaConMayuscula);
        
        //agregar caracteres a una cadena
        String cadenaConAsteriscos = "***" + nombreCompleto + "***";
        System.out.println("Cadena con asteriscos: " + cadenaConAsteriscos);
        
        //algun uso del string builder 
        String cadenaInvertida = new StringBuilder(nombreCompleto).reverse().toString();
        System.out.println("Cadena invretida: " + cadenaInvertida);

        leer.close();
	}
	
	
	
	
	
}
