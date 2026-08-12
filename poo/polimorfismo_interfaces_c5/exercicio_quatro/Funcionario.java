package poo.polimorfismo_interfaces_c5.exercicio_quatro;

public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato obriga todas as subclasses a fornecerem sua própria regra de cálculo
    public abstract double calcularPagamento();
}
