package poo.metodos_contrutores_c2.exercicio_um;

public class MainCalculadoraMedias {

    public static void main(String[] args) {
        CalculadoraMedias alunoA = new CalculadoraMedias(6.2, 4.5, 7.5);
        System.out.printf("Aluno A - Média Aritmética: %.2f\n", alunoA.mediaAritmetica());

        CalculadoraMedias alunoB = new CalculadoraMedias(8.5, 6.5, 7.8);
        System.out.printf("Aluno B - Média Ponderada: %.2f\n", alunoB.mediaPonderada());
    }
}
