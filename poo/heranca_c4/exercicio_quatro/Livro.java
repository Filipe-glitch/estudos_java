package poo.heranca_c4.exercicio_quatro;

public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private int edicao;

    public Livro(String titulo, Autor autor, String genero, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdicao() {
        return edicao;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero + " | Edição: " + edicao);
        if (autor != null) {
            autor.exibirInformacoes();
        }
    }
}