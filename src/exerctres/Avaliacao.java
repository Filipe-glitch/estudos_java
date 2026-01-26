package exerctres;

public class Avaliacao {
double n1;
double n2;
double n3;
static final int peso1 = 6;
static final int peso2 = 6;
static final int peso3 = 4;

Avaliacao(double n1, double n2, double n3){
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;		
}

public double mediaAritmetica() {
	return (n1 + n2 + n3)/3;
}

public double mediaPonderada() {
	return (n1 * peso1 + n2 * peso2 + n3 * peso3)/ (peso1 + peso2 + peso3);
}
}
