package com.ejercicioDecorador.decorJugador.jugadores;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.ataque.GuerreroAtaque;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.defensa.GuerreroDefensa;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.magia.GuerreroMagia;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.vida.GuerreroVida;

public class Guerrero extends Personaje {

	public Guerrero() {
		super(
			new GuerreroVida(),
			new GuerreroAtaque(),
			new GuerreroDefensa(),
			new GuerreroMagia()
		);
	}
}
