package poo.colecoes_c8.projeto_exemplo;
import java.util.Scanner;

public class MainCartaoCredito {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: R$ ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao = 1;
        while (opcao != 0) {
            System.out.print("\nDigite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.print("Digite o valor da compra: R$ ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.print("Digite 0 para finalizar ou 1 para realizar outra compra: ");
                opcao = leitura.nextInt();
            } 
            else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }

        System.out.println("\n***********************************");
        System.out.println("COMPRAS REALIZADAS (ORDENADAS POR VALOR):\n");
        for (Compra c : cartao.getCompras()) {
            System.out.println(c);
        }
        System.out.println("***********************************");
        System.out.printf("\nSaldo restante no cartão: R$ %.2f\n", cartao.getSaldo());
        leitura.close();
    }
}
