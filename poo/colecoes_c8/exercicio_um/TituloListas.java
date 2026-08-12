package poo.colecoes_c8.exercicio_um;

public class TituloListas {
    private String nome;
    private int anoDeLancamento;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    public TituloListas(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        if (totalAvaliacoes == 0) return 0;
        return somaAvaliacoes / totalAvaliacoes;
    }
}