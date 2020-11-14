package es.uclm.esi.isoft2b01.iteracion1.Presentacion;

import java.util.Scanner;
import java.util.Random;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_AsignarMesa {
	public static void main(String [] args) {
		GestoMesa gestorMesa = new GestoMesa();
		GestorCamarero gestorCamarero = new GestorCamarero();
		Mesa [] mesas = gestorMesa.crearMesas(5);
		Camarero [] camareros = gestorCamarero.crearCamareros();;
		
		Scanner reader = new Scanner(System.in);
		boolean salir = false;
		
		while (!salir) {
		int id_Mesa = -1;	
		int id_Camarero = -1;
		System.out.println("Introduzca el id de la mesa que desea asignar");
		id_Mesa = reader.nextInt();
		
		if (gestorMesa.MarcarMesa(mesas[id_Mesa-1])) {
			System.out.println("Mesa ocupada con exito");
			
			gestorCamarero.imprimirCamareros(camareros);
			
			System.out.println("Introduzca el id del camarero que desea asignar a esta mesa:");
			id_Camarero = reader.nextInt();
			
			//System.out.println(camareros[id_Camarero].getMesasAsignadas().isEmpty());
			
			if(gestorCamarero.AsignarMesa(mesas[id_Mesa], camareros[id_Camarero])) {
				
				
				
				System.out.println("Camarero asignado");
				//System.out.println(camareros[id_Camarero].getMesasAsignadas().isEmpty());
			}
			else
				System.out.println("No se pudo asignar el camarero");
				
			
			
		}
		else
			System.out.println("Mesa ya ocupada");
		
		System.out.println("¿Desea asignar otra mesa?");
		
		if (reader.next().equalsIgnoreCase("no"))
			salir = true;
		
		}
	}
}