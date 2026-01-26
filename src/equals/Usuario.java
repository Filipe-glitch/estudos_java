package equals;

public class Usuario {
    int id;
    String nome;
    String cpf;

    public Usuario(int id, String nome, String cpf) { 
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object outro) {
        // Compara consigo mesmo
        if (outro == this) {
            return true;
        }

        // Verifica se é instância de Usuario
        if (!(outro instanceof Usuario)) {
            return false;
        }

        // Type cast para Usuario
        Usuario o = (Usuario) outro;
        /*temos objeto de uma classe e queremos indicar ele,colocamos entre parênteses.*/

        // Compara se os atributos são iguais
        return this.id == o.id &&
               this.nome.equals(o.nome) &&
               this.cpf.equals(o.cpf);
    }
    @Override 
    public String toString() { 
    return "nome:" + nome + "cpf:" + cpf ;
    }
}