package es.uclm.esi.isoft2b01.iteracion1.Dominio;

public class GestoMesa {
	
	
	/**
	 * 
	 * @param Id_Mesa
	 */
	public boolean MarcarMesa(Mesa mesa) {
		
		// TODO - implement GestoMesa.MarcarMesa
		
		boolean resultado = false;
		if (mesa.getEstado().equals(EstadoMesa.Libre)) {
			mesa.setEstado(EstadoMesa.Ocupada);
			resultado = true;
		}
		//throw new UnsupportedOperationException();
		return resultado;
	}
	
	public Mesa[] crearMesas(int numeroMesas) {
		
		Mesa [] mesas = new Mesa [numeroMesas];
		
		System.out.println("Lista de mesas:\n");
		
		for (int i = 0; i < numeroMesas; i++) {
			Mesa mesa = new Mesa(i+1,Capacidad.random());
			mesas[i]=mesa;
			System.out.println(mesa.toString());
		}
		System.out.println();
		
		
		return mesas;
		
	}

}