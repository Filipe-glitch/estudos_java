package poo.metodos_contrutores_c2.exercicio_um;

public class CalculadoraMedias {
    private double nota1;
    private double nota2;
    private double nota3;

    public CalculadoraMedias(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double mediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public double mediaPonderada() {
        final int PESO1 = 2;
        final int PESO2 = 3;
        final int PESO3 = 4;

        return (nota1 * PESO1 + nota2 * PESO2 + nota3 * PESO3)
                / (double) (PESO1 + PESO2 + PESO3);
    }
}
