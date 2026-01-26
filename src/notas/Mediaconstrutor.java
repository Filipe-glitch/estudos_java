package notas;

public class Mediaconstrutor {
	private double nota1;
    private double nota2;
    private double nota3;

    public Mediaconstrutor(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double mediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double mediaPonderada() {
        final int PESO1 = 2;
        final int PESO2 = 3;
        final int PESO3 = 4;

        return (nota1 * PESO1 + nota2 * PESO2 + nota3 * PESO3)
                / (PESO1 + PESO2 + PESO3);
    }
}
