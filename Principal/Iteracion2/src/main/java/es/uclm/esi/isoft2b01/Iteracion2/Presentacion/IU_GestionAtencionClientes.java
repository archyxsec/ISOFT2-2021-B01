package es.uclm.esi.isoft2b01.Iteracion2.Presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Comanda;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.GestorPedido;
import es.uclm.esi.isoft2b01.Iteracion2.Dominio.Pedido;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Capacidad;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.EstadoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.GestoMesa;
import es.uclm.esi.isoft2b01.iteracion1.Dominio.Mesa;

public class IU_GestionAtencionClientes {
	public static void main(String args[]) {
		Scanner sc;
		sc = new Scanner(System.in);
		int opcion;
		System.out.println("Que desea hacer?");
		System.out.println("1) Anotar Comanda");
		System.out.println("2) Crear Pedido");
		System.out.println("3) Cerrar Pedido");
		System.out.println("4) Cobrar cuenta");
		try {
			opcion = sc.nextInt();
			switch(opcion){
			case 1:
				sc = new Scanner(System.in); //PAra no estropear el buffer
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
						break;
					}
				}else co = new Comanda(plato,bebida);
				System.out.println("Introduce el id del pedido");
				int id = sc.nextInt();
				if (id < 0) {
					System.out.println("Escribe un id válido");
					break;
				}
				Pedido p = new Pedido(id);
				String result = AnotarComanda(co,p);
				System.out.println(result);
				if(result.equals("La comanda ha sido anotada")) {
					/*Cambiamos el estado de la mesa*/
					System.out.println("Introduce el número de mesa");
					int n_mesa = sc.nextInt();
					Mesa m = new Mesa(n_mesa, Capacidad.random());
					System.out.println(CambiarEstadoMesa(m,EstadoMesa.Ocupada));
					System.out.println(m.toString());
				}
				break;
			case 2:
				System.out.println("Introduzca el id del pedido");
				int id_pedido = sc.nextInt();
				Pedido pedido = new Pedido(id_pedido);
				String resultpedido = CrearPedido(pedido);
				if(resultpedido.equals("El pedido ha sido creado")) {
					//Cambiamos estado Mesa a pidiendo
					System.out.println("Introduce el número de mesa");
					int n_mesa = sc.nextInt();
					Mesa m = new Mesa(n_mesa, Capacidad.random());
					System.out.println(CambiarEstadoMesa(m,EstadoMesa.Pidiendo));
					System.out.println(m.toString());
				}
				break;
			case 3:
				System.out.println("Introduzca el id del pedido");
				int id_pedido1 = sc.nextInt();
				Pedido pedido1 = new Pedido(id_pedido1);
				String result1 = CerrarPedido(pedido1);
				if(result1.equals("El pedido ha sido cerrado")) {
					//Cambiamos estado Mesa a pidiendo
					System.out.println("Introduce el número de mesa");
					int n_mesa = sc.nextInt();
					Mesa m = new Mesa(n_mesa, Capacidad.random());
					System.out.println(CambiarEstadoMesa(m,EstadoMesa.Pagando));
					System.out.println("A continuación se devolverá la cuenta");
					System.out.println("Total a pagar: " + MostrarCuenta(pedido1) + "€");
					System.out.println(m.toString());

				}
				break;
			case 4:
				System.out.println("Introduzca el id del pedido");
				int id_pedido2 = sc.nextInt();
				Pedido pedido2 = new Pedido(id_pedido2);
				String result2 = PagarPedido(pedido2);
				if(result2.equals("Pago efectuado con éxito")) {
					//Cambiamos estado Mesa a pidiendo
					System.out.println("Introduce el número de mesa");
					int n_mesa = sc.nextInt();
					Mesa m = new Mesa(n_mesa, Capacidad.random());
					System.out.println(CambiarEstadoMesa(m,EstadoMesa.Libre)); /*Libre porque ya se ha pagado*/
					System.out.println(m.toString());
				}
				break;
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Tienes que introducir un número");
		}
		
	}

	private static String PagarPedido(Pedido pedido2) {
		GestorPedido gp = new GestorPedido();
		gp.pagarCuenta(pedido2);
		return "Pago efectuado con éxito";
	}

	private static double MostrarCuenta(Pedido pedido1) {
		GestorPedido gp = new GestorPedido();
		return gp.getCuenta(pedido1);
	}

	private static String CerrarPedido(Pedido pedido1) {
		GestorPedido gp = new GestorPedido();
		gp.cerrarPedido(pedido1);
		return "El pedido ha sido cerrado";
	}

	private static String CrearPedido(Pedido p) {
		GestorPedido gp = new GestorPedido();
		gp.crearPedido(p);
		return "El pedido ha sido creado";
	}

	private static String CambiarEstadoMesa(Mesa m,EstadoMesa estado) {
		GestoMesa gm = new GestoMesa();
		gm.cambiarEstadoMesa(m,estado);
		return "El estado de la mesa se ha cambiado";
	}

	private static String AnotarComanda(Comanda co,Pedido p) {
		GestorPedido gp = new GestorPedido();
		if(gp.anotarComanda(co,p)) return "La comanda ha sido anotada";
		else return "No ha podido añadirse la comanda";
	}
}