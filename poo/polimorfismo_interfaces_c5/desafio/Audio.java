package poo.polimorfismo_interfaces_c5.desafio;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return 0;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }
}
