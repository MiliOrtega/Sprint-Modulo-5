package cl.grupodos.lista;

import java.util.List;

import cl.grupodos.implementacion.ImplementacionCapacitacion;
import cl.grupodos.interfaces.ICapacitacion;
import cl.grupodos.modelo.Capacitacion;

public class CapacitacionService {
private ICapacitacion capacitacion = new ImplementacionCapacitacion();
	
	public Capacitacion get(String id) {
		return capacitacion.get(id);
	}
    
	public List<Capacitacion> getAll() {
		return capacitacion.getAll();
	}
	
	public void addCapacitacion(Capacitacion capacitacion) throws Exception {
		try {
			Integer idInteger = Integer.parseInt(capacitacion.getId());
		}
		catch (Exception e) {
			throw new Exception("id debe ser numerico");
		}
		if(capacitacion.getId()!= null) {
			throw new Exception("id ya existe");
		}
		
		capacitacion.addCapacitacion(capacitacion);
		
	}	
}
