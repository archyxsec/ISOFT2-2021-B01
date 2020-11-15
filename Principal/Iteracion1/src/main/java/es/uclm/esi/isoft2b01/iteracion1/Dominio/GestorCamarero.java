package es.uclm.esi.isoft2b01.iteracion1.Dominio;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GestorCamarero {
	
	public int numeroMaximoMesas = 10;

	/**
	 * 
	 * @param m
	 * @param C
	 */
	
	
	public boolean AsignarMesa(Mesa m, Camarero C) {
		// TODO - implement GestorCamarero.AsignarMesa
		boolean resultado = false;
		
		ArrayList<Mesa>mesasAsignadas=C.getMesasAsignadas();
		
		if (!mesasAsignadas.contains(m)) {
			C.asignarMesa(m);
			resultado = true;
		}
		
		//throw new UnsupportedOperationException();
		
		return resultado;
		
		
	}

	public Camarero[] GetCamareros() {
		// TODO - implement GestorCamarero.GetCamareros
		throw new UnsupportedOperationException();
	}
	
	public ArrayList<Camarero> crearCamareros() {
		
		Random random = new Random();
		
		ArrayList<Camarero>camareros = new ArrayList<Camarero>();
		
		for (int i = 0; i < 6; i++) {
			
			String nombreCamarero, apellidos;
			switch (i) {
			case 0: nombreCamarero = "Tomas" ; apellidos="Garcia Lopez" ; break;
			case 1: nombreCamarero = "Carlos"; apellidos="Moreno Maroto"; break;
			case 2: nombreCamarero = "Pablo"; apellidos="Guerrero Sanjuan"; break;
			case 3: nombreCamarero = "Manuel"; apellidos="Fernandez Del Campo";break;
			case 4: nombreCamarero = "Sergio"; apellidos="Sanchez Iglesias"; break;
			default:nombreCamarero = "Ruben";apellidos="Moraleda Sanchez"; break;
			}
			
			Camarero camarero = new Camarero(Integer.toString(i+1), nombreCamarero, apellidos, Integer.toString(ThreadLocalRandom.current().nextInt(10000000,99999999)));
			camareros.add(camarero);
			
		
		}
		System.out.println();
		return camareros;
	}
	
	public void imprimirCamareros(ArrayList<Camarero>camareros) {
		
		System.out.println("Lista de camareros:\n");
		for (Camarero camarero : camareros) {
			System.out.println(camarero.toString());
		}
		
		
	}

}