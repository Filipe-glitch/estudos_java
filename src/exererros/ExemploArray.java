package exererros;

public class ExemploArray {

	public static void main(String[] args) {
		int[] notas = {10, 8, 7};

		try {
		    System.out.println(notas[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Posição inválida no array.");
		}
	}
}
//NÃO usar exceções: controle normal de fluxo, if/else simples e erros previsíveis 