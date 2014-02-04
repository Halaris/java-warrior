package jwarrior.juego.niveles;

import java.util.ArrayList;
import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.piezas.Puerta;
import jwarrior.piezas.Salida;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.piezas.unidades.Orco;
import jwarrior.posiciones.Posicion;

public class Nivel03 extends Nivel {

	public Nivel03(final Jugador jugador) {
		super("Nivel 03", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		List<Posicion> posiciones = new ArrayList<Posicion>();
		posiciones.add(new Puerta());
		posiciones.add(new Posicion(new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador)));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Salida());

		return posiciones;
	}

}
