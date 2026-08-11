package poo.classes_atributos_c1.exercicio_um;

public class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada com sucesso. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.printf("Falha na venda. Estoque insuficiente de %s (Disponível: %d)%n", nome, quantidade);
        }
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
}
