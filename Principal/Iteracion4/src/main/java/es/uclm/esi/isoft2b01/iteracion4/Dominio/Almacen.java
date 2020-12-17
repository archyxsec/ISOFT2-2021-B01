package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import java.util.ArrayList;

public class Almacen {

	public ArrayList<es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes> getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(ArrayList<es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes> ingredientes) {
		Ingredientes = ingredientes;
	}

	private ArrayList<es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes> Ingredientes;

}