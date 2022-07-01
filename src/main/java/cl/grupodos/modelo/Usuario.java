package cl.grupodos.modelo;

public class Usuario {
	
	private String id;
	private String nombre;
	private String apellido;
	private String rut;
	private String tipoUsuario;
	
	public Usuario() {
		
	}
	
	public Usuario(String id, String nombre, String apellido, String rut, String tipoUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.tipoUsuario = tipoUsuario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", tipoUsuario="
				+ tipoUsuario + "]";
	}

	public void addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	

}
