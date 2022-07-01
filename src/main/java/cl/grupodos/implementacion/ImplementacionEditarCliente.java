package cl.grupodos.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupodos.interfaces.IEditarCliente;
import cl.grupodos.modelo.Cliente;

public class ImplementacionEditarCliente  implements IEditarCliente{
	
	private Connection cn = null; 
	
	public void add (Cliente c) {
		String sql = "Insert clientes(Rut, Nombre, Apellido, Edad) values ('"+c.getRut()+"','"+c.getNombre()+"', '"+c.getApellido()+"', '"+c.getEdad()+"')";
		try {
			Statement stm = cn.createStatement();
			stm.execute(sql);
			
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
	
	
	}
	@Override
	public List<Cliente> readAll() {
		String sql = "Select Rut, Nombre, Apellido, Edad FROM asesorias.clientes";
		ArrayList<Cliente>cliente = new ArrayList <Cliente> ();
		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				cliente.add(new Cliente(rs.getInt("Rut"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("Edad")));
			}
			rs.close();
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
				return cliente;
	
	}

	@Override
	public Cliente buscarRut (int rut) {
		String sql = "Select Rut, Nombre, Apellido, Edad FROM asesorias.clientes WHERE Rut = " + rut;
		Cliente cliente = null;
		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			cliente = new Cliente (rs.getInt("Rut"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("Edad"));
		
		}
		rs.close();
		stm.close();
		}catch (Exception e) {
			System.out.println("fallo readOne");
		}
				return cliente;
	
	}

	@Override
	public void actualizar(Cliente c) {
		String sql = "update clientes set nombre ='"+c.getNombre()+"', apellido ='"+c.getApellido()+"',edad ='"+c.getEdad()+"' WHERE Rut = '"+c.getRut()+"'";
		try {
			Statement stm = cn.createStatement();
			stm.executeQuery(sql);
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo update");
		}
	}

	@Override
	public void eliminarRut (int rut) {
		String sql = "delete clientes WHERE Rut = " + rut;
		try {
			Statement stm = cn.createStatement();
			stm.executeQuery(sql);
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo delete");
		}
		
	}

	
		
	
}
