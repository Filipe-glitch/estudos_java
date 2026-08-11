package poo.polimorfismo_interfaces_c5.teoria;

import poo.heranca_c4.teoria.Serie;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Serie serie = new Serie(); 
        serie.setNome("Lost");

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        Filme favorito = new Filme();
        favorito.setNome("O Poderoso Chefão");
        favorito.avalia(10);
        favorito.avalia(9.5);

        Filme outro = new Filme();
        outro.setNome("Avatar");
        outro.avalia(2);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        
        System.out.print(favorito.getNome() + ": ");
        filtro.filtrar(favorito);

        System.out.print(outro.getNome() + ": ");
        filtro.filtrar(outro);

        System.out.print("Episódio " + primeiro.getNumero() + " de " + primeiro.getSerie().getNome() + ": ");
        filtro.filtrar(primeiro);
    }
}
