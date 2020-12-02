package es.uclm.esi.isoft2b01.iteracion1.Dominio;

public class Mesa {

	private int Id_Mesa;
	private EstadoMesa Estado = es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa.Libre;
	private Capacidad Capacidad;
	
	public Mesa(int id_Mesa) {
		this.Id_Mesa = id_Mesa;
	}
	
	public void cambiarEstado(EstadoMesa estado) {
		this.Estado = estado;
	}

}