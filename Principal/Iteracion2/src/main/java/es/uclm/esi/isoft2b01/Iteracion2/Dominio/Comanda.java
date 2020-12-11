package es.uclm.esi.isoft2b01.Iteracion2.Dominio;

public class Comanda {
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
}
