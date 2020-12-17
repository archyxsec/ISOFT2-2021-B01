package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
		Plato p = new Plato(null, 5f);
		ArrayList<Ingredientes> ingr = new ArrayList(2);
		ingr.add(new Ingredientes("sal",10));
		ingr.add(new Ingredientes("azucar",10));
		p.setIngredientes(ingr);
		assertEquals(p.getIngredientes(),ingr);
		System.out.println("Prueba con otros ingredientes");
		ArrayList<Ingredientes> ingrpr = new ArrayList(2);
		ingrpr.add(new Ingredientes("sal",20));
		ingrpr.add(new Ingredientes("limón",10));
		assertEquals(p.getIngredientes(),ingrpr);
		//throw new RuntimeException("not yet implemented");
	}


	@Test
	public void testGetPrecio() throws Exception {
		Plato p = new Plato(null, 0);
		p.setPrecio((float)1.0);
		assertTrue(p.getPrecio()>0);
	}



}
