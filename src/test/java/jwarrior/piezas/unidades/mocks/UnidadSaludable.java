package jwarrior.piezas.unidades.mocks;

public class UnidadSaludable extends UnidadMock {

	private boolean invocoCurar = false;

	public UnidadSaludable(Integer saludMaxima) {
		this.establecerSaludMaxima(saludMaxima);
	}

	@Override
	public void curar(Integer cantidadARestaurar) {
		this.invocoCurar  = true;
	}

	public boolean invocoCurar() {
		return this.invocoCurar;
	}
}
