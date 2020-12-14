package es.uclm.esi.isoft2b01.iteracion3.Dominio;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IngredientesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}
	
	@Test
	public void Ingredientes() {
		Ingredientes i = new Ingredientes("2-Pedro");
		assertEquals("2-Pedro",i.toString());
		assertEquals("Juan",i.toString());
	}
	

}
