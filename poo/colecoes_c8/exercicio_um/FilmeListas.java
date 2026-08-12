package poo.colecoes_c8.exercicio_um;

public class FilmeListas extends TituloListas implements ClassificavelLista {

    public FilmeListas(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
