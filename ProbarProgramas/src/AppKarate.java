
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class AppKarate {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al planificador de entrenamiento ATR para Karate Do");
        System.out.println("Selecciona la fase de entrenamiento:");
        System.out.println("1. Acumulación");
        System.out.println("2. Transformación");
        System.out.println("3. Realización");
        int fase = scanner.nextInt();

        String[] ejercicios = {};

        switch (fase) {
            case 1:
                ejercicios = new String[]{
                    "Calentamiento: 10 minutos de carrera suave",
                    "Técnica básica: 3 series de 10 repeticiones de Kihon (blo, gyaku, mae)",
                    "Resistencia: 5 series de 2 minutos de combate continuo",
                    "Fuerza general: 3 series de 15 flexiones, 15 sentadillas y 15 abdominales",
                    "Estiramientos: 10 minutos"
                };
                break;
            case 2:
                ejercicios = new String[]{
                    "Calentamiento: 10 minutos de carrera suave",
                    "Técnica avanzada: 3 series de 10 repeticiones de combinaciones complejas",
                    "Potencia: 5 series de 10 golpes con saco pesado",
                    "Velocidad: 5 series de 30 segundos de golpes rápidos",
                    "Estiramientos: 10 minutos"
                };
                break;
            case 3:
                ejercicios = new String[]{
                    "Calentamiento: 10 minutos de carrera suave",
                    "Simulación de combate: 5 rondas de 3 minutos con descanso de 1 minuto",
                    "Ajustes técnicos: 3 series de 10 repeticiones de técnicas específicas",
                    "Alta intensidad: 5 series de 30 segundos de sprints",
                    "Estiramientos: 10 minutos"
                };
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Ejercicios para la fase seleccionada:");
        for (String ejercicio : ejercicios) {
            System.out.println("- " + ejercicio);
        }

        System.out.println("¿Deseas guardar la planificación en un archivo? (s/n)");
        char guardar = scanner.next().charAt(0);

        if (guardar == 's' || guardar == 'S') {
            try (FileWriter writer = new FileWriter("planificacion_entrenamiento.txt")) {
                for (String ejercicio : ejercicios) {
                    writer.write(ejercicio + "\n");
                }
                System.out.println("Planificación guardada en 'planificacion_entrenamiento.txt'");
            } catch (IOException e) {
                System.out.println("Error al guardar el archivo.");
            }
        }

        scanner.close();
    }
}

