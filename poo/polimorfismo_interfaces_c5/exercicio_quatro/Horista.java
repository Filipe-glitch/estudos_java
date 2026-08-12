package poo.polimorfismo_interfaces_c5.exercicio_quatro;

public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}