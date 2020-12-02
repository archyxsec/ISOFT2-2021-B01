package es.uclm.esi.isoft2b01.Iteracion2.Presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.GestorPedido;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Pedido;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_GestionAtencionClientes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println("Que desea hacer?");
		System.out.println("1) Anotar Comanda");
		try {
			opcion = sc.nextInt();
			switch(opcion){
			case 1:
				Comanda co = new Comanda();
				Pedido p = new Pedido();
				String result = AnotarComanda(co,p);
				System.out.println(result);
				if(result.equals("La comanda ha sido anotada")) {
					/*Cambiamos el estado de la mesa*/
					Mesa m = new Mesa(1, null);
					CambiarEstadoMesa(m);
				}
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Tienes que introducir un número");
		}
		
	}

	private static void CambiarEstadoMesa(Mesa m) {
		GestoMesa gm = new GestoMesa();
		gm.MarcarMesa(m);
		
		
	}

	private static String AnotarComanda(Comanda co,Pedido p) {
		GestorPedido gp = new GestorPedido();
		if(gp.anotarComanda(co,p)) return "La comanda ha sido anotada";
		else return "No ha podido añadirse la comanda";
	}
}