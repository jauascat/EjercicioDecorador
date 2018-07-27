package com.ejercicioDecorador.decorJugador.jugadores;

import java.util.ArrayList;

import com.ejercicioDecorador.decorCaracteristica.caracteristicas.CaracterPersonaje;
import com.ejercicioDecorador.decorJugador.decor.ObjetoInventario;

public abstract class Personaje {

	private CaracterPersonaje vida;
	private CaracterPersonaje ataque;
	private CaracterPersonaje defensa;
	private CaracterPersonaje magia;
	
	private ArrayList<ObjetoInventario> inventario;
	
	public Personaje(
			CaracterPersonaje vida, 
			CaracterPersonaje ataque, 
			CaracterPersonaje defensa,
			CaracterPersonaje magia) {
		super();
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.magia = magia;
		inventario = new ArrayList<>();
	}
	
	public void obtenerCargable(ObjetoInventario objeto) {
		inventario.add(objeto);
		objeto.efectuarCaracterPersonaje(this);
	}

	public CaracterPersonaje getVida() {
		return vida;
	}

	public void setVida(CaracterPersonaje vida) {
		this.vida = vida;
	}

	public CaracterPersonaje getAtaque() {
		return ataque;
	}

	public void setAtaque(CaracterPersonaje ataque) {
		this.ataque = ataque;
	}

	public CaracterPersonaje getDefensa() {
		return defensa;
	}

	public void setDefensa(CaracterPersonaje defensa) {
		this.defensa = defensa;
	}

	public CaracterPersonaje getMagia() {
		return magia;
	}

	public void setMagia(CaracterPersonaje magia) {
		this.magia = magia;
	}
}
