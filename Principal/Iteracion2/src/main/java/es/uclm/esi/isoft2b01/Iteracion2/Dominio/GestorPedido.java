package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

import java.util.ArrayList;


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
	
    public ArrayList <Comanda> crearComandas(int numeroComandas) {
    	
    	String platos[] = {"macarrones","espaguetis","arroz","pollo","ensalada","especial"};
    	String bebidas[] = {"agua", "cocacola", "fanta", "cerveza", "vino"};
		
		ArrayList<Comanda> comandas = new ArrayList<Comanda>();
		
		for (int i = 0; i < numeroComandas; i++) {
			Comanda comanda = new Comanda(platos[(int)(Math.random()*platos.length)],bebidas[(int)(Math.random()*bebidas.length)]);
			comanda.setTiempotoma((int)(Math.random()*100));
			comanda.setTiempopreparacion((int)(Math.random()*100));
			comanda.setTiempoentrega((int)(Math.random()*100));
			comandas.add(comanda);
			
		}

		
		return comandas;
		
	}


	public void pagarCuenta(Pedido pedido2) {
		/*Se simula que se accede a la BD, comprobando la tarjeta del usuari, su saldo, cuenta, etc... Se añade como pagado, y cambiamos el estado*/
		System.out.println("Pago del pedido: " + pedido2.getID() + " efectuado con éxito");
		pedido2.CambiarEstado("Pagado");
	}

}