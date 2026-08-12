package poo.polimorfismo_interfaces_c5.exercicio_quatro;
import java.util.ArrayList;
import java.util.List;

public class MainFolhaPagamento {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Horista("Mario", 100, 40.50));
        funcionarios.add(new Comissionado("Luigi", 50000, 0.05));
        funcionarios.add(new Assalariado("Yoshi", 3500));

        double totalFolha = 0;

        System.out.println("--- RELATÓRIO DE PAGAMENTOS ---");
        for (Funcionario f : funcionarios) {
            double pagamento = f.calcularPagamento();
            totalFolha += pagamento;
            System.out.printf("Funcionário: %-10s | Pagamento: R$ %.2f\n", f.getNome(), pagamento);
        }

        System.out.println("--------------------------------");
        System.out.printf("Total da Folha: R$ %.2f\n", totalFolha);
    }
}
