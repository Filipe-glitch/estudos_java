package teoria;
import java.util.Arrays; //1
public class Array {

	public static void main(String[] args) {
		//ARRAY :
		String frutas[] = { "laranja", "maça", "banana"};
		int numeros[] = {45, 45, 546};
		int numprimo [] = new int[120]; // criei 120 posições de números possíveis
		numprimo[60] = 45; //na posição 60 temos o 45
		numprimo[0] = 5; //na posição 1 que chamamos de 0 temos o 5
		System.out.println(frutas); //irá aparecer a identificação interna e não o objeto
		
		//impressão do conteúdo
		System.out.println(Arrays.toString(frutas)); //1, usando Arrays.toSring()
		
		for(int i = 0; i < numeros.length ; i++) {
			System.out.print(numeros[i]); //2 usando for(use quando precisar do índice
		}
		
		for(int numprimos : numprimo) {
			System.out.println(numprimos); //3 usando for-each(quando precisar do valor)
		}
		
		int[] nums = {30, 20, 80};
		System.out.println(nums.length); // retorna quantos elementos existem
		Arrays.sort(nums); //ordena o array em ordem presente
		
		int[] num2 = {1, 2, 5, 9};
		int pos = Arrays.binarySearch(num2, 5); //ele procura um valor, array precisa estar ordenado
		System.out.println(pos); // 2
		
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); // equals compara conteúdo(não referência)
		
	} 

}
