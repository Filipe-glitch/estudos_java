package poo.colecoes_c8.projeto_exemplo;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.getValor());
    }

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", descricao, valor);
    }
}
