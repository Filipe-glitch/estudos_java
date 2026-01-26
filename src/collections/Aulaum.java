package collections;
import java.util.ArrayList;
import java.util.Collections;
public class Aulaum {

	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList<String>(); 
		//LinkedList<String> pessoas = new LinkedList<String>(); 
		pessoas.add("Mario"); //Adição de novos elementos 
		pessoas.add("Luigi"); 
		pessoas.add("Peach"); 
		pessoas.add("Yoshi"); 
		
		pessoas.remove(1); //remover o segundo da lista
		System.out.println(pessoas.get(0)); // acessar o primeiro da lista
		
		String item1 = pessoas.get(0);//retorna o elemento de índice 0 
		System.out.println("item1 : " + item1);
		
		int total = pessoas.size();//retorna a quantidade de elementos 
		System.out.println("total: " + total);
		
		// pessoas.clear(); //Remove todos os elementos
		
		System.out.println("ordem original");
		System.out.println(pessoas); //Lista dos elementos 
		
		Collections.sort(pessoas); //imprime em ordem alfabetica
		System.out.println(pessoas);
		
		Collections.shuffle(pessoas); //ele mistura 
		System.out.println(pessoas);
		
		Collections.reverse(pessoas); //ele inverte a ordem 
		System.out.println(pessoas);
		
		System.out.println(Collections.min(pessoas)); //vai pegar o menor elemento
		System.out.println(Collections.max(pessoas)); //vai pegar o maior elemento
	}
}
