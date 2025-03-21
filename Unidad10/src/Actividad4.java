import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		 System.out.println("Introduce la fecha y hora en formato YYYY/MM/DD hh:mm:ss:");
		 String fechaEntrada = leer.nextLine();
		 
		 //definir formatos de entrada y salida de la fecha
		 SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		 try {
			 Date fecha = formatoEntrada.parse(fechaEntrada);
			 
			 String fechaSalida = formatoSalida.format(fecha);
			 System.out.println("Fecha en formato solicitado: "+fechaSalida);
		 }catch(ParseException e) {
			 System.out.println("Error: el formato ingresado no es correcto. Debe usar YYYY/MM/DD hh:mm:ss"); 
		 }
		 
		 leer.close();
		 
	}

}
