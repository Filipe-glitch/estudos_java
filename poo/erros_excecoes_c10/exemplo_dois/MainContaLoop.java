package poo.erros_excecoes_c10.exemplo_dois;
import java.util.Scanner;

public class MainContaLoop {
    public static void main(String[] args) {
        Conta c1 = new Conta("Mario", 5000.0);
        Conta c2 = new Conta("Luigi", 2000.0);
        try (Scanner teclado = new Scanner(System.in)) {
            c1.exibirInformacoes();
            c1.depositar(300);
            c1.sacar(800);
            c1.exibirInformacoes();
            boolean sucessoTransferencia = false;
            while (!sucessoTransferencia) {
                try {
                    System.out.print("\nDigite o valor para transferir para Luigi: ");
                    double valor = teclado.nextDouble();

                    c1.transferir(valor, c2);
                    sucessoTransferencia = true;

                    System.out.println("\nTransferência realizada com sucesso!");
                    c1.exibirInformacoes();
                    c2.exibirInformacoes();

                } 
                catch (Exception e) {
                    System.out.println("Falha na operação: " + e.getMessage());
                    System.out.println("Por favor, tente novamente com outro valor.");
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
