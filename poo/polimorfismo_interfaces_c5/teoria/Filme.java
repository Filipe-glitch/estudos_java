package poo.polimorfismo_interfaces_c5.teoria;

import poo.heranca_c4.teoria.Titulo;

public class Filme extends Titulo implements Classificavel {
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return totalDeAvaliacoes == 0 ? 0 : somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
