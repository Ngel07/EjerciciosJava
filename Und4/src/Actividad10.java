import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		//variables
		int opcion;
		
		//scanner
		Scanner leer = new Scanner(System.in);
		
		
		//lectura del scanner
		System.out.print("Escribe una palabra: ");
        String palabra1 = leer.nextLine();
        
        System.out.print("Escribe la segunda palabra: ");
        String palabra2 = leer.nextLine();
        
        System.out.print("Escribe la última palabra: ");
        String palabra3 = leer.nextLine();
	
        //
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
            	case 1:
            		System.out.println("La palabra más larga es: " + pMax(palabra1, palabra2, palabra3));
            		break;
            	case 2:
            		System.out.println("La palabra más corta es: " + pMin(palabra1, palabra2, palabra3));
            		break;
            	case 3:
            		contarVocales(palabra1, palabra2, palabra3);
            		break;
            	case 0:
            		System.out.println("Adios!");
            		break;
            	default:
            		System.out.println("Opción no válida. Inténtalo nuevamente");
            		}
            }while (opcion !=0 );
            leer.close();
        }
                		
	       		public static void mostrarMenu(){  
	       			
	       			System.out.println("MENÚ PRINCIPAL");
	       			System.out.println("==============");
	       			System.out.println("1.- Palabra más larga.");
	       			System.out.println("2.- Palabra más corta.");
	       			System.out.println("3.- Número de vocales de las palabras.");
	       			System.out.println("0.- Salir");
	       	}
	       		
	       	//metodo para hallar la palabra mas larga	
	       	public static String pMax (String p1, String p2, String p3)	{
	       		String masLarga =p1;
	       		
	       		if (p2.length() > masLarga.length()) {
	       			masLarga = p2;
	       		} if (p3.length()>masLarga.length()) {
	       			masLarga = p3;
	       		}return masLarga;
	       	}
	       	
	      //metodo hallar palabra corta
	       	public static String pMin (String p1, String p2, String p3)	{
	       		String masCorta =p1;
	       		
	       		if (p2.length() < masCorta.length()) {
	       			masCorta = p2;
	       		} if (p3.length()< masCorta.length()) {
	       			masCorta = p3;
	       		}
	       		return masCorta;
	       	}
	       	//llamada método para contar las vocales 
	       	public static void contarVocales(String p1, String p2, String p3) {
	            System.out.println("Número de vocales en cada palabra:");
	            System.out.println(p1 + ": " + contarVocalesP(p1));
	            System.out.println(p2 + ": " + contarVocalesP(p2));
	            System.out.println(p3 + ": " + contarVocalesP(p3));
	       	}
	       	//método contar las vocales
	       	public static int contarVocalesP(String palabra) {
	            int contador = 0;
	            String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

	            for (char letra : palabra.toCharArray()) {
	                if (vocales.indexOf(letra) != -1) {
	                    contador++;
	                }
	            }

	            return contador;
	} 	 

}
