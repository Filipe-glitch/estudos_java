package exerciciosfundamentos;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Validação de Senha com Controle de Tentativas
        final String SENHA_CORRETA = "1234";
        boolean acessoConcedido = false;

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite a senha do sistema: ");
            String senha = scanner.nextLine();
            
            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Acesso concedido!\n");
                acessoConcedido = true;
                break;
            } 
            else if (tentativas > 1) {
                System.out.println("Senha incorreta. Tentativas restantes: " + (tentativas - 1));
            } 
            else {
                System.out.println("Sistema bloqueado após 3 tentativas incorretas.");
            }
        }

        // 2. Gerenciamento de Lista de Convidados (se autenticado)
        if (acessoConcedido) {
            ArrayList<String> convidados = new ArrayList<>();

            while (true) {
                System.out.print("\nDigite o nome do convidado ('ver' para listar, 'sair' para encerrar): ");
                String nome = scanner.nextLine().trim();

                if (nome.equalsIgnoreCase("sair")) {
                    System.out.println("Gerenciador finalizado.");
                    break;
                }

                if (nome.equalsIgnoreCase("ver")) {
                    System.out.println("Lista atual de convidados: " + convidados);
                    continue;
                }

                // Checa duplicidade sem sensibilidade a maiúsculas/minúsculas
                boolean jaExiste = false;
                for (String convidado : convidados) {
                    if (convidado.equalsIgnoreCase(nome)) {
                        jaExiste = true;
                        break;
                    }
                }

                if (jaExiste) {
                    System.out.println("Aviso: " + nome + " já está na lista.");
                } 
                else {
                    convidados.add(nome);
                    System.out.println(nome + " adicionado com sucesso.");
                }
            }
        }
        scanner.close();
    }
}
