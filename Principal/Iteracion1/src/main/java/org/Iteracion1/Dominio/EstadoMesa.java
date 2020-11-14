package Dominio;

public enum EstadoMesa {
	/**
	 * La Mesa está en un Estado de "Libre"
	 */
	Libre,
	/**
	 * La Mesa está en un Estado de "Ocupada"
	 */
	Ocupada,
	/**
	 * La Mesa está en un Estado de "Reservada"
	 */
	Reservada,
	/**
	 * La Mesa está en un Estado de "Pidiendo"(el camarero está cogiendo la comanda)
	 */
	Pidiendo,
	/**
	 * La Mesa está en un Estado de "Espera_Comida"(la mesa está esperando a que le traigan la comida)
	 */
	Espera_Comida,
	/**
	 * La Mesa está en un Estado de "Servidos"(los comensales están servidos)
	 */
	Servidos,
	/**
	 * La Mesa está en un Estado de "Espera_Cuenta"(los comensales están esperando a que le traigan la cuenta)
	 */
	Espera_Cuenta,
	/**
	 * La Mesa está en un Estado de "Pagando"(los comensales están pagando la cuenta)
	 */
	Pagando,
	/**
	 * La Mesa está en un Estado de "enPreparacion"(cuando los comensales se han retirado de la mesa y los camareros la están preparando para que vuelva a estar libre)
	 */
	enPreparacion
}