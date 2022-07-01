package cl.grupodos.modelo;

public class Capacitacion {
	
	
		private String id;
		private String nombreCapacitacion;
		private String lugar;
		private String hora;
		
		public Capacitacion () {
			
		}
		
		
		public Capacitacion(String id, String nombreCapacitacion, String lugar, String hora) {
			super();
			this.id = id;
			this.nombreCapacitacion = nombreCapacitacion;
			this.lugar = lugar;
			this.hora = hora;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getNombreCapacitacion() {
			return nombreCapacitacion;
		}


		public void setNombreCapacitacion(String nombreCapacitacion) {
			this.nombreCapacitacion = nombreCapacitacion;
		}


		public String getlugar() {
			return lugar;
		}


		public void setLugar(String lugar) {
			this.lugar = lugar;
		}


		public String getHora() {
			return hora;
		}


		public void setHora(String hora) {
			this.hora = hora;
		}


		@Override
		public String toString() {
			return "Capacitacion [id=" + id + ", nombreCapacitacion=" + nombreCapacitacion + ", lugar=" + lugar + ", hora="
					+ hora + "]";
		}


		public void addCapacitacion(Capacitacion capacitacion) {
			// TODO Auto-generated method stub
			
		}

}
