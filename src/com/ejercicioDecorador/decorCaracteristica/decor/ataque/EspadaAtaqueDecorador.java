package com.ejercicioDecorador.decorCaracteristica.decor.ataque;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorCaracteristica.decor.CaracteristicaDecorador;

public class EspadaAtaqueDecorador extends CaracteristicaDecorador {

	private CaracterPersonaje wrapdCaracteristica;
	
	public EspadaAtaqueDecorador(CaracterPersonaje wrapdCaracteristica) {
		super(10);
		this.wrapdCaracteristica = wrapdCaracteristica;
	}

	public int getMagnitud() {
		return wrapdCaracteristica.getMagnitud() + super.getMagnitud();
	}
}
