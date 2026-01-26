package exercicios;
import java.util.Scanner;
public class Imcexer {

	public static void teste() {
		System.out.println("Cálculo de IMC");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu peso atual: ");
		int peso = teclado.nextInt();
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble(); //ponto no código e virgula no console
		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC é %.2f", imc);
		teclado.close();
	}
}
