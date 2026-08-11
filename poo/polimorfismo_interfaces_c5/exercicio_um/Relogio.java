package poo.polimorfismo_interfaces_c5.exercicio_um;

// Classe abstrata base
public abstract class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() { return hora; }
    public void setHora(int hora) { this.hora = hora; }

    public int getMinuto() { return minuto; }
    public void setMinuto(int minuto) { this.minuto = minuto; }

    public int getSegundo() { return segundo; }
    public void setSegundo(int segundo) { this.segundo = segundo; }

    public abstract String retornarHora();

    // Recebe a própria classe abstrata como parâmetro (Polimorfismo)
    public void definirHorario(Relogio outroRelogio) {
        this.hora = outroRelogio.getHora();
        this.minuto = outroRelogio.getMinuto();
        this.segundo = outroRelogio.getSegundo();
    }
}

class RelogioBrasileiro extends Relogio {
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String retornarHora() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }
}

class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String retornarHora() {
        int hora12 = getHora() % 12;
        if (hora12 == 0) hora12 = 12;
        String periodo = (getHora() >= 12) ? "PM" : "AM";

        return String.format("%02d:%02d:%02d %s", hora12, getMinuto(), getSegundo(), periodo);
    }
}
