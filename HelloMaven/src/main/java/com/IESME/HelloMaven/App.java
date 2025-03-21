package com.IESME.HelloMaven;
import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Gson gson = new Gson();
    	Persona persona = new Persona("Angela Parra", 43);
    	String json = gson.toJson(persona);
        System.out.println(json);
    }
}

class Persona{
	String nombre;
	int edad;
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
}
