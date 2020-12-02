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


	public void crearPedido(Pedido p) {
		/*Prototipo de creación de un pedido y incluirlo en la bd, solo mostraremos el pedido*/
		System.out.println("Pedido realizado: " + p.toString());
		
	}


	public void cerrarPedido(Pedido pedido1) {
		/*Prototipo de cerrar un pedido y borrarlo de la bd*/
		pedido1.setEstado("Cerrado");
		System.out.println("Pedido " + pedido1.getID() + " cerrado: ");
	}


	public double getCuenta(Pedido pedido1) {
		pedido1.setEstado("Pagando");
		return pedido1.getPrecio();
	}


	public void pagarCuenta(Pedido pedido2) {
		/*Se simula que se accede a la BD, comprobando la tarjeta del usuari, su saldo, cuenta, etc... Se añade como pagado, y cambiamos el estado*/
		System.out.println("Pago del pedido: " + pedido2.getID() + " efectuado con éxito");
		pedido2.CambiarEstado("Pagado");
	}

}