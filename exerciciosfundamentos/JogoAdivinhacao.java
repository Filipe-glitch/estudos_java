package exerciciosfundamentos;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(101); // 0 a 100
        int tentativasMaximas = 5;
        boolean acertou = false;

        System.out.println("===========================================");
        System.out.println("           JOGO DA ADIVINHAÇÃO            ");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas.");
        System.out.println("===========================================\n");

        for (int tentativa = 1; tentativa <= tentativasMaximas; tentativa++) {
            System.out.printf("Tentativa %d de %d: ", tentativa, tentativasMaximas);
            int chute = scanner.nextInt();

            if (chute == numeroSecreto) {
                System.out.printf("Parabéns! Você acertou na %dª tentativa!\n", tentativa);
                acertou = true;
                break;
            } 
            else if (chute < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } 
            else {
                System.out.println("O número secreto é MENOR.");
            }
        }

        if (!acertou) {
            System.out.println("\nFim de jogo! Você esgotou suas tentativas.");
            System.out.println("O número secreto era: " + numeroSecreto);
        }
        scanner.close();
    }
}