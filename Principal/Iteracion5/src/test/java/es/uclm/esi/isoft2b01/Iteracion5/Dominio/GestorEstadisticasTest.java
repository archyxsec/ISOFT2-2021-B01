package es.uclm.esi.isoft2b01.Iteracion5.Dominio;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;
import es.uclm.esi.isoft2b01.iteracion4.Persistencia.GestorBD;

public class GestorEstadisticasTest {
	
	
	public void testpedirDatosProrratear() {
		//fail("Not yet implemented");
		Mesa m = new Mesa(5);
		int comensales = 5;
		m.setComensales(comensales);
		testActualizarDatosProrrateados(m);
		assertEquals(m, GestorBD.mesas.get(GestorBD.mesas.size()-1));
	}
	
	public void testActualizarDatosProrrateados(Mesa m) {
		//fail("Not yet implemented");
		GestorBD.mesas.add(m);
	}
	
	public void testpedirDatosRestauranteCiudad() {
		//fail("Not yet implemented");
		String restaur = "Orosia";

		String toStringMesas = "[Mesa [Id_Mesa=1, Estado=Libre, Capacidad=MESA6], Mesa [Id_Mesa=2, Estado=Libre, Capacidad=MESA2], Mesa [Id_Mesa=3, Estado=Libre, Capacidad=MESA6], Mesa [Id_Mesa=4, Estado=Libre, Capacidad=MESA4], Mesa [Id_Mesa=5, Estado=Libre, Capacidad=MESA2]]";
		assertEquals(toStringMesas, GestorBD.mesas.toString());
		

		String toStringComandas = "[es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda@5010be6, es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda@685f4c2e, es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda@7daf6ecc, es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda@2e5d6d97, es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda@238e0d81]";
		assertEquals(toStringComandas, GestorBD.comandas.toString());
	}
	
	@Test
	public void testpedirTiempoTomaComandas() {
		//fail("Not yet implemented");
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempotoma();
		}
		assertTrue(tiempo >= 0);
	}
	
	@Test
	public void testpedirTiempoPreparacionComidas() {
		//fail("Not yet implemented");
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempopreparacion();
		}
		assertTrue(tiempo >= 0);
	}
	
	@Test
	public void testpedirTiempoEntregaNota() {
		//fail("Not yet implemented");
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempoentrega();
		}
		assertTrue(tiempo >= 0);
		System.out.println("Tiempo medio preparación comandas: " + tiempo + " minutos");
	}
	
	/*public void testpedirTiempoMedioMesasLibres() {
		fail("Not yet implemented");
	}*/
	/*metodos aux*/
}
