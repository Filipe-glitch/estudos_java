package exem_entre_pacotes_dois;
import exem_entre_pacotes.Aluno;
public class Teste {

	public static void main(String[] args) {
		// Aluno a = new Aluno(10021, "super", "454.454.22.11"); aqui daria erro pq o construtor não existe
		Aluno a = new Aluno("super", "111-222-333-45"); //já esse construtor existe na classe Aluno
		a.info(); //aqui chamamos o método info corretamente
	}
}
