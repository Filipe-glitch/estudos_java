package exercdois;

public class Principal {

	public static void main(String[] args) {
     
		Avaliacao mario = new Avaliacao();
		// Construtor vazio: precisamos definir os contrutores como está abaixo
		mario.nota1 = 8;
		mario.nota3 = 4;
		mario.nota3 = 7.9;
		
		Avaliacao luigi = new Avaliacao(8, 4.8, 5);
		System.out.println("Média aritmética Luigi: " + luigi.mediaAritmetica());
		System.out.println("Média ponderada Luigi: " + luigi.mediaPonderada());
	}

}
