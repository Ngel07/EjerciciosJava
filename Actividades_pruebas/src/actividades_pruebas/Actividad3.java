package actividades_pruebas;
import java.util.*;

public class Actividad3{
	
	
	public static int Contador1(int x, int y) {
		Scanner entrada=new Scanner(System.in);
		int num, c=0;
		
	if (x>0 && y>0) {
		System.out.println("Ingrese un numero: ");
		num=entrada.nextInt();
		
		if (num >= x && num <= y) {
			
			c++;
			System.out.println("\tNumero en el rango");
	
			
		}else {
			System.out.println("\tNumero fuera del rango");
		}
		
}else {
	c=-1;
}

entrada.close();
return c;

}
}


