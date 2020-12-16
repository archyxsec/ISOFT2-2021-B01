package es.uclm.esi.isoft2b01.iteracion1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class AsignarMesaTest6 { // nul, 2000

	@Test
	public void testAsignarMesa() {
		GestorCamarero g = new GestorCamarero();
		Mesa m = new Mesa(2000);			
		Camarero c = new Camarero("01", "Ramon", "Moreno", "0001");
		c.setNullMesasAsignadas();
		
		assertEquals(true, g.AsignarMesa(m, c));	
	
		
	}

}
