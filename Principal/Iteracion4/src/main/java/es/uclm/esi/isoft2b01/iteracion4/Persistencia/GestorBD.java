package es.uclm.esi.isoft2b01.iteracion4.Persistencia;

import java.util.ArrayList;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.GestorPedido;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class GestorBD {
	/*Creamos de prueba ESta BD*/
	private static GestoMesa gestorMesa = new GestoMesa();
	private static GestorPedido gestorpedido = new GestorPedido();
	public static ArrayList<Mesa> mesas = gestorMesa.crearMesas(5);
	public static ArrayList<Comanda> comandas = gestorpedido.crearComandas(5);
}
