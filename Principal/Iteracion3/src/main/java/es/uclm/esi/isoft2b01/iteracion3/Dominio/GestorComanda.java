package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import java.util.ArrayList;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Pedido;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.GestorPedido;

public class GestorComanda {

	public boolean CrearComanda(Comanda c) {
		System.out.println("Se ha creado la comanda: "+c.toString());
		return true;
	}

	public boolean Añadir_Comanda_a_Pedido(Comanda c, Pedido p) {
		GestorPedido gp = new GestorPedido();
		if((gp.anotarComanda(c,p))) return true;	
		else return false;
	}

	public Plato ObtenerPlato(ArrayList<Plato> platos) {
		Plato plato;
		plato=platos.remove(0);
		return plato;
	}

}