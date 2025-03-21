import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
	
	    private String nombre;
	    private String grupoMuscular;

	    Ejercicio(String nombre, String grupoMuscular) {
	        this.nombre = nombre;
	        this.grupoMuscular = grupoMuscular;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getGrupoMuscular() {
	        return grupoMuscular;
	    }

	    @Override
	    public String toString() {
	        return "-" + nombre + " (" + grupoMuscular + ")";
	    }
	}

class RutinaDeEjercicio {
	    private List<Ejercicio> rutina;

	    public RutinaDeEjercicio() {
	        this.rutina = new ArrayList<>();
	    }

	    public void agregarEjercicio(Ejercicio ejercicio) {
	        rutina.add(ejercicio);
	    }

	    public void mostrarRutina() {
	        if (rutina.isEmpty()) {
	            System.out.println("No hay ejercicios en la rutina.");
	        } else {
	            System.out.println("Rutina de Ejercicio:");
	            for (Ejercicio ejercicio : rutina) {
	                System.out.println(ejercicio);
	            }
	        }
	    }
}
