package com.ejercicioDecorador.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ejercicioDecorador.decorJugador.jugadores.Guerrero;
import com.ejercicioDecorador.decorJugador.jugadores.Mago;
import com.ejercicioDecorador.decorJugador.jugadores.Trabajador;

public class PruebasPersonajeSimple {

	@Test
	public void pruebaMago() {
		
		Mago mago = new Mago();
		assertEquals(8, mago.getVida().getMagnitud());
		assertEquals(15, mago.getAtaque().getMagnitud());
		assertEquals(15, mago.getDefensa().getMagnitud());
		assertEquals(40, mago.getMagia().getMagnitud());
	}
	
	@Test
	public void pruebaGuerrero() {
		
		Guerrero guerrero = new Guerrero();
		assertEquals(20, guerrero.getVida().getMagnitud());
		assertEquals(30, guerrero.getAtaque().getMagnitud());
		assertEquals(30, guerrero.getDefensa().getMagnitud());
		assertEquals(20, guerrero.getMagia().getMagnitud());
	}
	
	@Test
	public void pruebaTrabajador() {
		
		Trabajador trabajador = new Trabajador();
		assertEquals(25, trabajador.getVida().getMagnitud());
		assertEquals(10, trabajador.getAtaque().getMagnitud());
		assertEquals(10, trabajador.getDefensa().getMagnitud());
		assertEquals(10, trabajador.getMagia().getMagnitud());
	}
}
