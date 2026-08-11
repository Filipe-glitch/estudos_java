package poo.polimorfismo_interfaces_c5.exercicio_dois;

class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() { return valorEmCaixa; }

    public void receberPagamentos(double valor) {
        this.valorEmCaixa += valor;
        System.out.println("Pagamento recebido: R$ " + valor + ". Caixa atual: R$ " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado com o valor total de R$ " + valorEmCaixa);
    }
}