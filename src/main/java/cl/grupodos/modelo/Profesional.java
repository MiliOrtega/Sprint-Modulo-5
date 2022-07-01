package cl.grupodos.modelo;

public class Profesional {
	
	private String nombre;
	private String profesion;
	
	public Profesional() {
		
	}
	public Profesional(String nombre, String profesion) {
		super();
		this.nombre = nombre;
		this.profesion = profesion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	@Override
	public String toString() {
		return "Profesional [nombre=" + nombre + ", profesion=" + profesion + "]";
	}

}
