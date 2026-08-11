package fundamentos;
public class OperadoresMath {
    public static void main(String[] args) {
        // Operações Aritméticas e Divisões
        int a = 10;
        int b = 3;

        int soma = a + b;
        int resto = a % b;
        int divisaoInteira = a / b;
        double divisaoReal = (double) a / b;

        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão real: " + divisaoReal);
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Soma: " + soma);

        // Pré e Pós Incremento
        int num1 = 5;
        System.out.println("\nPós-incremento (imprime 5, vira 6): " + num1++);
        System.out.println("Valor atualizado: " + num1);

        int num2 = 5;
        System.out.println("Pré-incremento (virou 6, imprime 6): " + (++num2));

        // Funções da Classe Math
        System.out.println("\n--- Classe Math ---");
        System.out.println("Raiz quadrada de 9: " + Math.sqrt(9));
        System.out.println("2 elevado ao cubo: " + Math.pow(2, 3));
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        System.out.println("Maior valor entre 10 e 20: " + Math.max(10, 20));
        System.out.println("Arredondar para cima (3.1): " + Math.ceil(3.1));
        System.out.println("Arredondar para baixo (3.9): " + Math.floor(3.9));
        System.out.println("Número aleatório (0.0 até 1.0): " + Math.random());

        // 4. Operadores Bitwise (Bit a Bit)
        System.out.println("\n--- Operadores Bitwise ---");
        int v1 = 6; // 0110 em binário
        int v2 = 5; // 0101 em binário

        System.out.printf("OR  (6 | 5): %d (%s)\n", (v1 | v2), Integer.toBinaryString(v1 | v2));
        System.out.printf("AND (6 & 5): %d (%s)\n", (v1 & v2), Integer.toBinaryString(v1 & v2));
        System.out.printf("XOR (6 ^ 5): %d (%s)\n", (v1 ^ v2), Integer.toBinaryString(v1 ^ v2));
        System.out.printf("Shift Left  (4 << 2): %d\n", (4 << 2));
        System.out.printf("Shift Right (16 >> 2): %d\n", (16 >> 2));

        // Exemplo de Bitwise: Controle de Permissões (Bitmask)
        int LER = 1, ESCREVER = 2;
        int permissoesUsuario = LER | ESCREVER;
        boolean podeEscrever = (permissoesUsuario & ESCREVER) == ESCREVER;
        System.out.println("Permissão para salvar/escrever: " + podeEscrever);
    }
}
