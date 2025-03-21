package EjercicioPILA;

import java.util.ArrayList;

public class PILA {
	private ArrayList<Character> elementos;
	
	//Constructor
	public PILA() {
		this.elementos = new ArrayList<>();
	}
	
	//Metodo Añadir elemento a la pila
	public void push(char elemento) {
		elementos.add(elemento);
	}
	
	//Extraer el ultimo elemento añadido
	public char pop() {
		if(elementos.isEmpty()) {
			System.out.println("La pila está vacía");
		}
		return elementos.remove(elementos.size()-1);
	}
	
	public char peek() {
		if(elementos.isEmpty()) {
			System.out.println("La pila está vacía");
		}return elementos.get(elementos.size()-1);
	}
	
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
	public int size() {
		return elementos.size();
		}
}
