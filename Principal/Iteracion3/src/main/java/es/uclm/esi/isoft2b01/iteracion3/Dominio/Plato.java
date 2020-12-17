package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import java.util.ArrayList;

public class Plato {

	private ArrayList<Ingredientes> Ingredientes;
	private float Precio;
	
	public Plato(ArrayList<Ingredientes> ingredientes, float precio) {
		super();
		Ingredientes = ingredientes;
		Precio = precio;
	}
	public ArrayList<Ingredientes> getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		Ingredientes = ingredientes;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}

}