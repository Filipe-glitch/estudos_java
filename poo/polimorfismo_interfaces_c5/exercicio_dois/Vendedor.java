package poo.polimorfismo_interfaces_c5.exercicio_dois;

class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() { return quantidadeVendas; }

    public void realizarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Vendedor " + getNome() + " realizou " + quantidadeVendas + " vendas.");
    }
}
