package es.uclm.esi.isoft2b01.iteracion3.Dominio;

public class Plato {

	private Ingredientes[] Ingredientes;
	public Ingredientes[] getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(Ingredientes[] ingredientes) {
		Ingredientes = ingredientes;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	private float Precio;

}