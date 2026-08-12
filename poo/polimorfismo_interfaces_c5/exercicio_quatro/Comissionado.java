package poo.polimorfismo_interfaces_c5.exercicio_quatro;

public class Comissionado extends Funcionario {
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(String nome, double totalVendas, double taxaComissao) {
        super(nome);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularPagamento() {
        return totalVendas * taxaComissao;
    }
}