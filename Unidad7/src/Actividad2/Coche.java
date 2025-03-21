package Actividad2;

import java.util.Scanner;
import java.util.ArrayList;

public class Coche {
	
	private String matricula;
	private String color;
	private String modelo;
	private String marca;
	private int cilindrada;
	private boolean reparado;
	
	public Coche() {
		this.matricula="";
		this.color="";
		this.modelo="";
		this.marca="";
		this.cilindrada=0;
		this.reparado=false;
		
	}
	
	public Coche(String matricula, String color, String modelo, String marca, int cilindrada) {
		this.matricula=matricula;
		this.color=color;
		this.modelo=modelo;
		this.marca=marca;
		this.cilindrada=cilindrada;
		this.reparado=false;
		
	}
	// getters
	public String getMatricula() {
		return matricula;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public boolean isReparado() {
		return reparado;
	}
	
	//setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada=cilindrada;
	}
	
	public void setReparado(boolean reparado) {
		this.reparado=reparado;
	}
	
	public String toString() {
		return "Matricula: " + matricula 
				+ "- Color: " + color 
				+ "- Modelo: " + modelo 
				+ "- Marca: " + marca  
                + "- Cilindrada: " + cilindrada 
                + "- Reparado: " + reparado;
	}
}

