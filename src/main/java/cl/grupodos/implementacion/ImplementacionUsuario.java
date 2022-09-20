package cl.grupodos.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupodos.conexion.Coneccion;
import cl.grupodos.interfaces.IUsuario;
import cl.grupodos.modelo.Usuario;

public class ImplementacionUsuario implements IUsuario{
private Connection coneccion; {
		
	}
	
	public ImplementacionUsuario() {
		coneccion = Coneccion.getInstance();
	}

	@Override
	public Usuario get(int id) {
		
		return null;
	}

	@Override
	public List<Usuario> getAll() {
		String sql = "Select id, Nombre, Apellido, Rut, TipoUsuario FROM asesorias.usuarios";
		List<Usuario> resultado = new ArrayList <Usuario>();
		try {
			Statement stm = coneccion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				resultado.add(new Usuario(rs.getString("id"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Rut"), rs.getString("TipoUsuario")));
			}
			rs.close();
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
				return resultado;
	}

	@Override
	public void addUsuario(Usuario usuario) {
		
		
String sql = "Insert Usuarios (id, Nombre, Apellido, Rut, TipoUsuario) values ('"+usuario.getId()+"', '"+usuario.getNombre()+"', '"+usuario.getApellido()+"', '"+ usuario.getRut()+"', '"+ usuario.getTipoUsuario()+"')";
		
		try {
			Statement stm = coneccion.createStatement();
			stm.execute(sql);
			
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo addUsuario");
		}
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		String sql = "update Usuarios set nombre ='"+usuario.getNombre()+"', apellido ='"+usuario.getApellido()+"',rut ='"+usuario.getRut()+"', tipoUsuario = ´"+usuario.getTipoUsuario()+" WHERE id = '"+usuario.getId()+"'";
		try {
			Statement stm = coneccion.createStatement();
			stm.executeQuery(sql);
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo actualizar usuario");
		}
	}

	@Override
	public void eliminarUsuario(int id) {
		String sql = "delete clientes WHERE Id = " + id;
		try {
			Statement stm = coneccion.createStatement();
			stm.executeQuery(sql);
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo delete usuario");
		}
		
	}

	@Override
	public void actualizarUsuario() {
		// TODO Auto-generated method stub
		
	}
	

}
