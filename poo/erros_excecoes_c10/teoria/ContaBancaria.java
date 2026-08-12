package poo.erros_excecoes_c10.teoria;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Tentativa de saque (R$ " + valor + ") é maior que o saldo atual (R$ " + saldo + ")");
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo restante: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
