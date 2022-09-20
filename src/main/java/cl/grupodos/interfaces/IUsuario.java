package cl.grupodos.interfaces;

import java.util.List;

import cl.grupodos.modelo.Usuario;

public interface IUsuario {

	public Usuario get(int id);
	
	public List<Usuario> getAll();
	
	public void addUsuario (Usuario usuario);	
	
	
	public void eliminarUsuario (int id);

	 public void actualizarUsuario(Usuario usuario);

	void actualizarUsuario();
	
	


}
