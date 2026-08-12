package poo.heranca_c4.exercicio_quatro;

public class Autor {
    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String nome, String email, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void exibirInformacoes() {
        System.out.println("Autor: " + nome + " | E-mail: " + email + " | Nacionalidade: " + nacionalidade);
    }
}
