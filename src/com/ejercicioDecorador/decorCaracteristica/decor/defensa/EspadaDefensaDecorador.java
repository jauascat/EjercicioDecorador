package com.ejercicioDecorador.decorCaracteristica.decor.defensa;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorCaracteristica.decor.CaracteristicaDecorador;

public class EspadaDefensaDecorador extends CaracteristicaDecorador {

	private CaracterPersonaje wrapdCaracteristica;
	
	public EspadaDefensaDecorador(CaracterPersonaje wrapdCaracteristica) {
		super(10);
		this.wrapdCaracteristica = wrapdCaracteristica;
	}

	public int getMagnitud() {
		return wrapdCaracteristica.getMagnitud() + super.getMagnitud();
	}
}
