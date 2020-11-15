package es.uclm.esi.isoft2b01.iteracion1.Presentacion;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.Camarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestorCamarero;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_AsignarMesa {
	public static void main(String [] args) {
		GestoMesa gestorMesa = new GestoMesa();
		GestorCamarero gestorCamarero = new GestorCamarero();
		ArrayList<Mesa> mesas = gestorMesa.crearMesas(5);
		ArrayList<Camarero> camareros = gestorCamarero.crearCamareros();
		
//		Mesa m = new Mesa(1);
//		Camarero c = new Camarero("04", "Roro", "moreno", "0001");
//		System.out.println(gestorCamarero.AsignarMesa(m,c));
//		System.out.println(gestorCamarero.AsignarMesa(m,c));
		
		Scanner reader = new Scanner(System.in);
		boolean salir = false;
		
		while (!salir) {
		int id_Mesa = -1;	
		int id_Camarero = -1;
		
		gestorMesa.imprimirMesas(mesas);
		
		while(true) {
		
			System.out.println("\nIntroduzca el id de la mesa que desea asignar");
							
			try {
				id_Mesa = reader.nextInt()-1;
				
				if (id_Mesa >=0 && id_Mesa < mesas.size())
					break;
				
				System.out.println("ERROR: No existe una mesa con ese id. ");
			} catch (Exception e) {
				System.out.println("ERROR: Debe introducir un valor entero.");
				reader.next();
			}
			
			
		}
		
		if (gestorMesa.MarcarMesa(mesas.get(id_Mesa))){
			System.out.println("Mesa ocupada con exito\n");
			
			gestorCamarero.imprimirCamareros(camareros);
				
			while(true) {
				
				System.out.println("\nIntroduzca el id del camarero que desea asignar a esta mesa:");
								
				try {
					id_Camarero = reader.nextInt()-1;
					
					if (id_Camarero >=0 && id_Camarero < camareros.size())
						break;
					
					System.out.println("ERROR: No existe un camarero con ese id. ");
				} catch (Exception e) {
					System.out.println("ERROR: Debe introducir un valor entero.");
					reader.next();
				}
								
			}
						
			
			if(gestorCamarero.AsignarMesa(mesas.get(id_Mesa), camareros.get(id_Camarero))) {
							
				System.out.println("Camarero asignado");
				
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