package poo.sealed_class_c7.exemplo_um;

public class MainSealedClasses {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setCode("123");
        manager.setName("João");
        manager.setSalary(5000);
        manager.setLogin("joao");
        manager.setPassword("123456");
        manager.setCommission(1200);

        Salesman salesman = new Salesman();
        salesman.setCode("456");
        salesman.setName("Lucas");
        salesman.setSalary(2000);
        salesman.setPercentPerSold(10);

        printEmployeeInfo(manager);
        printEmployeeInfo(salesman);
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.printf("======== %s ========\n", employee.getClass().getSimpleName());

        // Demostração de Pattern Matching com Sealed Classes no switch (Java 17+)
        switch (employee) {
            case Manager m -> {
                System.out.println("Código: " + m.getCode());
                System.out.println("Nome: " + m.getName());
                System.out.println("Salário: R$ " + m.getSalary());
                System.out.println("Login: " + m.getLogin());
                System.out.println("Comissão: R$ " + m.getCommission());
            }
            case Salesman s -> {
                System.out.println("Código: " + s.getCode());
                System.out.println("Nome: " + s.getName());
                System.out.println("Salário: R$ " + s.getSalary());
                System.out.println("Comissão por Venda: " + s.getPercentPerSold() + "%");
            }
            default -> System.out.println("Tipo de funcionário desconhecido.");
        }
        System.out.println("====================================\n");
    }
}