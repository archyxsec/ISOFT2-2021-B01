package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GestorComandaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void ObtenerPlato() {
		Plato plato = new Plato();
		ArrayList<Plato> platos = new ArrayList();
		platos.add(plato);
		assertEquals(plato,platos);
	}

}
