package poo.heranca_c4.exercicio_quatro;

public class MainCatalogoLivros {

    public static void main(String[] args) {
        Autor autor1 = new Autor("J. R. R. Tolkien", "tolkien@email.com", "Britânico");

        LivroDigital ebook = new LivroDigital(
            "O Senhor dos Anéis", 
            autor1, 
            "Fantasia", 
            5, 
            6000, 
            12.5
        );

        LivroFisico livroImpresso = new LivroFisico(
            "O Hobbit", 
            autor1, 
            "Fantasia", 
            3, 
            10000, 
            450
        );

        System.out.println("--- DETALHES DO E-BOOK ---");
        ebook.exibirInformacoes();

        System.out.println("\n--- DETALHES DO LIVRO FÍSICO ---");
        livroImpresso.exibirInformacoes();
    }
}