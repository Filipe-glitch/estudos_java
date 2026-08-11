package fundamentos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteradoresEListas {
    public static void main(String[] args) {
        // Percorrendo e Removendo Elementos de Forma Segura com Iterator
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Manga");
        frutas.add("Abacate");
        frutas.add("Laranja");
        frutas.add("Pêssego");

        System.out.println("Lista inicial: " + frutas);

        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            String fruta = iterator.next();
            if (fruta.equals("Laranja")) {
                iterator.remove(); // Remoção segura durante a iteração
                System.out.println("Item 'Laranja' removido com sucesso.");
            }
        }
        System.out.println("Lista após remoção: " + frutas);

        // Navegação Bidirecional com ListIterator e Somatório
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int soma = 0;
        Iterator<Integer> itSoma = numeros.iterator();
        while (itSoma.hasNext()) {
            soma += itSoma.next();
        }
        System.out.println("\nSoma dos elementos via Iterator: " + soma);

        // Navegação reversa usando ListIterator
        System.out.print("Navegação em ordem reversa: ");
        ListIterator<Integer> listIt = numeros.listIterator(numeros.size());
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();
    }
}
