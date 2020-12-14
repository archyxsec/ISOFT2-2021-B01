package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlatoTest {

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
	public void testGetIngredientes() throws Exception {
		Plato p = new Plato();
		Ingredientes[] ingr = {new Ingredientes("sal"),new Ingredientes("azucar")};
		p.setIngredientes(ingr);
		assertEquals(p.getIngredientes(),ingr);
		System.out.println("Prueba con otros ingredientes");
		Ingredientes[] ingrpr = {new Ingredientes("sal"),new Ingredientes("limón")};
		assertEquals(p.getIngredientes(),ingrpr);
		//throw new RuntimeException("not yet implemented");
	}


	@Test
	public void testGetPrecio() throws Exception {
		Plato p = new Plato();
		p.setPrecio((float)1.0);
		assertTrue(p.getPrecio()>0);
	}



}
