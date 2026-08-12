package poo.heranca_c4.exercicio_quatro;

public class LivroFisico extends Livro {
    private int tiragem;
    private int pesoGramas;

    public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int pesoGramas) {
        super(titulo, autor, genero, edicao);
        this.tiragem = tiragem;
        this.pesoGramas = pesoGramas;
    }

    public int getTiragem() {
        return tiragem;
    }

    public int getPesoGramas() {
        return pesoGramas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Formato: Físico | Tiragem: " + tiragem + " | Peso: " + pesoGramas + "g");
    }
}
