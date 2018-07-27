package com.ejercicioDecorador.decorCaracteristica.decor.defensa;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorCaracteristica.decor.CaracteristicaDecorador;

public class EscudoDefensaDecorador extends CaracteristicaDecorador {

	private CaracterPersonaje wrapdCaracteristica;
	
	public EscudoDefensaDecorador(CaracterPersonaje wrapdCaracteristica) {
		super(40);
		this.wrapdCaracteristica = wrapdCaracteristica;
	}

	public int getMagnitud() {
		return wrapdCaracteristica.getMagnitud() + super.getMagnitud();
	}
}
