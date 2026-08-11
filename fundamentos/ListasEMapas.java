package fundamentos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class ListasEMapas {
    public static void main(String[] args) {
        // ArrayList (Lista dinâmica, ordenada, permite duplicatas)
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Mario");
        pessoas.add("Luigi");
        pessoas.add("Peach");
        pessoas.add("Yoshi");

        pessoas.remove(1); // Remove "Luigi"
        System.out.println("Primeiro da lista: " + pessoas.get(0));
        System.out.println("Total de elementos: " + pessoas.size());

        Collections.sort(pessoas);
        System.out.println("Ordem alfabética: " + pessoas);

        Collections.shuffle(pessoas);
        System.out.println("Elementos embaralhados: " + pessoas);

        System.out.println("Menor elemento (alfabético): " + Collections.min(pessoas));
        System.out.println("Maior elemento (alfabético): " + Collections.max(pessoas));

        // HashSet (Conjunto, não ordenado, NÃO permite duplicatas)
        System.out.println("\n--- Demonstração HashSet ---");
        HashSet<String> nomesUnicos = new HashSet<>();
        nomesUnicos.add("Mario");
        nomesUnicos.add("Luigi");
        nomesUnicos.add("Yoshi");
        nomesUnicos.add("Mario"); // Duplicata ignorada

        System.out.println("Conjunto sem duplicatas: " + nomesUnicos);
        System.out.println("Contém 'Luigi'? " + nomesUnicos.contains("Luigi"));

        // HashMap (Estrutura de Chave -> Valor)
        System.out.println("\n--- Demonstração HashMap ---");
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Uruguai", "Montevidéu");

        System.out.println("Mapeamento completo: " + capitais);
        System.out.println("Capital do Uruguai: " + capitais.get("Uruguai"));

        // PriorityQueue (Fila com prioridade natural)
        System.out.println("\n--- Demonstração PriorityQueue ---");
        PriorityQueue<Integer> fila = new PriorityQueue<>();
        fila.add(20);
        fila.add(10);
        fila.add(15);

        System.out.println("Próximo da fila (peek): " + fila.peek()); // Pega o menor elemento sem remover
        System.out.println("Atendendo elemento (poll): " + fila.poll()); // Remove e retorna o menor
        System.out.println("Novo topo da fila (peek): " + fila.peek());
    }
}
