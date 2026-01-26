package exererros;

public class TratamentosErros {
	public static int[] instanciaArray(int n) {
		return new int[n];
		//cria array de tamanho n e se n for negativo teremos um erro.	
	}
	
	
	public static void main(String[] args) {
		
		int tam=10; //tamanho do array
		int arr[]; //armazenar o array criado
		
		try {
			int conta = 10/0; //forçando erros de propósito
			arr = instanciaArray(tam);
			for(int i=0;i<tam;i++) {
				System.out.println(arr[i]);
				System.out.println(conta); //apenas para tirar o erro
			}
		}
		
		catch(NegativeArraySizeException e) {
			System.out.println("Valor invalido, digite outro");
			//Captura erro de array com tamanho negativo
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Impossivel dividir por zero");
			//captura erro matemático(10/0)
		}
		//erros acontecem, programa não quebra pois tem try/catch, você controla o erro
		
	}

}
