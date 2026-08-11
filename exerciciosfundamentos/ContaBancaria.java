package exerciciosfundamentos;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************************");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.printf("Saldo Inicial: R$ %.2f\n", saldo);
        System.out.println("***********************************");

        String menu = """
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                Digite a opção desejada:""";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                case 2 -> {
                    System.out.print("Informe o valor a transferir: ");
                    double valor = scanner.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente para transferência.");
                    } 
                    else {
                        saldo -= valor;
                        System.out.printf("Transferência realizada. Saldo atual: R$ %.2f\n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Informe o valor a receber: ");
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.printf("Valor recebido. Saldo atual: R$ %.2f\n", saldo);
                }
                case 4 -> System.out.println("Encerrando o sistema. Até logo!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}