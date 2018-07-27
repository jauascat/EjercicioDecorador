package com.ejercicioDecorador.decorCaracteristica.caracteristicas;

public abstract class CaracterPersonaje {

	private int magnitud;

	public CaracterPersonaje(int magnitud) {
		super();
		this.magnitud = magnitud;
	}

	public int getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(int magnitud) {
		this.magnitud = magnitud;
	}
}
