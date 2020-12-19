package es.uclm.esi.isoft2b01.iteracion1.Dominio;

import java.util.ArrayList;

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
	
	public ArrayList <Mesa> crearMesas(int numeroMesas) {
		
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		
		for (int i = 0; i < numeroMesas; i++) {
			Mesa mesa = new Mesa(i+1,Capacidad.random());
			mesa.setTiempoPreparacion((int)(Math.random()*100));
			mesas.add(mesa);
			
		}

		
		return mesas;
		
	}
	
	public boolean cambiarEstadoMesa(Mesa m, EstadoMesa estado) {
		m.cambiarEstado(estado);
		return true;
	}
	
	public void imprimirMesas(ArrayList<Mesa> mesas) {
		
		System.out.println("Lista de mesas:\n");
		
		for (Mesa mesa : mesas) {
			System.out.println(mesa.toString());
		}
			
	}

}