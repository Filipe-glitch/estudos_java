package fundamentos;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite seu nome: ");
        String name = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Você é emancipado? (s/n): ");
        boolean isEmancipated = teclado.next().equalsIgnoreCase("s");

        //Estruturas Condicionais
        if (idade < 18) {
            System.out.println("Acesso negado: menor de idade.");
        } 
		else if (idade > 60) {
            System.out.println("Acesso permitido: perfil idoso.");
        } 
		else {
            System.out.println("Acesso permitido: perfil adulto.");
        }

        //Operador Ternário
        boolean canDrive = (idade >= 18) || isEmancipated;
        String message = canDrive 
                ? name + ", você pode dirigir!\n" 
                : name + ", você NÃO pode dirigir!\n";
        System.out.print(message);

        //Regra de Negócio (Exemplo: Validação de Plano e Filmes)
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } 
		else {
            System.out.println("Confira os melhores filmes retrô!");
        }

        if (incluidoNoPlano && tipoPlano.equalsIgnoreCase("plus")) {
            System.out.println("Acesso ao filme: LIBERADO");
        } 
		else {
            System.out.println("Acesso ao filme: NEGADO");
        }

        // Switch
        System.out.print("\nDigite um número de 1 a 7 para o dia da semana: ");
        int dia = teclado.nextInt();

        String mensagemDia = switch (dia) {
            case 1, 7 -> {
                String nomeDia = (dia == 1) ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s (Fim de semana!)", nomeDia);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Dia inválido";
        };
        System.out.println(mensagemDia);
        teclado.close();
    }
}