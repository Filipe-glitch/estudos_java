package poo.composicao_c6.teoria;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mario", "Engenharia", new Avaliacao(7.0, 9.0, 5.0));
        Aluno a2 = new Aluno("Luigi", "Sistemas de Informação", new Avaliacao(7.0, 6.0, 8.0));

        a1.exibirInformacoes();
        a2.exibirInformacoes();
    }
}
