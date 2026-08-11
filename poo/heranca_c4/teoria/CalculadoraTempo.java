package poo.heranca_c4.teoria;

public class CalculadoraTempo {
    private int tempoTotal;

    // Polimorfismo em ação: Aceita qualquer subclasse de Titulo (Filme, Serie, etc.)
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
