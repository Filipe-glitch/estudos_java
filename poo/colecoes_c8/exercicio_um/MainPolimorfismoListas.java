package poo.colecoes_c8.exercicio_um;
import java.util.ArrayList;
import java.util.List;

public class MainPolimorfismoListas {

    public static void main(String[] args) {
        FilmeListas favorito = new FilmeListas("The Matrix", 1999);
        favorito.avalia(10);

        FilmeListas outro = new FilmeListas("John Wick", 2014);
        outro.avalia(9);

        SerieListas serie = new SerieListas("La Casa de Papel", 2017);

        List<TituloListas> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for (TituloListas item : lista) {
            System.out.println("Nome: " + item.getNome());

            // Pattern Matching com instanceof
            if (item instanceof FilmeListas filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao() + " estrelas");
            }
            System.out.println("-----------------------------------");
        }
    }
}