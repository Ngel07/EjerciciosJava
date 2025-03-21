import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		//método para saludar por idioma
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        
        //El usuario elige el idioma
        System.out.println("Selecciona tu idioma de preferencia:");
        System.out.println("a - Valenciano");
        System.out.println("b - Castellano");
        System.out.println("c - Inglés");
        char idioma = leer.next().charAt(0);
        
        //llamar al método
        saludar(nombre,idioma);
        
        leer.close();
	}//menu elegir idioma de saludo
	 public static void saludar(String nombre, char idioma) {
	        String mensaje;
	        
	        switch (idioma) {
			case 'a':
				mensaje = "Bon dia " + nombre;
				break;
			case 'b':
				mensaje = "Buenos días " + nombre;
				break;
			case 'c':
				mensaje = "Good Morning "+ nombre;
				break;
			default:
				mensaje = "Elija una opción válida";
				break;
			}
	        System.out.print(mensaje);
	 }
}
