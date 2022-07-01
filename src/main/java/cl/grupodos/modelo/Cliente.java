package cl.grupodos.modelo;

public class Cliente {
	private int rut;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Cliente() {
		
	}

	public Cliente(int rut, String nombre, String apellido, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	

}
