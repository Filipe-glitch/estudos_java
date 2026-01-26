package exem_entre_pacotes;

public class Aluno {
	private int matricula; 
	public String cpf; 
	public String nome; 
	
	public Aluno(String nome, String cpf){ 
	this.nome = nome; 
	this.cpf = cpf; 
	//this.matricula = Cadastro.gerarNovaMatricula(); 
	}
	public void info() { 
		System.out.println("Matricula: " + matricula);
		System.out.println("nome : " + nome);
		System.out.println("CPF: " + cpf);
	}
}
