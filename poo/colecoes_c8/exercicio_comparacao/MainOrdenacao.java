package poo.colecoes_c8.exercicio_comparacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenacao {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        Filme outro = new Filme("John Wick", 2014);
        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        System.out.println("--- Antes da Ordenação ---");
        lista.forEach(System.out::println);

        // Ordena usando o critério definido em compareTo (ordem alfabética pelo nome)
        Collections.sort(lista);

        System.out.println("\n--- Depois da Ordenação ---");
        lista.forEach(System.out::println);
    }
}
