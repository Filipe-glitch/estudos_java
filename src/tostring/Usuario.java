package tostring;

public class Usuario {
	int id; //acesso default pois está sem public, private ou protected
    String nome; //é boa prática estar private
    String cpf;
    //precisa ter construtor
    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    } 
    //métodos sobrescritos
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }
}