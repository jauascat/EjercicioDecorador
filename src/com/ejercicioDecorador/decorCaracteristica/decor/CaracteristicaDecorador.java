package com.ejercicioDecorador.decorCaracteristica.decor;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;

public abstract class CaracteristicaDecorador extends CaracterPersonaje {

	public CaracteristicaDecorador(int magnitud) {
		super(magnitud);
	}
}
