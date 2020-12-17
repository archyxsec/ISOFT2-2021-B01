package es.uclm.esi.isoft2b01.iteracion4.Presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import es.uclm.esi.isoft2b01.iteracion3.Dominio.Ingredientes;
import es.uclm.esi.isoft2b01.iteracion3.Dominio.Plato;
import es.uclm.esi.isoft2b01.iteracion4.Dominio.Almacen;
import es.uclm.esi.isoft2b01.iteracion4.Dominio.Cocinero;
import es.uclm.esi.isoft2b01.iteracion4.Dominio.GestorAlmacen;

public class IU_Almacen {
	public static void main (String[] args) {
		
		GestorAlmacen gestor_almacen = new GestorAlmacen();
		Cocinero cocinero = new Cocinero("10","Andrés","Carretero Sosa","ES4500000000012");
		//Ingredientes pollo = new Ingredientes("pollo",3);
		int rol=-1;
		boolean resultado;
		//Scanner reader = new Scanner(System.in);
		boolean salir = false;
		// platos creados //
		Ingredientes pollo = new Ingredientes("pollo",10);
		Ingredientes patata = new Ingredientes("patata",30);
		ArrayList<Ingredientes> lista_pollo = new ArrayList(2);
		lista_pollo.add(pollo);
		lista_pollo.add(patata);
		Plato p1 = new Plato(lista_pollo,8.50f);
		Ingredientes calamares = new Ingredientes("calamares",10);
		Ingredientes lechuga = new Ingredientes("lechuga",20);
		ArrayList<Ingredientes> lista_calamares = new ArrayList(2);
		lista_calamares.add(calamares);
		lista_calamares.add(lechuga);
		Plato p2 = new Plato(lista_calamares,10.00f); 
		
		while (rol==-1) {
			System.out.println("\nElige rol:\n1) Camarero\n2)Cocinero");
			rol = pedir_numero();
				if (rol == 1) {
					System.out.println("Usted ha ingresado como camarero.\n");
				}
				else if (rol == 2) {
					System.out.println("Usted ha ingresado como cocinero.\n");
				}else {
					System.out.println("El número elegido debe ser 1 ó 2.");
					rol=-1;
				}
		}
		
		if (rol == 1) {
			while (!salir) {
				//Como la comanda se ha creado en la iteracion anterior continuamos
				System.out.println("Camarero: Diga el plato que se anotó en la comanda.");
				Plato plato = gestor_almacen.ControlComidas();
				System.out.println("\nSe recomienda el plato que lleva " + plato.getIngredientes().get(0).nombre);
				System.out.println("1) Pollo al horno.");
				System.out.println("2) Calamares");
				int numero = pedir_numero();
				
				while (numero<1 & numero>2) {
					System.out.println("Ese plato no existe.");
					numero = pedir_numero();
					}
				
				if (numero==1) resultado = gestor_almacen.ActualizarStock(p1);
				else resultado = gestor_almacen.ActualizarStock(p2);
				
				if (resultado) {
					System.out.println("Camarero: Stock actualizado.");
				}else {
					System.out.println("Camarero: El stock no se ha podido actualizar.");
				}
				System.out.println("Camarero: ¿Desea añadir otro plato?");
				System.out.println("1) Sí");
				System.out.println("2) No");
				int n_salir = pedir_numero();
				if(n_salir == 2) salir = true;
			}
		}
		else {
			while (!salir) {
				System.out.println("Cocinero:\tDiga el plato que va aprovisionar en el almacén.");
				System.out.println("1) Pollo al horno.");
				System.out.println("2) Calamares");
				int numero = pedir_numero();
				
				while (numero<1 & numero>2) {
					System.out.println("Ese plato no existe.");
					numero = pedir_numero();
					}
				
				if (numero==1) resultado = cocinero.aprovisionarAlmacen(p1);
				else resultado = cocinero.aprovisionarAlmacen(p2);
				
				if (resultado) {
					System.out.println("Cocinero: Solicitud de provisiones realizada con éxito.");
				}else {
					System.out.println("Cocinero: El almacén no se ha podido aprovisionar.");
				}
				System.out.println("Cocinero: ¿Desea aprovisionar de otro plato el almacén?");
				System.out.println("1) Sí");
				System.out.println("2) No");
				int n_salir = pedir_numero();
				if(n_salir == 2) salir = true;
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