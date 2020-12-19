package es.uclm.esi.isoft2b01.iteracion4.Presentacion;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;

public class IU_AlmacenTest {

	@Test
	public void test() {
		Ingredientes pollo = new Ingredientes("pollo",10);
		Ingredientes patata = new Ingredientes("patata",30);
		ArrayList<Ingredientes> listaIngredientes = new ArrayList(2);
		listaIngredientes.add(pollo);
		listaIngredientes.add(patata);
		assertEquals(listaIngredientes.size(),2);
		Plato p1 = new Plato(listaIngredientes,8.50f);
		int rol=1;
		assertTrue(rol>0);
		
	}

}
