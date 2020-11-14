package es.uclm.esi.isoft2b01.iteracion1.Presentacion;

import java.util.Scanner;

import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;

public class IU_AsignarMesa {
	public static void main(String [] args) {
		
		GestoMesa gestorMesa = new GestoMesa();
		Scanner reader = new Scanner(System.in);
		int id_Mesa = -1;
		
		System.out.println("Introduzca la mesa que desea asignar");
		id_Mesa = reader.nextInt();
		
		gestorMesa.MarcarMesa(id_Mesa);
	}
}