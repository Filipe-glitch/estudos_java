package poo.heranca_c4.exercicio_um;

class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$ " + tarifaMensal + " cobrada. Saldo atual: R$ " + saldo);
    }
}

