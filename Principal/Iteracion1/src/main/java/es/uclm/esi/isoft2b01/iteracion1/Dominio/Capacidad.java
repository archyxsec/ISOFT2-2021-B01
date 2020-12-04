package es.uclm.esi.isoft2b01.iteracion1.Dominio;

import java.util.Random;

public enum Capacidad {
	/**
	 * Mesa de 2 Comensales
	 */
	MESA2,
	/**
	 * Mesa de 4 Comensales
	 */
	MESA4,
	/**
	 * Mesa de 6 Comensales
	 */
	MESA6;
	
	public static Capacidad random() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
		
	}
}