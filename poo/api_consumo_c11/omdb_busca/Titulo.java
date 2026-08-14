package poo.api_consumo_c11.omdb_busca;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year() != null && meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException(
                "Não foi possível converter o ano (" + meuTituloOmdb.year() + ") pois possui mais de 4 caracteres."
            );
        }

        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());

        if ("N/A".equals(meuTituloOmdb.runtime()) || meuTituloOmdb.runtime() == null) {
            this.duracaoEmMinutos = 0;
        } 
        else {
            this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().replace(" min", "").trim());
        }
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Título: " + nome + " | Ano: " + anoDeLancamento + " | Duração: " + duracaoEmMinutos + " min";
    }
}
