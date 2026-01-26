package exererros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
		    System.out.print("Digite sua idade: ");
		    int idade = sc.nextInt();
		    System.out.println("Idade digitada: " + idade);

		} 
		catch (InputMismatchException e) {
		    System.out.println("Erro: digite apenas números.");
		}
		sc.close();
	}
}
//uso real pois o programa não quebra e o erro vem do usuário