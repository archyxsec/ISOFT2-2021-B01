package es.uclm.esi.isoft2b01.iteracion1.Dominio;

import java.util.ArrayList;

public class Camarero extends Empleado {

	private ArrayList<Mesa> mesasAsignadas;
	
	public Camarero(String id_Empleado, String nombre, String apellidos, String num_Cuenta) {
		super(id_Empleado, nombre, apellidos, num_Cuenta);
		mesasAsignadas=new ArrayList<Mesa>();
		
		
		
	}
	
	public String toString() {
		
		String mesas = "(";
		for (Mesa mesa : mesasAsignadas) {
			mesas += mesa.getId_Mesa()+", ";
		}
		
		if (mesas.length()>=2)mesas = mesas.substring(0, mesas.length()-2);
		mesas +=")";
		
		return "Camarero [Id_Empleado=" + Id_Empleado + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", num_Cuenta=" + num_Cuenta + ", mesasAsignadas=" + mesas+ "]";
	}

	
	public ArrayList<Mesa> getMesasAsignadas(){
		return mesasAsignadas;
	
	}
	
	public void setNullMesasAsignadas() {
		mesasAsignadas = null;
	}
	
	public void asignarMesa(Mesa mesa) {
		mesasAsignadas.add(mesa);
	}
}