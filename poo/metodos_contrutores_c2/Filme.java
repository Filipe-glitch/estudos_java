package poo.metodos_contrutores_c2;

public class Filme {
    String nome;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int duracaoEmMinutos;
    int totalDeAvaliacoes;
    int anoDeLancamento;

    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return totalDeAvaliacoes == 0 ? 0 : somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
