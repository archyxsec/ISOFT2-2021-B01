package es.uclm.esi.isoft2b01.iteracion1.Dominio;

public class GestoMesa {

	/**
	 * 
	 * @param Id_Mesa
	 */
	public boolean MarcarMesa(int Id_Mesa) {
		// TODO - implement GestoMesa.MarcarMesa
		throw new UnsupportedOperationException();
	}
	
	public boolean cambiarEstadoMesa(Mesa m, EstadoMesa estado) {
		m.cambiarEstado(estado);
		return true;
	}

}