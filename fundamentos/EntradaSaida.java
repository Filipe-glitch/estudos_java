package fundamentos;
import java.util.Scanner;
public class EntradaSaida {
    public static void main(String[] args) {
        // Tipos Primitivos Básicos
        byte idadeByte = 25;
        int idade = 25;
        long populacao = 8000000000L;
        float peso = 68.5f;
        double salario = 3500.50;
        char inicial = 'J';
        boolean ativo = true;
		System.out.println(idadeByte + inicial + salario + populacao);
		System.out.println(ativo);

        //Entrada de dados via Scanner
        Scanner teclado = new Scanner(System.in);
        
		System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.print("Digite seu peso: ");
        peso = teclado.nextFloat();

        System.out.println("\n--- Dados Informados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Peso: %.2f kg\n", peso);
        teclado.close();

        // Casting Implícito
        int valorInt = 10;
        double valorDouble = valorInt; 
		System.out.println(valorDouble);

		// Casting Explícito
        double decimal = 9.7;
        int inteiro = (int) decimal;
		System.out.println(inteiro);
    }
}
