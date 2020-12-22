package es.uclm.esi.isoft2b01.Iteracion5.Presentacion;

import java.util.Scanner;

import es.uclm.esi.isoft2b01.Iteracion5.Dominio.GestorEstadísticas;

public class IU_GenerarEstadísticas {
	//public static void main(String args[]) {
	public static void IU_GenerarEstadísticas() {
		Scanner sc = new Scanner(System.in);
		GestorEstadísticas gs = new GestorEstadísticas();
		int opcion;
		boolean salir = false;
		do {
			System.out.println("Que desea hacer:");
			System.out.println("1) Tiempo medio de preparación de mesas libres");
			System.out.println("2) Prorrotear estadísticas con personas");
			System.out.println("3) Estadísticas restaurante o ciudad");
			System.out.println("4) Tiempo medio toma de comandas");
			System.out.println("5) Tiempo medio preparación comandas");
			System.out.println("6) Tiempo medio entrega nota");
			System.out.println("7) salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				gs.pedirTiempoMedioMesasLibres();
			break;
			case 2:
				gs.pedirDatosProrratear();
			break;
			case 3:
				gs.pedirDatosRestauranteCiudad();
			break;
			case 4:
				gs.pedirTiempoTomaComandas();
			break;
			case 5:
				gs.pedirTiempoPreparacionComidas();
			break;
			case 6:
				gs.pedirTiempoEntregaNota();
			break;
			default:
				salir = true;
			break;
			}
		}while(salir == false);
	}
}