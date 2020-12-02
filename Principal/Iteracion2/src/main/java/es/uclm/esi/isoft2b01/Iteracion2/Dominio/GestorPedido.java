package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

public class GestorPedido {

	/**
	 * 
	 * @param p
	 */
	public String CambiarEstado(Pedido p) {
		// TODO - implement GestorPedido.CambiarEstado
		throw new UnsupportedOperationException();
	}

	
	public boolean anotarComanda(Comanda co,Pedido p) {
		p.setComanda(co);
		return true;
	}

}