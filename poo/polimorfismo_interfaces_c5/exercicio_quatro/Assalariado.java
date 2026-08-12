package poo.polimorfismo_interfaces_c5.exercicio_quatro;

public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}
