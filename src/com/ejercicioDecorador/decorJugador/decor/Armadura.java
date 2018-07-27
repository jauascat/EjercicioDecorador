package com.ejercicioDecorador.decorJugador.decor;

import com.ejercicioDecorador.decorCaracteristica.decor.defensa.ArmaduraDefensaDecorador;
import com.ejercicioDecorador.decorCaracteristica.decor.vida.ArmaduraVidaDecorador;
import com.ejercicioDecorador.decorJugador.jugadores.Personaje;

public class Armadura implements ObjetoInventario {

	@Override
	public void efectuarCaracterPersonaje(Personaje personaje) {
		
		personaje.setDefensa
			(new ArmaduraDefensaDecorador(personaje.getDefensa()));
		
		personaje.setVida
			(new ArmaduraVidaDecorador(personaje.getVida()));
	}
}
