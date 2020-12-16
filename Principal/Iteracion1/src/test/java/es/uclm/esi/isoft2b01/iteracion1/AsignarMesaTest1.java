package es.uclm.esi.isoft2b01.iteracion1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Capacidad;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class AsignarMesaTest1 { // lista_sin , -5

	@Test
	public void test() {
		GestorCamarero g = new GestorCamarero();
		Mesa m = new Mesa(-5);	
		Camarero c = new Camarero("01", "Ramon", "Moreno", "0001");
		
		assertEquals(true, g.AsignarMesa(m, c));	
	}

}
