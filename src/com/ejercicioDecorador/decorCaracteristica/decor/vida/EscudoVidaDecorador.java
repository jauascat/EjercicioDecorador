package com.ejercicioDecorador.decorCaracteristica.decor.vida;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorCaracteristica.decor.CaracteristicaDecorador;

public class EscudoVidaDecorador extends CaracteristicaDecorador {

	private CaracterPersonaje wrapdCaracteristica;
	
	public EscudoVidaDecorador(CaracterPersonaje wrapdCaracteristica) {
		super(10);
		this.wrapdCaracteristica = wrapdCaracteristica;
	}

	public int getMagnitud() {
		return wrapdCaracteristica.getMagnitud() + super.getMagnitud();
	}
}
