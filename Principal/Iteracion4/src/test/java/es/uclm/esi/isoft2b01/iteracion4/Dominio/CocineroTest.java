package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;

public class CocineroTest {

	@Test
	public void testAprovisionarAlmacen() {
		fail("Not yet implemented");
		Cocinero cocinero = new Cocinero("001","Sergio", "Sanchez", "234567");
		Plato p = new Plato(null, 5f);
		ArrayList<Ingredientes> ingr = new ArrayList(2);
		ingr.add(new Ingredientes("sal",10));
		ingr.add(new Ingredientes("azucar",10));
		p.setIngredientes(ingr);
		assertEquals(true, cocinero.aprovisionarAlmacen(p));
	}

}
