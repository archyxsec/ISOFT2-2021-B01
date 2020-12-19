package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes;

public class AlmacenTest {

	@Test
	public void testGetIngredientes() {
		Almacen almacen=new Almacen();
		ArrayList<Ingredientes> ingredientes = new ArrayList(2);
		ingredientes.add(new Ingredientes("carne",2));
		ingredientes.add(new Ingredientes("verduras",5));
		almacen.setIngredientes(ingredientes);
		
		assertEquals(almacen.getIngredientes(), ingredientes);
	}

}
