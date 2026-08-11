package fundamentos;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Argumentos do Terminal (args) + For-Each
        System.out.println("--- Exemplo 1: Argumentos via Terminal & For-Each ---");
        System.out.println("Quantidade de argumentos recebidos: " + args.length);
        
        // Laço For-Each
        for (String arg : args) {
            System.out.println("Argumento: " + arg);
        }

        // Laço FOR: sabe o número exato de iterações
        System.out.println("--- Exemplo 1: For (Média de 3 avaliações) ---");
        double somaNotas = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite a %dª nota do filme: ", i);
            somaNotas += teclado.nextDouble();
        }
        System.out.printf("Média (For): %.2f\n\n", somaNotas / 3);

        // Laço WHILE: Com valor sentinela (-1 para sair)
        System.out.println("--- Exemplo 2: While (Acumulador com condição de parada) ---");
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Digite a nota do filme (ou -1 para encerrar): ");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas > 0) {
            System.out.printf("Média (While): %.2f\n\n", mediaAvaliacao / totalDeNotas);
        } 
        else {
            System.out.println("Nenhuma nota foi informada.\n");
        }

        // 3. Laço Do-while
        System.out.println("--- Exemplo 3: Do-While ---");
        int contador = 1;
        do {
            System.out.println("Execução do-while número: " + contador);
            contador++;
        } 
        while (contador <= 2);

        // Controle de Fluxo: BREAK e CONTINUE
        System.out.println("\n--- Exemplo 4: Break e Continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // Pula a iteração número 3
            }
            if (i == 7) {
                break; // Interrompe o loop completamente ao chegar em 7
            }
            System.out.println("Número: " + i);
        }
        teclado.close();
    }
}