package EjercicioCOLA;

import java.util.LinkedList;
import java.util.Queue;

public class LocalQueue {
	private Queue<String> cola;
	
	//Constructor
	public LocalQueue() {
		this.cola= new LinkedList<String>();
	}
	
	//Metodo para añadir un elemento a la cola
	public void push(String elemento) {
		cola.offer(elemento);
	}
	
	//Metodo pop para obtener y eliminar el primer elemento de la cola
	public String pop() {
		return cola.poll();
	}
	
	//metodo para verififcar si la cola está vacía
	public boolean isEmpty() {
		return cola.isEmpty();
	}
	
	public int size() {
		return cola.size();
	}
}
