package es.uclm.esi.isoft2b01.iteracion3.Dominio;

public class Ingredientes {
	
	public String nombre;
	public int cantidad;
	
	public Ingredientes(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
