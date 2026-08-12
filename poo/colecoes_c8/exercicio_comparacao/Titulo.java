package poo.colecoes_c8.exercicio_comparacao;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Título: " + nome + " (" + anoDeLancamento + ")";
    }
}