package es.uclm.esi.isoft2b01.Iteracion5.Dominio;

import java.util.Iterator;
import java.util.Scanner;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;
import es.uclm.esi.isoft2b01.iteracion4.Persistencia.GestorBD;

public class GestorEstadísticas {
	String datosProrrotear;

	/**
	 * 
	 * @param m
	 */
	public void pedirDatosMesa(Mesa m) {
		// TODO - implement GestorEstadísticas.pedirDatosMesa
		throw new UnsupportedOperationException();
	}

	public void pedirDatosProrratear() {
		// TODO - implement GestorEstadísticas.pedirDatosProrratear
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el id de la Mesa");
		int id = sc.nextInt();
		System.out.println("Introduce comensales en la mesa:");
		Mesa m = new Mesa(id);
		int comensales = sc.nextInt();
		m.setComensales(comensales);
		ActualizarDatosProrrateados(m);
	}

	public void ActualizarDatosProrrateados(Mesa m) {
		// TODO - implement GestorEstadísticas.ActualizarDatosProrrateados
		GestorBD.mesas.add(m);
	}

	public void pedirDatosRestauranteCiudad() {
		// TODO - implement GestorEstadísticas.pedirDatosRestauranteCiudad
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del restaurante");
		//Vamos a simular un ejemplo, siempre mostraremos el mismo
		String restaur = sc.nextLine();
		System.out.println("estadísticas Mesas del restaurante:");
		System.out.println(GestorBD.mesas.toString());
		System.out.println("estadísticas comandas del restaurante:");
		System.out.println(GestorBD.comandas.toString());
		
	}

	public void pedirTiempoTomaComandas() {
		// TODO - implement GestorEstadísticas.pedirTiempoTomaComandas
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempotoma();
		}
		System.out.println("Tiempo medio toma comandas: " + tiempo + " minutos");
	}

	public void pedirTiempoPreparacionComidas() {
		// TODO - implement GestorEstadísticas.pedirTiempoPreparacionComidas
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempopreparacion();
		}
		System.out.println("Tiempo medio preparación comandas: " + tiempo + " minutos");
	}

	public void pedirTiempoEntregaNota() {
		// TODO - implement GestorEstadísticas.pedirTiempoEntregaNota
		int tiempo = 0;
		Iterator<Comanda> it = GestorBD.comandas.iterator();
		while(it.hasNext()) {
			tiempo += it.next().getTiempoentrega();
		}
		System.out.println("Tiempo medio preparación comandas: " + tiempo + " minutos");
	}

	public void pedirTiempoMedioMesasLibres() {
		int tiempo = 0;
		Mesa m;
		Iterator<Mesa> it = GestorBD.mesas.iterator();
		while(it.hasNext()) {
			m = it.next();
			if(m.getEstado() == EstadoMesa.Libre) {
				tiempo += m.getTiempoPreparacion();
			}
		}
		System.out.println("Tiempo medio preparación comandas: " + tiempo + " minutos");
		
	}

}