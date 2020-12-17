package es.uclm.esi.isoft2b01.iteracion4.Dominio;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Empleado;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;

public class Cocinero extends Empleado {

	public Cocinero(String id_Empleado, String nombre, String apellidos, String num_Cuenta) {
		super(id_Empleado, nombre, apellidos, num_Cuenta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param p
	 */
	public boolean aprovisionarAlmacen(Plato p) {
		// TODO - implement Cocinero.aprovisionarAlmacen
		boolean resultado = false;
		GestorAlmacen ga = new GestorAlmacen();
		
		return resultado = ga.aprovisionarAlmacen(p);
		
		//throw new UnsupportedOperationException();
	}

}