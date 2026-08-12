package poo.erros_excecoes_c10.teoria;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500.0);

        try {
            conta.sacar(200.0);
            conta.sacar(400.0); // Dispara a exceção customizada
        } 
        catch (SaldoInsuficienteException e) {
            System.out.println("Falha na operação de conta: " + e.getMessage());
        }
    }
}