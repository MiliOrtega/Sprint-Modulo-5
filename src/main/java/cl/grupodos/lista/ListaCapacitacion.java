package cl.grupodos.lista;

import java.util.ArrayList;
import java.util.List;

import cl.grupodos.modelo.Capacitacion;

public class ListaCapacitacion {
	
	private static ListaCapacitacion capacitacion;
	private static  List<Capacitacion> lista;
	
	private ListaCapacitacion () {
		
	}
	
	public static ListaCapacitacion getInstance() {
		
		if (capacitacion == null) {
			 capacitacion = new ListaCapacitacion ();
			 lista = new ArrayList<Capacitacion>();
		 }
		 
		 return capacitacion;
	}
	
	public List<Capacitacion> getList(){
		return lista;
	}

}
