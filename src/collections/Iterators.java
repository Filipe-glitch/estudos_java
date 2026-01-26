package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Iterators {

	public static void main(String[] args) {
		//integer: classe que representa os inteiros
		ArrayList<Integer> lista = new ArrayList<>(); 
		//HashSet<Integer> conjunto = new HashSet<Integer>(); 
		//HashMap<String,Integer> mapa = new HashMap<String,Integer>(); 
		int soma;
		soma=0;
		
		//For simples, indexando a lista pelos seus índices
		for(int i=0;i<lista.size();i++) { 
		soma += lista.get(i); 
		} 
		soma=0;
		
		//For each:
		for(int item : lista) { 
		soma += item; 
		} 
		soma=0;
		
		//Iterator 
		//Iterator it = mapa.entrySet().iterator(); 
		//Iterator it = conjunto.iterator(); 
		Iterator <Integer>it = lista.iterator(); 
		while(it.hasNext()) { 
		
	    // soma += (int)it.next(); Cast desnecessário
	    soma += it.next();
		} 
        //hasNext:verifica se existe um próximo elemento e retorna verdadeiro ou falso.
		//método next():atualiza o iterador para o próximo item da coleção.
		
		ListIterator <Integer> it2 = lista.listIterator(lista.size()); 
		while (it2.hasPrevious()) {      
		System.out.println(it2.previous()); 
		 }
		//hasPrevious: ele retorna true ou false como resposta. 
		//previous: retorna o iterator em si da posição anterior.
		
		System.out.println("Soma dos elementos: " + soma);
	}
}
