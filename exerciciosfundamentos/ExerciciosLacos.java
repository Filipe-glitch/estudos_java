package exerciciosfundamentos;
import java.util.Scanner;

public class ExerciciosLacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Soma de números pares entre 1 e 100
        int somaPares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) somaPares += i;
        }
        System.out.println("Soma dos pares de 1 a 100: " + somaPares);

        // Soma de Array com For-Each
        int[] valores = {10, 20, 30, 40, 50};
        int somaTotal = 0;
        for (int valor : valores) somaTotal += valor;
        System.out.println("Soma total do array: " + somaTotal);

        // Maior Número a partir de Entrada Formatada
        System.out.print("\nDigite números separados por espaço (ex: 10 45 3 22): ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int n = Integer.parseInt(numStr);
            if (n > maior) maior = n;
        }
        System.out.println("O maior número digitado foi: " + maior);

        // Cálculo de Fatorial
        System.out.print("\nDigite um número para calcular o fatorial: ");
        int numeroFatorial = scanner.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numeroFatorial + ": " + fatorial);

        // Pular números terminados em 5 (Continue)
        System.out.print("\nDigite o limite para a contagem: ");
        int limite = scanner.nextInt();
        System.out.print("Contagem (ignorando os terminados em 5): ");
        for (int i = 1; i <= limite; i++) {
            if (i % 10 == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
