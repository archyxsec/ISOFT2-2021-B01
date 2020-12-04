package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

import java.util.ArrayList;

public class Pedido {

	private int id;
	private double Precio;
	private String estado;
	private ArrayList<Comanda> comandas;

	/**
	 * 
	 * @param id 
	 * @param estado
	 */
	
	public Pedido(int id) {
		this.id = id;
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

	public int getID() {
		return id;
	}

	public double getPrecio() {
		// TODO Auto-generated method stub
		return Precio;
	}

	public void setEstado(String estado) {

		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", Precio=" + Precio + ", estado=" + estado + ", comandas=" + comandas + "]";
	}

}