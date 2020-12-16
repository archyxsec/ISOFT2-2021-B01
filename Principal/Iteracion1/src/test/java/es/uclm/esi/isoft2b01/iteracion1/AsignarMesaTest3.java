package es.uclm.esi.isoft2b01.iteracion1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class AsignarMesaTest3 { //lista_sin, 0

	@Test
	public void testAsignarMesa() {
		GestorCamarero g = new GestorCamarero();
		Mesa m = new Mesa(0);			
		Camarero c = new Camarero("01", "Ramon", "Moreno", "0001");
		
		assertEquals(true, g.AsignarMesa(m, c));	
	
		
	}

}
