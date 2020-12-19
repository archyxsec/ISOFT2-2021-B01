package es.uclm.esi.isoft2b01.iteracion1.Dominio;

public class Mesa {

	private int Id_Mesa;
	private EstadoMesa Estado = es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa.Libre;
	private Capacidad Capacidad;
	private int comensales;
	private int tiempopreparacion;
	
	public Mesa(int id_Mesa, Capacidad capacidad) {
		Id_Mesa = id_Mesa;
		Capacidad = capacidad;
	}
	

	public int getId_Mesa() {
		return Id_Mesa;
	}


	public void setId_Mesa(int id_Mesa) {
		Id_Mesa = id_Mesa;
	}


	public EstadoMesa getEstado() {
		return Estado;
	}


	public void setEstado(EstadoMesa estado) {
		Estado = estado;
	}


	public Capacidad getCapacidad() {
		return Capacidad;
	}


	public void setCapacidad(Capacidad capacidad) {
		Capacidad = capacidad;
	}
	
	public Mesa(int id_Mesa) {
		this.Id_Mesa = id_Mesa;
	}

	public void cambiarEstado(EstadoMesa estado) {
		this.Estado = estado;
	}
	public void setComensales(int comensales) {
		this.comensales = comensales;
	}


	@Override
	public String toString() {
		return "Mesa [Id_Mesa=" + Id_Mesa + ", Estado=" + Estado + ", Capacidad=" + Capacidad + "]";
	}

	public void setTiempoPreparacion(int tiempo) {
		this.tiempopreparacion = tiempo;
	}

	public int getTiempoPreparacion() {
		// TODO Auto-generated method stub
		return tiempopreparacion;
	}
	
	

}