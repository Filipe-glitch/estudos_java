package exerciciosfundamentos;
import java.util.Scanner;

public class ExerciciosBasicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversão e Casting
        double estoque = 19.9;
        int novoEstoque = (int) estoque;
        System.out.println("Estoque convertido (int): " + novoEstoque);

        double estoqueDois = 78.4;
        System.out.println("Estoque arredondado: " + Math.round(estoqueDois));

        // Média e Conversão de Temperatura
        double nota1 = 7.5, nota2 = 8.0, nota3 = 9.0;
        System.out.println("Média das notas: " + ((nota1 + nota2 + nota3) / 3));

        int celsius = 20;
        double fahrenheit = (celsius * 9.0 / 5) + 32;
        System.out.println("20°C em Fahrenheit: " + fahrenheit);

        // Diferença Absoluta de Idade
        System.out.print("\nDigite o primeiro nome e idade (ex: Ana 25): ");
        String nome1 = scanner.next();
        int idade1 = scanner.nextInt();

        System.out.print("Digite o segundo nome e idade (ex: Bruno 30): ");
        String nome2 = scanner.next();
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("Diferença de idade entre " + nome1 + " e " + nome2 + ": " + diferenca + " anos.");

        // Validação de Entrada de Conta via Split
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("\nDigite Nome e Tipo de Conta (ex: Maria corrente): ");
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        if (partes.length >= 2) {
            String nome = partes[0];
            String tipo = partes[1].toLowerCase();

            if (tipo.equals("corrente") || tipo.equals("poupanca") || tipo.equals("investimento")) {
                System.out.printf("Bem-vindo(a), %s! Sua conta %s está pronta para uso.\n", nome, tipo);
            } 
            else {
                System.out.println("Tipo de conta inválido.");
            }
        }

        // Classificação de Livro
        char categoria = 'F';
        String categoriaDescricao = switch (categoria) {
            case 'F' -> "Ficção";
            case 'N' -> "Não-ficção";
            case 'T' -> "Tecnologia";
            case 'H' -> "História";
            default -> "Categoria inválida";
        };
        System.out.println("\nCategoria do livro: " + categoriaDescricao);

        // Verificação de Paridade e Categoria de Preço
        int num = -8;
        System.out.println("O número " + num + " é " + (num % 2 == 0 ? "Par" : "Ímpar"));

        double novoPreco = 150.00;
        if (novoPreco < 50.00) {
            System.out.println("Categoria: Econômico");
        } 
        else if (novoPreco <= 200.00) {
            System.out.println("Categoria: Intermediário");
        } 
        else {
            System.out.println("Categoria: Premium");
        }

        // Validação de Dia Útil
        System.out.print("\nDigite o dia da semana: ");
        String dia = scanner.nextLine().trim().toLowerCase();

        if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println(dia + " NÃO é um dia útil.");
        } 
        else {
            System.out.println(dia + " é um dia útil.");
        }

        scanner.close();
    }
}