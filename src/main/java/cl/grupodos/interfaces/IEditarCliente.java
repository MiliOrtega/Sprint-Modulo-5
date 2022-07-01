package cl.grupodos.interfaces;

import java.util.List;

import cl.grupodos.modelo.Cliente;

public interface IEditarCliente {
	
	public void add (Cliente c);
	public List<Cliente>readAll();
	public Cliente buscarRut(int rut);
	public void actualizar (Cliente c);
	public void eliminarRut (int rut);
	

}
