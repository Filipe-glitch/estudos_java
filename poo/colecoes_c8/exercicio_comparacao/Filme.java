package poo.colecoes_c8.exercicio_comparacao;

public class Filme extends Titulo {

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
