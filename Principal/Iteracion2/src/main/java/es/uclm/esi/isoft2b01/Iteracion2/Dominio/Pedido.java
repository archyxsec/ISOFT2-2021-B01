package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

import java.util.ArrayList;

public class Pedido {

	private double Precio;
	private String estado;
	private ArrayList<Comanda> comandas;

	/**
	 * 
	 * @param estado
	 */
	
	public Pedido() {
		this.Precio = 0;
		comandas = new ArrayList<Comanda>();
		this.estado = "Preparando";
	}
	public boolean CambiarEstado(String estado) {
		// TODO - implement Pedido.CambiarEstado
		this.estado = estado;
		return true;
	}

	public void setComanda(Comanda co) {
		comandas.add(co);
		//Ahora deberiamos actualizar el precio
	}

}