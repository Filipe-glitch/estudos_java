package poo.heranca_c4.exercicio_quatro;

public class LivroDigital extends Livro {
    private int downloads;
    private double tamanhoMb;

    public LivroDigital(String titulo, Autor autor, String genero, int edicao, int downloads, double tamanhoMb) {
        super(titulo, autor, genero, edicao);
        this.downloads = downloads;
        this.tamanhoMb = tamanhoMb;
    }

    public int getDownloads() {
        return downloads;
    }

    public double getTamanhoMb() {
        return tamanhoMb;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Formato: Digital | Downloads: " + downloads + " | Tamanho: " + tamanhoMb + " MB");
    }
}
