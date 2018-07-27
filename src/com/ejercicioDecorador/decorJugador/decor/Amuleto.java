package com.ejercicioDecorador.decorJugador.decor;

import com.ejercicioDecorador.decorCaracteristica.decor.magia.AmuletoMagiaDecorador;
import com.ejercicioDecorador.decorJugador.jugadores.Personaje;
import com.ejercicioDecorador.decorJugador.jugadores.Trabajador;

public class Amuleto implements ObjetoInventario {

	@Override
	public void efectuarCaracterPersonaje(Personaje personaje) {
		
		if(!(personaje instanceof Trabajador))
		personaje.setMagia
			(new AmuletoMagiaDecorador(personaje.getMagia()));
	}
}
