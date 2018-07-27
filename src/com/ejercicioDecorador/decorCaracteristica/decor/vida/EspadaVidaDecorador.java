package com.ejercicioDecorador.decorCaracteristica.decor.vida;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorCaracteristica.decor.CaracteristicaDecorador;

public class EspadaVidaDecorador extends CaracteristicaDecorador {

	private CaracterPersonaje wrapdCaracteristica;
	
	public EspadaVidaDecorador(CaracterPersonaje wrapdCaracteristica) {
		super(1);
		this.wrapdCaracteristica = wrapdCaracteristica;
	}

	public int getMagnitud() {
		return wrapdCaracteristica.getMagnitud() + super.getMagnitud();
	}
}
