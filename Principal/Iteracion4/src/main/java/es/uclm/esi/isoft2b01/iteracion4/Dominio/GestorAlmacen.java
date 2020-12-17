package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import java.util.ArrayList;
import java.util.Random;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.GestorComanda;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;

public class GestorAlmacen {

	public boolean ActualizarStock(Plato p) {
		// TODO - implement GestorAlmacen.ActualizarStock
		boolean resultado = false;
		Almacen almacen = new Almacen();
		almacen.setIngredientes(p.getIngredientes());
		
		if (ComprobarStock()) resultado = true;
		
		return resultado;
		
		//throw new UnsupportedOperationException();
	}

	public boolean SeñalAlarmaIngediente() {
		// TODO - implement GestorAlmacen.SeñalAlarmaIngediente
		System.out.println("ALARMA: Se recomienda aprovisionar el almacén.");
		return false;
		
		//throw new UnsupportedOperationException();
	}

	public boolean ComprobarStock() {
		// TODO - implement GestorAlmacen.ComprobarStock
		//aqui hay que consultar con la base de datos, lo simulamos
		Random random = new Random();
		int r= random.nextInt(10);
		if(r==1) {
			return SeñalAlarmaIngediente();
		}else {
			return true;
		}
		
		//throw new UnsupportedOperationException();
	}

	public Plato ControlComidas() {
		// TODO - implement GestorAlmacen.ControlComidas
		Ingredientes pollo = new Ingredientes("pollo",10);
		Ingredientes patata = new Ingredientes("patata",30);
		ArrayList<Ingredientes> lista_pollo = new ArrayList(2);
		lista_pollo.add(pollo);
		lista_pollo.add(patata);
		Plato p1 = new Plato(lista_pollo,8.50f);
		Ingredientes calamares = new Ingredientes("calamares",10);
		Ingredientes lechuga = new Ingredientes("lechuga",20);
		ArrayList<Ingredientes> lista_calamares = new ArrayList(2);
		lista_calamares.add(calamares);
		lista_calamares.add(lechuga);
		Plato p2 = new Plato(lista_calamares,10.00f); 
		Random random = new Random();
		int num_plato = random.nextInt(2);
		
		if (num_plato==1) return p1;
		else return p2;
		//throw new UnsupportedOperationException();
	}
	
	public boolean aprovisionarAlmacen(Plato p) {
		boolean resultado = false;
		Almacen almacen = new Almacen();
		almacen.setIngredientes(p.getIngredientes());
		resultado = true;
		return resultado;
	}

}