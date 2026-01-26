package notas;

public class Principal {

	public static void main(String[] args) {
Media mario = new Media();
mario.nota1 = 62;
mario.nota2 = 45;
mario.nota3 = 7.5;

double resultado = mario.MA();
System.out.println("MÉDIA Aritmetica: " + resultado);
	
Media luigi = new Media();
luigi.nota1 = 85;
luigi.nota2 = 65;
luigi.nota3 = 78.6;
double resultado2 = luigi.MP();
System.out.println("MÉDIA Ponderada: " + resultado2);
}
}