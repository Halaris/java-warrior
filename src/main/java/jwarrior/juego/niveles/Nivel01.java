package jwarrior.juego.niveles;

import java.util.ArrayList;
import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.Puerta;
import jwarrior.posiciones.Salida;
import jwarrior.unidades.Guerrero;

public class Nivel01 extends Nivel {

	public Nivel01(final Jugador jugador) {
		super("Nivel 01", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		List<Posicion> posiciones = new ArrayList<Posicion>();
		posiciones.add(new Puerta());
		posiciones.add(new Posicion(new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador)));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion());
		posiciones.add(new Posicion());
		posiciones.add(new Posicion());
		posiciones.add(new Salida());

		return posiciones;
	}

}
