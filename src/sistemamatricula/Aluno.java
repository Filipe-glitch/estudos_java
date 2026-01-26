package sistemamatricula;
//classe que representa um aluno no sistema
public class Aluno {
	String nome; 
	int matricula; 
	String cpf; 
	
	//COMO REDUZIR O NÚMERO DE LINHAS: BASEADO NA LINHA 7 ATÉ 11 do Principal.java
	Aluno(){
		System.out.println("Aluno criado sem parâmetros");
	}
	
	Aluno(String nome, int matricula, String cpf){
	//Aluno(String pnome, int pmatricula ... sem o This precisariamos mudar o nome.
	this.nome = nome;
	this.matricula = matricula;
	this.cpf = cpf;
	//This serve para fazer referência a classe. referência ao próprio objeto. 
	}
	
	//Este se refere ao aluno Bowser no Principal. Outras formas de construir objeto.
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	//informações do aluno
	public void info(){ 
		System.out.println("nome: " + nome); 
		System.out.println("matricula: " + matricula); 
		System.out.println("cpf: " + cpf);
}
}