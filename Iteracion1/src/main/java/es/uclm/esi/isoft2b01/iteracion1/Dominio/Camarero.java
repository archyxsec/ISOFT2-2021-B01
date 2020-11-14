package es.uclm.esi.isoft2b01.iteracion1.Dominio;

import java.util.ArrayList;

public class Camarero extends Empleado {

	private ArrayList<Mesa> mesasAsignadas;
	
	public Camarero(String id_Empleado, String nombre, String apellidos, String num_Cuenta) {
		super(id_Empleado, nombre, apellidos, num_Cuenta);
		mesasAsignadas=new ArrayList<Mesa>();
		
		
		
	}
	
	public String toString() {
		return "Camarero [Id_Empleado=" + Id_Empleado + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", num_Cuenta=" + num_Cuenta + "]";
	}

	
	public ArrayList<Mesa> getMesasAsignadas(){
		return mesasAsignadas;
	
	}
	
	public void asignarMesa(Mesa mesa) {
		mesasAsignadas.add(mesa);
	}
}