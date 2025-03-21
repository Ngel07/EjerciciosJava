
public class Validator {
	
	//variable del validador
	private String codigoP;
	private String dni;
	private String email;
	private String dirMAC;
	private String dirRed;
	private String formulario;
	
	//constructor vacio
	public Validator() {
		codigoP = null;
		dni = null;
		email = null;
		dirMAC = null;
		dirRed = null;
	}
	//constructor con parametros
	public Validator(String codigoP, String dni, String email, String dirMAC, String dirRed) {
		this.codigoP = codigoP;
		this.dni = dni;
		this.email = email;
		this.dirMAC = dirMAC;
		this.dirRed = dirRed;
	}
	//getters
	public String getCodigoP() {
		return codigoP;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDirMAC() {
		return dirMAC;
	}
	
	public String getDirRed() {
		return dirRed;
	}
	
	//Setters
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDirMAC(String dirMAC) {
		this.dirMAC = dirMAC;
	}
	
	public void setDirRed(String dirRed) {
		this.dirRed = dirRed;
	}
	public String mostrarInfo() {
		return "Codigo Postal: " +codigoP+"\n"
				+"DNI: "+dni+"\n"
				+"Email: "+email+"\n"
				+"Dirección MAC: "+dirMAC+"\n"
				+"Direccion Red: "+dirRed+"\n";
	}
}
