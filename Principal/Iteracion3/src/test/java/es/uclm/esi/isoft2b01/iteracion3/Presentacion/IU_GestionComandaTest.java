package es.uclm.esi.isoft2b01.iteracion3.Presentacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Pedido;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Capacidad;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_GestionComandaTest {

	@Test
	public void testMain() throws Exception {
		Comanda co = null;
		String plato = "1"; // valor al azar
		String bebida = "Coca-cola";
		assertEquals(plato,"1");
		assertEquals(bebida,"Coca-cola");
		if(bebida.isEmpty()) bebida = "Ninguno";
		co = new Comanda(plato,bebida);
		int id = 1;
		assertTrue(id>0);
		Pedido p = new Pedido(id);
		/*Cambiamos el estado de la mesa*/
		int n_mesa = 1;
		assertTrue(n_mesa>0);
		Mesa m = new Mesa(n_mesa, Capacidad.random());
		m.cambiarEstado(EstadoMesa.Espera_Comida);
		assertEquals(m.getEstado(),EstadoMesa.Espera_Comida);		
	}

}
