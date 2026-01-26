package collections;
import java.util.PriorityQueue;
public class Priority {

	public static void main(String[] args) {
		PriorityQueue<Integer> fila = new PriorityQueue<Integer>();  // Criando a fila 
		fila.add(10); // adicionando elementos para fila usando add()
		fila.add(20); 
		fila.add(15); 
		
		System.out.println(fila.peek());  // Imprimindo o elemento do topo da fila 
		System.out.println(fila.poll()); //Imprimindo e remove o primeiro elemento 
		System.out.println(fila.peek()); // Imprimindo o elemento do topo novamente 
	}
}
