package poo.heranca_c4.exercicio_tres;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;

    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    // Sobrescrita do equals para comparação por conteúdo de negócio
    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }

        if (!(outro instanceof Usuario)) {
            return false;
        }

        Usuario outroUsuario = (Usuario) outro;

        return this.id == outroUsuario.id &&
               this.nome.equals(outroUsuario.nome) &&
               this.cpf.equals(outroUsuario.cpf);
    }

    // Sobrescrita do toString para representação textual do objeto
    @Override
    public String toString() {
        return "Usuario [ID=" + id + ", Nome=" + nome + ", CPF=" + cpf + "]";
    }
}
