package poo.sealed_class_c7.exemplo_dois;
import java.util.Scanner;

public class MainPetMachine {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option = -1;

        do {
            System.out.println("\n=== MÁQUINA DE BANHO PET ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer água (+2L)");
            System.out.println("3 - Abastecer shampoo (+2L)");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se há pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar/Higienizar a máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Limpa buffer
            } else {
                scanner.nextLine();
                System.out.println("Entrada inválida. Digite um número.");
                continue;
            }

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> System.out.println("Água: " + petMachine.getWater() + " Litro(s)");
                case 5 -> System.out.println("Shampoo: " + petMachine.getShampoo() + " Litro(s)");
                case 6 -> System.out.println(petMachine.hasPet() ? "Há um pet na máquina." : "A máquina está vazia.");
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (option != 0);
    }

    private static void setPetInPetMachine() {
        System.out.print("Informe o nome do pet: ");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Nome inválido. Informe o nome do pet: ");
            name = scanner.nextLine().trim();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
