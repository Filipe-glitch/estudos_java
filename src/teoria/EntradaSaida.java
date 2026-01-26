package teoria;

import java.util.Scanner; //Scanner usado para ler entradas(teclado, arquivos etc)

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade ;
		float peso ;
		String nome = "";
		System.out.println("Digite idade: ");
		idade = teclado.nextInt(); //nextInt: lê inteiro
		System.out.println("Digite peso: ");
		peso = teclado.nextFloat(); //lê um float
		System.out.println("Digite o nome: ");
		nome = teclado.next(); //.next lê uma palavra
		System.out.println("idade é " + idade);
		System.out.printf("peso é %.2f\n", peso);
		System.out.println("nome é " + nome);
		//.nextLine(): lê uma linha inteira
		
		teclado.close(); //feche para evitar vazamneto de recurso
		// System.in : entrada padrão (teclado)
		// System.out : saída padrão (console)
		
		//Casting: Converter um tipo em outro
		
		//casting implícito(automático)
		int a = 10;
		double b = a; // OK, int virou double
		System.out.println(b);
		
		//Casting explícito (manual)
		double x = 9.7;
		int y = (int) x;
        System.out.println(y); // 9, perdeu a parte decimal
        //explícita você assume risco
	}

}
