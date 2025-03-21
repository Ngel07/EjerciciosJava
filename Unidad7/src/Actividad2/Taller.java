package Actividad2;
import java.util.ArrayList;

public class Taller {
	private ArrayList<Coche> cochesPendientes;
	private ArrayList<Coche> cochesReparados;
	
	public Taller() {
		cochesPendientes = new ArrayList<>();
		cochesReparados = new ArrayList<>();
	}
	
	public void registrarCoche(Coche coche) {
		cochesPendientes.add(coche);
	}
	
	public void registrarReparado(String matricula) {
		for (int i=0;i<cochesPendientes.size();i++) {
			Coche coche = cochesPendientes.get(i);
			if(coche.getMatricula().equals(matricula)) {
				coche.setReparado(true);
				cochesReparados.add(coche);
				cochesPendientes.remove(i);
				break;
			}
		}
	}
	
	public void registrarSalida(String matricula) {
		for(int i = 0; i<cochesReparados.size(); i++) {
			if(cochesReparados.get(i).getMatricula().equals(matricula)){
				cochesReparados.remove(i);
				break;
			}
		}
	}
	public void listarPendientes() {
		System.out.println("Coches registrados pendientes de reparar: ");
		for(int i=0; i<cochesPendientes.size();i++) {
			System.out.println(cochesPendientes.get(i));
		}
	}
	
	public void listarReparados() {
		System.out.println("Listado de coches reparados");
		for ( int i=0; i < cochesReparados.size();i++) {
			System.out.println(cochesReparados.get(i));
		}
	}
}
