package poo.composicao_c6.teoria;

public class Aluno {
    private String nome;
    private String curso;
    private Avaliacao notas; // Composição: Aluno "TEM UMA" Avaliacao

    public Aluno(String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    public void exibirInformacoes() {
        System.out.println("--------------------------------");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.printf("Média Aritmética: %.2f\n", notas.mediaAritmetica());
        System.out.printf("Média Ponderada:  %.2f\n", notas.mediaPonderada());
    }
}
