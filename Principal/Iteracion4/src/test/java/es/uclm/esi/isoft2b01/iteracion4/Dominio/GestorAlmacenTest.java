package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;

public class GestorAlmacenTest {

	@Test
	public void testActualziarStock() {
		GestorAlmacen ga = new GestorAlmacen();
		Plato plato = new Plato(null,0);
		
		assertEquals(true, ga.ActualizarStock(plato));
		
	}

}
