package Actividad7;
public class ActividadFraccion {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(1, 4);  // Fracción 1/4
        Fraccion f2 = new Fraccion(1, 2);  // Fracción 1/2
        Fraccion f3 = new Fraccion();      // Fracción 0/1
        Fraccion f4 = new Fraccion(4);     // Fracción 4/1

        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multipliar(f4);
        Fraccion cociente = f1.dividir(f2);
        
        System.out.println("(" + f1.numerador + "/" + f1.denominador + ") + (" + f2.numerador + "/" + f2.denominador + ") = (" + suma.numerador + "/" + suma.denominador + ")");
        System.out.println("(" + f1.numerador + "/" + f1.denominador + ") - (" + f3.numerador + "/" + f3.denominador + ") = (" + resta.numerador + "/" + resta.denominador + ")");
        System.out.println("(" + f1.numerador + "/" + f1.denominador + ") * (" + f4.numerador + "/" + f4.denominador + ") = (" + producto.numerador + "/" + producto.denominador + ")");
        System.out.println("(" + f1.numerador + "/" + f1.denominador + ") / (" + f2.numerador + "/" + f2.denominador + ") = (" + cociente.numerador + "/" + cociente.denominador + ")");
	}

}
