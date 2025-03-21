import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		// programa para contar espacios en blanco y caracteres
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduce el texto a verificar: ");
		String texto = leer.nextLine();
		
		//llamado al método
		contarcEspYespacios(texto);
		
		leer.close();
		 
	}//método que compara y cuenta caracteres y espacios
	public static void contarcEspYespacios(String texto) {
		int cuentaEspacios = 0;
		int cuentaCaracterE = 0;
		
		 for (int i = 0; i < texto.length();i++) {
	          char caracter = texto.charAt(i); 
	                
	         if ((caracter >= '!' && caracter <= '/') || 
                     (caracter >= ':' && caracter <= '@') || 
                     (caracter >= '[' && caracter <= '`') || 
                     (caracter >= '{' && caracter <= '~') ||
                     (caracter == '¡') || 
                     (caracter == '¿')) {
                cuentaCaracterE++;
	         }else if (caracter == ' ') {
	                	cuentaEspacios++;    	
	         } 
		 }
		 //resultadoas
		 System.out.println("Espacios en blanco: " + cuentaEspacios);
	     System.out.println("Caracteres especiales: " + cuentaCaracterE);
	}
}
		
	

