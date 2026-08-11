package fundamentos;
import java.util.Arrays;

public class ManipulacaoArrays {

    public static void main(String[] args) {
        // Declaração e Inicialização
        String[] frutas = {"Laranja", "Maçã", "Banana"};
        int[] numeros = {45, 45, 546};
        int[] numPrimos = new int[120];

        numPrimos[0] = 5;
        numPrimos[60] = 45;

        // Impressão direta do objeto vs Representação em String
        System.out.println("Referência em memória: " + frutas);
        System.out.println("Conteúdo formatado: " + Arrays.toString(frutas));

        // Navegação via índice (for clássico)
        System.out.print("Elementos do array numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Métodos Utilitários de Arrays
        int[] valores = {30, 20, 80};
        System.out.println("Tamanho do array 'valores': " + valores.length);

        Arrays.sort(valores); // Ordena o array em ordem crescente
        System.out.println("Valores ordenados: " + Arrays.toString(valores));

        // BinarySearch (Exige que o array esteja pré-ordenado)
        int[] ordenado = {1, 2, 5, 9};
        int posicao = Arrays.binarySearch(ordenado, 5);
        System.out.println("Posição do elemento '5': " + posicao);

        // Comparação de Conteúdo entre Arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("Os arrays 'a' e 'b' têm os mesmos elementos? " + Arrays.equals(a, b));
    }
}
