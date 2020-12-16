package es.uclm.esi.isoft2b01.iteracion1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class AsignarMesaTest2 { //lista_con, -5

	@Test
	public void test() {
			GestorCamarero g = new GestorCamarero();
			Mesa m = new Mesa(-5);			
			Camarero c = new Camarero("01", "Ramon", "Moreno", "0001");
			
			g.AsignarMesa(m, c);
			
			assertEquals(false, g.AsignarMesa(m, c));	
		}

	

}
