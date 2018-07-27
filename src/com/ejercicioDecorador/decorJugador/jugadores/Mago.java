package com.ejercicioDecorador.decorJugador.jugadores;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.ataque.MagoAtaque;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.defensa.MagoDefensa;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.magia.MagoMagia;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.vida.MagoVida;

public class Mago extends Personaje {

	public Mago() {
		super(
			new MagoVida(),
			new MagoAtaque(),
			new MagoDefensa(),
			new MagoMagia()
		);
	}
}
