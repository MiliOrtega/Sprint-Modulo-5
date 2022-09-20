package cl.grupodos.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupodos.conexion.Coneccion;
import cl.grupodos.interfaces.ICapacitacion;
import cl.grupodos.modelo.Capacitacion;

public class ImplementacionCapacitacion implements ICapacitacion{
private Connection coneccion; {
		
	}
	
	public ImplementacionCapacitacion() {
		coneccion = Coneccion.getInstance();
	}
	
	



	@Override
	public Capacitacion get(String id) {
				
		return null;
		
	}

	@Override
	public List<Capacitacion> getAll() {
		String sql = "Select id, nombreCapacitacion, lugar, hora FROM asesorias.capacitacion";
		List<Capacitacion> resultado = new ArrayList <Capacitacion>();
		try {
			Statement stm = coneccion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				resultado.add(new Capacitacion(rs.getString("id"), rs.getString("nombreCapacitacion"), rs.getString("lugar"), rs.getString("hora")));
			}
			rs.close();
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo getAll");
		}
				return resultado;
	}

	@Override
	public void addCapacitacion(Capacitacion capacitacion) {
		String sql = "Insert Capacitacion  (id, nombreCapacitacion, lugar, hora) values ('"+capacitacion.getId()+"', '"+capacitacion.getNombreCapacitacion()+"', '"+capacitacion.getlugar()+"', '"+ capacitacion.getHora()+"')";
		
		try {
			Statement stm = coneccion.createStatement();
			stm.execute(sql);
			
			stm.close();
		}catch (Exception e) {
			System.out.println("fallo addCapacitacion");
		}
	}

}
