package heranca;

public class Principal {

	public static void main(String[] args) {
		//Criação do livro e definição de atributos
		Livro livro1 = new Livro(); 
		livro1.autor = "Ignacio de Loyola"; 
		livro1.custoProducao= 9.5f; 
		livro1.precoVenda= 19.99f; 
		livro1.titulo ="O homem que odiava livros";
		livro1.paginas=100;  
		
		
		//Impressão do que foi solicitado da classe livro1
		System.out.println("Autor: " + livro1.autor + " Custo de producao: "+ livro1.custoProducao +" Preço: " 
				+ livro1.precoVenda +" Quantidade de páginas: "+ 
				livro1.paginas +" titulo: " + livro1.titulo +"\n");
		System.out.println(" O livro " + livro1.titulo + " lucra por venda R$" + livro1.lucro() + " e paga em imposto $" + livro1.imposto()); 
	   
		//Criação do Livro digital e atributos
		LivroDigital livro2 = new LivroDigital("Sherlock", "sir arthur", "https: ...."); 
		livro2.autor = "Pierre Bayard"; 
		livro2.custoProducao= 15.0f; 
		livro2.precoVenda= 34.99f; 
		livro2.titulo ="Como falar dos livros que não lemos";
		livro2.paginas=200; 
		livro2.linkDownload="googleLivros"; 
		livro2.tamanhoMB=4;
		
		//Impressão do que foi solicitado da classe livro2
		System.out.println("Autor: " + livro2.autor + " Custo de producao: "+ livro2.custoProducao +" Preço:" 
				+ livro2.precoVenda +" Quantidade de páginas: " 
				+ livro2.paginas +" titulo: " + livro2.titulo +"\n"); 
		
		
		System.out.println(" O livro " + livro1.titulo + " lucra por venda R$" + livro1.lucro() + " e paga em imposto $" + livro1.imposto());
		System.out.println("O livro " + livro2.titulo + " possui tamanho médio de página de " + livro2.tamanhoPorPagina() +" MB\n"); 
	
		livro1.imposto(); // imprimir na tela a classe imposto
		livro2.imposto(); 
		
		//Teste de confirmação
		System.out.println(livro1 instanceof Livro); //livro1 pertence a classe Livro? true or false
		System.out.println(livro2 instanceof Livro);
		System.out.println(livro1 instanceof LivroDigital);
		System.out.println(livro2 instanceof LivroDigital);
	}

}
