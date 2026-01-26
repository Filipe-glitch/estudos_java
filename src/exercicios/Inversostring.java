package exercicios;
import java.util.ArrayList;
import java.util.Scanner;
public class Inversostring {
	
	public static void teste(){
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		String nome;
		for(int i=0; i<qtd ; i++) { 
// roda de 0 até qtd -1, lendo nome por nome do teclado e colocando dentro da lista.
// começa com i=0, repete enquanto i for menor que qtd e incrementa 1 a cada repetição
			
			nome = teclado.next(); //lê  digitado pelo usuário
			listaNomes.add(nome); //adiciona o nome lido ao final da lista
		}
		for(int i = listaNomes.size()-1; i>=0;i--) { 
			//esse for percorre a lista de trás pra frente
			//i >=0 continua até chegar no primeiro indice.
			//size retorna o tamanho da lista.
			System.out.println(listaNomes.get(i)); //pega o nome que está no índice i
		}
		teclado.close();
	}
}
