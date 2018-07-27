package com.ejercicioDecorador.decorJugador.decor;

import com.ejercicioDecorador.decorCaracteristica.decor.ataque.EspadaAtaqueDecorador;
import com.ejercicioDecorador.decorCaracteristica.decor.defensa.EspadaDefensaDecorador;
import com.ejercicioDecorador.decorCaracteristica.decor.vida.EspadaVidaDecorador;
import com.ejercicioDecorador.decorJugador.jugadores.Personaje;

public class Espada implements ObjetoInventario {

	@Override
	public void efectuarCaracterPersonaje(Personaje personaje) {
		
		personaje.setAtaque
			(new EspadaAtaqueDecorador(personaje.getAtaque()));
		
		personaje.setDefensa
			(new EspadaDefensaDecorador(personaje.getDefensa()));
		
		personaje.setVida
			(new EspadaVidaDecorador(personaje.getVida()));
	}
}
