package com.ejercicioDecorador.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ejercicioDecorador.decorJugador.decor.Amuleto;
import com.ejercicioDecorador.decorJugador.decor.Armadura;
import com.ejercicioDecorador.decorJugador.decor.Escudo;
import com.ejercicioDecorador.decorJugador.decor.Espada;
import com.ejercicioDecorador.decorJugador.jugadores.Mago;
import com.ejercicioDecorador.decorJugador.jugadores.Trabajador;

public class PruebasPersonajeEquipado {

	@Test
	public void unEquipamiento() {
		
		Mago mago = new Mago();
		mago.obtenerCargable(new Espada());
		
		assertEquals( 9, mago.getVida().getMagnitud());
		assertEquals(25, mago.getAtaque().getMagnitud());
		assertEquals(25, mago.getDefensa().getMagnitud());
		assertEquals(40, mago.getMagia().getMagnitud());
	}
	
	@Test
	public void dosEquipamientos() {
		
		Mago mago = new Mago();
		mago.obtenerCargable(new Espada());
		mago.obtenerCargable(new Amuleto());
		
		assertEquals( 9, mago.getVida().getMagnitud());
		assertEquals(25, mago.getAtaque().getMagnitud());
		assertEquals(25, mago.getDefensa().getMagnitud());
		assertEquals(50, mago.getMagia().getMagnitud());
	}
	
	@Test
	public void tresEquipamientos() {
		
		Mago mago = new Mago();
		mago.obtenerCargable(new Espada());
		mago.obtenerCargable(new Amuleto());
		mago.obtenerCargable(new Armadura());
		
		assertEquals(29, mago.getVida().getMagnitud());
		assertEquals(25, mago.getAtaque().getMagnitud());
		assertEquals(45, mago.getDefensa().getMagnitud());
		assertEquals(50, mago.getMagia().getMagnitud());
	}
	
	@Test
	public void cuatroEquipamientos() {
		
		Mago mago = new Mago();
		mago.obtenerCargable(new Espada());
		mago.obtenerCargable(new Amuleto());
		mago.obtenerCargable(new Armadura());
		mago.obtenerCargable(new Escudo());
		
		assertEquals(39, mago.getVida().getMagnitud());
		assertEquals(25, mago.getAtaque().getMagnitud());
		assertEquals(85, mago.getDefensa().getMagnitud());
		assertEquals(50, mago.getMagia().getMagnitud());
	}
	
	@Test
	public void anilloParaTrabajador() {
		
		Trabajador trabajador = new Trabajador();
		trabajador.obtenerCargable(new Amuleto());
		trabajador.obtenerCargable(new Escudo());
		
		assertEquals(35, trabajador.getVida().getMagnitud());
		assertEquals(10, trabajador.getAtaque().getMagnitud());
		assertEquals(50, trabajador.getDefensa().getMagnitud());
		assertEquals(10, trabajador.getMagia().getMagnitud());
	}
}
