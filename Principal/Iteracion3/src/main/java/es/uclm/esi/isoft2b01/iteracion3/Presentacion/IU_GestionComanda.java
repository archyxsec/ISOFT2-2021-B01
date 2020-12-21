package es.uclm.esi.isoft2b01.iteracion3.Presentacion;

import java.util.Scanner;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.GestorComanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.GestorPedido;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Pedido;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Capacidad;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_GestionComanda {
	//public static void main(String args[]) {
	public static void IU_GestionComanda() {
		Scanner sc;
		sc = new Scanner(System.in);
		int opcion;
		
		sc = new Scanner(System.in); //Para no estropear el buffer
		Comanda co = null;
		System.out.print("Introduce el plato de la comanda: (Si no introduce Ninguno ");
		String plato = sc.nextLine();
		System.out.println();
		System.out.print("Introduce la bebida de la comanda: (Si no introduce Ninguno) ");
		String bebida = sc.nextLine();
		System.out.println();
		if(plato.isEmpty()) plato = "Ninguno";
		if(bebida.isEmpty()) bebida = "Ninguno";
		if(!plato.isEmpty() && plato.equalsIgnoreCase("Ninguno")) {
			if(!bebida.isEmpty() && bebida.equalsIgnoreCase("Ninguno")) {
				System.out.println("Tienes que introducir una comanda válida");
			}
		}else co = new Comanda(plato,bebida);
		System.out.println("Introduce el id del pedido");
		int id = sc.nextInt();
		while (id < 0) {
			System.out.println("Escribe un id válido");
		}
		Pedido p = new Pedido(id);
		String result = AnotarComanda(co,p);
		System.out.println(result);
		if(result.equals("La comanda ha sido anotada")) {
			/*Cambiamos el estado de la mesa*/
			System.out.println("Introduce el número de mesa");
			int n_mesa = sc.nextInt();
			Mesa m = new Mesa(n_mesa, Capacidad.random());
			System.out.println(CambiarEstadoMesa(m,EstadoMesa.Espera_Comida));
			System.out.println(m.toString());
			avisarPersonal(co);
		}
	}
	private static String AnotarComanda(Comanda co,Pedido p) {
		GestorComanda gc = new GestorComanda();
		if(gc.Añadir_Comanda_a_Pedido(co, p)) return "La comanda ha sido anotada";
		else return "No ha podido añadirse la comanda";
	}
	
	
	
	private static String CambiarEstadoMesa(Mesa m,EstadoMesa estado) {
		GestoMesa gm = new GestoMesa();
		gm.cambiarEstadoMesa(m,estado);
		return "El estado de la mesa se ha cambiado";
	}
	
	private static void avisarPersonal(Comanda co) {
		System.out.println("[Cocinero]  Plato: "+co.getPlato());
		System.out.println("[Camarero de Barra] Bebida: "+co.getBebida());
	}
}