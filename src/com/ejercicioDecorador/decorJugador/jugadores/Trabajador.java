package com.ejercicioDecorador.decorJugador.jugadores;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.ataque.TrabajadorAtaque;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.defensa.TrabajadorDefensa;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.magia.TrabajadorMagia;
import com.ejercicioDecorador.decorCaracteristica.caracteristicas.vida.TrabajadorVida;

public class Trabajador extends Personaje {

	public Trabajador() {
		super(
			new TrabajadorVida(),
			new TrabajadorAtaque(),
			new TrabajadorDefensa(),
			new TrabajadorMagia()
		);
	}
}
