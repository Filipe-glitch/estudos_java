package collections;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>(); 
		nomes.add("Mario"); 
		nomes.add("Luigi"); 
		nomes.add("Yoshi"); 
		nomes.add("Mario"); //Mario já existe portanto não será adicionado 
		nomes.add("Peach"); 
		nomes.remove("Luigi"); //remove luigi 
		System.out.println(nomes); //Imprime todos os nomes 
		int total = nomes.size(); //descobre total de itens 
		if(nomes.contains("Luigi")) { //Confere se existe 
		System.out.println("Ele está presente"); 
		} 
		else { 
		System.out.println("Não está presente"); 
		} 
		
		System.out.println("Quantas pessoas na lista: " + total);
    }
}