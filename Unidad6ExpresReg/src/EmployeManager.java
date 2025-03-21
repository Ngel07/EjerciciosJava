
public class EmployeManager {
	//variable del employe manager
	private String nombre;
	private String apellidos;
	private String codigoP;
	private String dni;
	private String email;
	private String marcaOrdenador;
	private String modelo;
	private String dirRed;
	private String direccion;
	private String registro;
	
	//constructor vacio
	public EmployeManager() {
		nombre = null;
		apellidos = null;
		codigoP = null;
		dni = null;
		email = null;
		marcaOrdenador = null;
		modelo = null;
		dirRed = null;
		direccion = null;
	}
	//constructor con parametros
	public EmployeManager (String nombre, String apellidos,String codigoP, String dni, String email, String marcaOrdenador, String modelo, String dirRed, String direccion) {
		this.nombre = nombre;
		this.apellidos = nombre;
		this.codigoP = codigoP;
		this.dni = dni;
		this.email = email;
		this.marcaOrdenador = marcaOrdenador;
		this.modelo = modelo;
		this.dirRed = dirRed;
		this.direccion = direccion;
	}
	//getters
	public String getNombre () {
		return nombre;
	}
	
	public String getApellidos () {
		return apellidos;
	}
	
	public String getCodigoP() {
		return codigoP;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMarcaOrdenador() {
		return marcaOrdenador;
	}
	public String getModelo() {
		return modelo;
	}
	public String getDirRed() {
		return dirRed;
	}
	public String getDireccion () {
		return direccion;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setMarcaOrdenador(String marcaOrdenador) {
		this.marcaOrdenador = marcaOrdenador;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public void setDirRed(String dirRed) {
		this.dirRed = dirRed;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String mostrarInfo() {
		return  "\nDatos personales: "+"\n"
				+"Nombre: "+nombre+"\n"
				+"Apellidos: "+apellidos+"\n"
				+"Codigo Postal: " +codigoP+"\n"
				+"DNI: "+dni+"\n"
				+"Email: "+email+"\n"
				+"Dirección: "+direccion+"\n"
				+"Estación de trabajo: "
				+"Marca de Ordenador"+marcaOrdenador+"\n"
				+"Modelo: "+modelo+"\n"
				+"Direccion Red: "+dirRed+"\n";
	}	
}
