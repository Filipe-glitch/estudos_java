package exerctres;

public class Principal {

	public static void main(String[] args) {
      
		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(7, 9, 5));
		Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(7, 6, 8));
		
		a1.info();
		a2.info();
	}
}
