package poo.encapsulamento_c3.teoria;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade < 0 || idade > 120) {
            System.out.println("Idade não correspondente.");
        } 
        else if (idade < 18) {
            System.out.println("Menor de idade.");
        } 
        else {
            System.out.println("Maior de idade.");
        }
    }
}
