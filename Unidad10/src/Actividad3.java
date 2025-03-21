import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		System.out.println("//! Bienvenido a la consulta de tiempo ¡//");
		System.out.println("Fecha y hora actual: "+ahora.format(formatearFecha));
		
		System.out.println("Introduce el numero de dias que quieres sumar: ");
		int dias = leer.nextInt();
		
		System.out.println("Introduce el numero de horas que se quieres sumar: ");
		int horas = leer.nextInt();
		
		System.out.println("Introduce el número de minutos que deseas sumar");
		int minutos = leer.nextInt();
		
		LocalDateTime resultado = ahora.plusDays(dias).plusHours(horas).plusMinutes(minutos);
		
		System.out.println("La nueva fecha despues de sumar "+dias+" Dias, "+horas+" Horas, "+minutos+" minutos es: ");
		System.out.println(resultado.format(formatearFecha));
		
	}

}
