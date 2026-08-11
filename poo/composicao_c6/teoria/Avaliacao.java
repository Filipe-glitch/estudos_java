package poo.composicao_c6.teoria;

public class Avaliacao {
    private double n1;
    private double n2;
    private double n3;

    // Uso de constantes estáticas (static final)
    private static final int PESO1 = 6;
    private static final int PESO2 = 6;
    private static final int PESO3 = 4;

    public Avaliacao(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double mediaAritmetica() {
        return (n1 + n2 + n3) / 3.0;
    }

    public double mediaPonderada() {
        return (n1 * PESO1 + n2 * PESO2 + n3 * PESO3) / (double) (PESO1 + PESO2 + PESO3);
    }
}
