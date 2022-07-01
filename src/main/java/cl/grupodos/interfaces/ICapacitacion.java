package cl.grupodos.interfaces;

import java.util.List;

import cl.grupodos.modelo.Capacitacion;

public interface ICapacitacion {
public Capacitacion get(String id);
	
	public List<Capacitacion> getAll();
	
	public void addCapacitacion (Capacitacion capacitacion);


}
