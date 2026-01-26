package exercicios;

public class Carro {
String nome;
String modelo; 
float velocidade;

//static: pertence à classe, não a cada objeto
//final é usado para um valor não ser alterado(constante)

static final double PI = 3.1; 
static float milhasParaMetros(float milhas) { //float milhas é a entrada(parâmetro)
	return milhas*1600; // aqui devolve o valor convertido
}
}
