package es.uclm.esi.isoft2b01.Principal;

import java.util.Scanner;

import es.uclm.esi.isoft2b01.iteracion1.Presentacion.IU_AsignarMesa;
import es.uclm.esi.isoft2b01.Iteracion2.Presentacion.IU_GestionAtencionClientes;
import es.uclm.esi.isoft2b01.iteracion3.Presentacion.IU_GestionComanda;
import es.uclm.esi.isoft2b01.iteracion4.Presentacion.IU_Almacen;
import es.uclm.esi.isoft2b01.Iteracion5.Presentacion.IU_GenerarEstadísticas;
/**
 * Hello world!
 *
 */
public class IU_Principal 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	boolean salir = false;
    	
    	while(!salir) {
    		System.out.println("Seleccione la interfaz que desea usar:");
    		//System.out.println("0) Salir");
    		System.out.println("1) Interfaz Asignar Mesa");
    		System.out.println("2) Interfaz Gestionar Atencion de los Clientes");
    		System.out.println("3) Interfaz Gestionar Comanda");
    		System.out.println("4) Interfaz Almacén");
    		System.out.println("5) Interfaz Generar Estadísticas");
			int numero = pedir_numero();
			
			while (numero<1 || numero>5) {
				System.out.println("Seleccione una de las opciones proporcionadas.");
				numero = pedir_numero();
			}
			switch(numero) {
				case 1:
					IU_AsignarMesa iu_1 = new IU_AsignarMesa();
					iu_1.IU_AsignarMesa();
					break;
				case 2:
					IU_GestionAtencionClientes iu_2 = new IU_GestionAtencionClientes();
					iu_2.IU_GestionAtencionClientes();
					break;
				case 3:
					IU_GestionComanda iu_3 = new IU_GestionComanda();
					iu_3.IU_GestionComanda();
					break;
				case 4:
					IU_Almacen iu_4 = new IU_Almacen();
					iu_4.IU_Almacen();
					break;
				case 5:
					IU_GenerarEstadísticas iu_5 = new IU_GenerarEstadísticas();
					iu_5.IU_GenerarEstadísticas();
					break;
				default:  break;
			}
			System.out.println("¿Desea usar otra interfaz de la aplicación?");
			System.out.println("0) No");
			System.out.println("1) Sí");
			numero = pedir_numero();
			if(numero == 0) {
				System.out.println("Gracias por usar nuestra aplicación.");
				salir = true;
			}
    	}
    }
    
    public static int pedir_numero() {
		int numero=-1;
		Scanner reader = new Scanner(System.in);
		try {
			numero = reader.nextInt();
		}catch (Exception e) {
			System.out.println("ERROR: Debe introducir un valor entero.");
			reader.next();
		}
		return numero;
	}
}
