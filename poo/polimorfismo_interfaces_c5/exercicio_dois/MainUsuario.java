package poo.polimorfismo_interfaces_c5.exercicio_dois;

public class MainUsuario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "carlos@email.com", "senha123");
        Vendedor vendedor = new Vendedor("Ana", "ana@email.com", "senha456");
        Atendente atendente = new Atendente("Lucas", "lucas@email.com", "senha789", 100.00);

        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();

        vendedor.realizarVenda();
        vendedor.consultarVendas();

        atendente.receberPagamentos(50.00);
        atendente.fecharCaixa();
    }
}
