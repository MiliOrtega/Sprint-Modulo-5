package cl.grupodos.modelo;

public class Administrativo {
	private String nombre;
	private String rut;
	private String fechaIngreso;
	
	public Administrativo() {
		
	}
	
	public Administrativo(String nombre, String rut, String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Administrativo [nombre=" + nombre + ", rut=" + rut + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	

}
