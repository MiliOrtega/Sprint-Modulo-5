package cl.grupodos.lista;

import java.util.ArrayList;
import java.util.List;

import cl.grupodos.modelo.Usuario;

public class ListaUsuarios {
	
	private static ListaUsuarios usuario;
	private static  List<Usuario> lista;
	
	private ListaUsuarios() {
		
	}
	
	public static ListaUsuarios getInstance() {
		
		if (usuario == null) {
			 usuario = new ListaUsuarios ();
			 lista = new ArrayList<Usuario>();
		 }
		 
		 return usuario;
	}
		
	public List<Usuario> getList(){
		return lista;
	}	

}
