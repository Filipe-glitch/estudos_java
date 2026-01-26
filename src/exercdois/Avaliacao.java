package exercdois;

public class Avaliacao {
double nota1; 
double nota2; 
double nota3; 

//instanciar: Avaliacao mario = new Avaliacao(7, 8, 9.4); seria colocar os valores dos atrbutos ali dentro

Avaliacao(){
	// Construtor vazio : Avaliacao mario = new Avaliacao() funciona agora
}
Avaliacao(double nota1, double nota2, double nota3){
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nota3 = nota3;
}

public double mediaAritmetica() {
	return(nota1 + nota2 + nota3)/3;
}
public double mediaPonderada() {
	return(nota1 * 2 + nota2 * 3 + nota3 * 4)/9 ;
}
}
