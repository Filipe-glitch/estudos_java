package exerdez;

public abstract class Computador {
	protected int gbMemoria;
	protected int numProcessadores;

	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}

	abstract double calculaValor();
}
