package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

public class Comanda {
	private int tiempotoma;
	private int tiempopreparacion;
	private int tiempoentreganotas;

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String plato;
	public String bebida;
	
	public Comanda(String plato, String bebida) {
		this.plato = plato;
		this.bebida = bebida;
	}
	public void setTiempotoma(int tiempo) {
		this.tiempotoma = tiempo;
	}
	public int getTiempotoma() {
		return tiempotoma;
	}
	public void setTiempopreparacion(int tiempo) {
		this.tiempopreparacion = tiempo;
	}
	public int getTiempopreparacion() {
		return tiempopreparacion;
	}
	public void setTiempoentrega(int tiempo) {
		this.tiempoentreganotas = tiempo;
	}
	public int getTiempoentrega() {
		return tiempoentreganotas;
	}
}
