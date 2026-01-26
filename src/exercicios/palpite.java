package exercicios;
import java.util.Scanner;
public class palpite {

	public static void teste() {
		System.out.println("------------- Jogo de advinhação do Leônidas -------------");
		System.out.println("Leônidas quer que você advinhe quantos soldados seus 300 espartanos irão enfrentar");
		Scanner teclado = new Scanner(System.in);
		int palpite;
		int valorCorreto = 10000;
		System.out.print("Digite seu palpite:");
		palpite = teclado.nextInt();
		while(palpite != valorCorreto) {
			if(palpite > valorCorreto) {
				System.out.println("menos");
			}
			else {
				System.out.println("mais");
			}
			System.out.println("Digite outro palpite");
		    palpite = teclado.nextInt();
		}  
		System.out.println("parabéns, você acertou. Fim do programa");
		teclado.close();
	}	   
}