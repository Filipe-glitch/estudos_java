package poo.encapsulamento_c3.exercicio_clean_code;

public class NumerosMagicos {
    private double nota1;
    private double nota2;
    private int faltas;

    // Constantes para evitar valores "soltos" no código (Clean Code)
    private static final int LIMITE_FALTAS = 7;
    private static final double MEDIA_REPROVACAO = 4.0;
    private static final double MEDIA_APROVACAO = 7.0;

    public NumerosMagicos(double nota1, double nota2, int faltas) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    public void avaliarResultado() {
        double media = (nota1 + nota2) / 2.0;

        if (faltas > LIMITE_FALTAS) {
            System.out.println("Reprovado por faltas.");
        } else if (media < MEDIA_REPROVACAO) {
            System.out.println("Reprovado por média.");
        } else if (media < MEDIA_APROVACAO) {
            System.out.println("Em exame final.");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
