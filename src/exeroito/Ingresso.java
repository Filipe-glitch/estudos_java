package exeroito;

public class Ingresso {
String nomeEvento;
double valor;

void info() {
	System.out.println("Nome evento: " + nomeEvento);
	System.out.println("Valor Ingresso: " + valor);
}

public Ingresso(String nomeEvento, double valor) {
	super();
	this.nomeEvento = nomeEvento;
	this.valor = valor;
}
}
