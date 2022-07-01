package cl.grupodos.lista;

import java.util.List;

import cl.grupodos.implementacion.ImplementacionUsuario;
import cl.grupodos.interfaces.IUsuario;
import cl.grupodos.modelo.Usuario;

public class UsuarioService {
	private IUsuario usuario = new ImplementacionUsuario();
	 
	 public Usuario get(int id) {
		return usuario.get(id);
	 }
	
	 public List<Usuario> getAll(){
		return usuario.getAll();
		 
	 }
	 
	 public void addUsuario (Usuario usuario) throws Exception {
			try {
				Integer idInteger = Integer.parseInt(usuario.getId());
			}
			catch (Exception e) {
				throw new Exception("id debe ser numerico");
			}
			if(usuario.getId()!= null) {
				throw new Exception("id ya existe");
			}
			
			
			usuario.addUsuario(usuario);
			
	 }

}
