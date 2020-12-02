package es.uclm.esi.isoft2b01.iteracion1.Dominio;

public class Empleado {

	protected String Id_Empleado;
	protected String Nombre;
	protected String Apellidos;
	protected String num_Cuenta;
	
	public Empleado(String id_Empleado, String nombre, String apellidos, String num_Cuenta) {
		super();
		Id_Empleado = id_Empleado;
		Nombre = nombre;
		Apellidos = apellidos;
		this.num_Cuenta = num_Cuenta;
	}

	
	public String getId_Empleado() {
		return Id_Empleado;
	}


	public void setId_Empleado(String id_Empleado) {
		Id_Empleado = id_Empleado;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getNum_Cuenta() {
		return num_Cuenta;
	}


	public void setNum_Cuenta(String num_Cuenta) {
		this.num_Cuenta = num_Cuenta;
	}


	@Override
	public String toString() {
		return "Empleado [Id_Empleado=" + Id_Empleado + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos
				+ ", num_Cuenta=" + num_Cuenta + "]";
	}
	
	

	
}