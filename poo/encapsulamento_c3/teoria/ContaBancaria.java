package poo.encapsulamento_c3.teoria;

public class ContaBancaria {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } 
        else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
