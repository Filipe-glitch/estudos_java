package poo.encapsulamento_c3.teoria;
import java.time.OffsetDateTime;

public class PessoaComRegraNegocio {
    private final String nome;
    private int idade;
    private int anoUltimoIncremento = OffsetDateTime.now().getYear();

    public PessoaComRegraNegocio(String nome) {
        this.nome = nome;
        this.idade = 1; // Nasce com 1 ano
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void incrementarIdade() {
        int anoAtual = OffsetDateTime.now().getYear();
        if (this.anoUltimoIncremento >= anoAtual) {
            System.out.println("A idade só pode ser incrementada uma vez por ano!");
            return;
        }

        this.idade += 1;
        this.anoUltimoIncremento = anoAtual;
    }
}
