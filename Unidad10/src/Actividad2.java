import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println("Ingrese la fecha que desea calcular en formato AAAA/MM/DD");
		String fechaText = leer.nextLine();
		
		try {
			LocalDate fechaIngresada = LocalDate.parse(fechaText, formatearFecha);
			LocalDate fechaActual = LocalDate.now();
			
			if(fechaIngresada.isAfter(fechaActual)) {
				System.out.println("La fecha ingresada es mayor a la fecha actual.");
			}else {
				System.out.println("La fecha ingresada es menor a la fecha actual.");
			}
			
		}catch (DateTimeParseException e) {
			System.out.println("Formato de fecha inválido. Asegúrate de usar el formato YYYY/MM/DD.");
			}
		leer.close();
	}

}
