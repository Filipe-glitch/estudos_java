package poo.erros_excecoes_c10.exemplo_dois;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor de depósito inválido: R$ " + valor);
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor de saque inválido: R$ " + valor);
        }
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente (Saldo atual: R$ " + saldo + ")");
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws Exception {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void exibirInformacoes() {
        System.out.println("--------------------");
        System.out.println("Titular: " + nome);
        System.out.println("Saldo: R$ " + saldo);
    }
}
