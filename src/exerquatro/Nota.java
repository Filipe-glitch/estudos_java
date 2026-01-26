package exerquatro;

public class Nota {
private double nota1;
private double nota2;
private int faltas;

public Nota() {
	
}
public Nota(double nota1, double nota2, int faltas) {
	setNota1(nota1);
	setNota2(nota2);
	setFaltas(faltas);
	}

public int getFaltas() {
	return faltas;
}
public void setFaltas(int faltas) {
	if(faltas > 40 || faltas < 0) {
		System.out.println("Número de faltas invalido");
		return;
	}
	this.faltas = faltas;
}
void setNota1(double nota) {
	if(nota < 0 || nota>10) {
	System.out.println("nota invalida");
	return;}
	nota1 = nota;
}

void setNota2(double nota) {
	if(nota < 0 || nota>10) {
		System.out.println("nota invalida");
		return;} //aqui poderia ser lançada uma exceção 
	nota2 = nota;
}
public double getNota1() {
	return nota1;
}
public double getNota2() {
	return nota2;
}

void resultado() {
	//método faz duas coisas, calcula média e imprime resultado(ideial seria separar)
	double media = (nota1 + nota2)/2;
	System.out.println("Média: " + media);
	if(faltas > 7) {
		System.out.println("reprovado por faltas");
	}
	else if(media < 4) {
		System.out.println("Reprovado");
	}
	else if(media < 7) {
		System.out.println("Exame final");
	}
	else {
		System.out.println("APROVADO");
	}
}
}
