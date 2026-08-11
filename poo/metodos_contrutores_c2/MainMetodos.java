package poo.metodos_contrutores_c2;

public class MainMetodos {
    public static void main(String[] args) {
        // Testando Filme
        Filme meuFilme = new Filme();
        meuFilme.nome = "Your Name";
        meuFilme.anoDeLancamento = 2016;

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.5);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média: " + meuFilme.pegaMedia() + "\n");

        // Testando Calculadora
        Calculadora calc = new Calculadora();
        System.out.println("Dobro de 65: " + calc.exibirDobro(65) + "\n");

        // Testando Carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2021;
        meuCarro.cor = "Preto";
        meuCarro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}
