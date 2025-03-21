package Actividad8_9_10;
import java.util. Scanner;


public class ActividadCuenta {


	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Creando Persona
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = leer.nextLine();
        System.out.print("DNI: ");
        String dni = leer.nextLine();
        System.out.print("Email: ");
        String email = leer.nextLine();
        
        //datos cliente == fecha,persona
        Fecha fechaNacimiento = new Fecha();
        Persona cliente = new Persona(fechaNacimiento, nombre, apellidos, dni, "", email);
        
        
        //crear una cuenta
        System.out.print("Número de cuenta: ");
        String numeroCuenta = leer.nextLine();
        System.out.print("Tipo de interés: ");
        double tipoInteres = leer.nextDouble();
        System.out.print("Saldo inicial: ");
        double saldoInicial = leer.nextDouble();
        
         Cuenta cuenta = new Cuenta(numeroCuenta, tipoInteres, saldoInicial, cliente);
        
        //solicitar el ingreso de datos 
        System.out.print("Ingrese cantidad para depositar: ");
        double cantidadIngreso = leer.nextDouble();
        cuenta.ingreso(cantidadIngreso);
        
        System.out.print("Ingrese la cantidad del reintegro: ");
        double cantidadReintegro = leer.nextDouble();
        cuenta.reintegro(cantidadReintegro);
        
        //realizar transferencia
        
        System.out.print("Número de cuenta destino para transferencia: ");
        leer.nextLine();
        String numeroCuentaDestino = leer.nextLine();
        // Crear otra cuenta que es el destino
        Cuenta cuentaDestino = new Cuenta(numeroCuentaDestino, tipoInteres, 0, new Persona());
	
           System.out.print("Ingrese cantidad para transferencia: ");
        	double cantidadTransferencia = leer.nextDouble();
        	cuenta.transferencia(cuentaDestino, cantidadTransferencia);
     
        System.out.println("Cuenta origen: " + cuenta);
        System.out.println("Cuenta destino: " + cuentaDestino);

             leer.close();
	}

}
