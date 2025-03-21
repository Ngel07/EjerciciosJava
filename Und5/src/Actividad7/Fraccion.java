package Actividad7;

public class Fraccion {
	
	//variables
	int numerador;
	int denominador;
	
	//constructor sin parametros
	public Fraccion() {
		numerador =0;
		denominador=1;
	}
	//constructor con dos parametros
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
	}
	
	public Fraccion sumar(Fraccion fr) {
        int nuevoNum = this.numerador * fr.denominador + fr.numerador * this.denominador;
        int nuevoDen = this.denominador * fr.denominador;
        return new Fraccion(nuevoNum, nuevoDen);
	}
	public Fraccion restar(Fraccion fr) {
        int nuevoNum = this.numerador * fr.denominador - fr.numerador * this.denominador;
        int nuevoDen = this.denominador * fr.denominador;
        return new Fraccion(nuevoNum, nuevoDen);
	}
	public Fraccion multipliar(Fraccion fr) {
        int nuevoNum = this.numerador * fr.numerador;
        int nuevoDen = this.denominador * fr.denominador;
        return new Fraccion(nuevoNum, nuevoDen);
	}
	public Fraccion dividir(Fraccion fr) {
        int nuevoNum = this.numerador * fr.denominador;
        int nuevoDen = this.denominador * fr.numerador ;
        return new Fraccion(nuevoNum, nuevoDen);
	}
	
}
