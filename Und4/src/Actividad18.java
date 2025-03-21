
public class Actividad18 {

	public static void main(String[] args) {
		// método mitad de una frase
		String frase1 = "Hola que tal";
		String frase2 = "Adios";
		
		//resultados
		System.out.println("Mitad inicial de \"" + frase1 + "\": " + mitadInicial(frase1));
        System.out.println("Mitad inicial de \"" + frase2 + "\": " + mitadInicial(frase2));

	}//metodo que divide la frase
	public static String mitadInicial(String saludo) {
		int mitad = saludo.length()/2;
		
		return saludo.substring(0, mitad);
	}
}
