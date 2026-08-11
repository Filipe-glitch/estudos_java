package exerciciosfundamentos;
import java.util.Scanner;

public class ValidadorRegras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validação de Doador de Sangue
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do doador (kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("Doador compatível!");
        } 
        else {
            System.out.println("Doador incompatível:");
            if (!idadeValida) System.out.println("- Idade deve ser entre 18 e 65 anos.");
            if (!pesoValido) System.out.println("- Peso deve ser superior a 50 kg.");
        }

        // Validação de Acesso (Código e Nível de Permissões)
        System.out.print("\nDigite o código de acesso: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o nível de permissão (1 a 3): ");
        int nivel = scanner.nextInt();

        boolean codigoOK = codigo == 2023;
        boolean nivelOK = nivel >= 1 && nivel <= 3;

        if (codigoOK && nivelOK) {
            System.out.println("Acesso permitido. Bem-vindo!");
        } 
        else {
            System.out.println("Acesso negado:");
            if (!codigoOK) System.out.println("- Código incorreto.");
            if (!nivelOK) System.out.println("- Nível de permissão inválido.");
        }

        // 3. Validação de Nome com Loop
        scanner.nextLine();
        String nome = "";
        while (nome.trim().length() < 3) {
            System.out.print("\nDigite seu nome (mínimo 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.trim().length() < 3) {
                System.out.println("Nome inválido! Tente novamente.");
            }
        }
        System.out.println("Nome '" + nome.trim() + "' cadastrado com sucesso!");

        scanner.close();
    }
}
