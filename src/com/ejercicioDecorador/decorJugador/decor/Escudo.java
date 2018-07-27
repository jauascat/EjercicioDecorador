package com.ejercicioDecorador.decorJugador.decor;

import com.ejercicioDecorador.decorCaracteristica.decor.defensa.EscudoDefensaDecorador;
import com.ejercicioDecorador.decorCaracteristica.decor.vida.EscudoVidaDecorador;
import com.ejercicioDecorador.decorJugador.jugadores.Personaje;

public class Escudo implements ObjetoInventario {

	@Override
	public void efectuarCaracterPersonaje(Personaje personaje) {
		
		personaje.setDefensa
			(new EscudoDefensaDecorador(personaje.getDefensa()));
		
		personaje.setVida
			(new EscudoVidaDecorador(personaje.getVida()));
	}

}
