package exerccinco;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mário", 122, 0.2, new Curso("Engenharia", 1500));
		
		a1.info();
		System.out.println("Pagamento: " + a1.pagamento());
	}
}
