package heranca;
//CLASSE FILHA
//extends serve para importar o código de outra classe

public class LivroDigital extends Livro { 
   public String linkDownload; 
   public int tamanhoMB; 
 
   //CONSTRUTORES:
   public LivroDigital(String titulo, String autor, String linkDownload) {
	   //não adianta construtor similar, precisa invocar o construtor da classe mãe
	   super(titulo, autor); //faz referência a classe mãe(Livro) e pode ter mais coisa
   }
   
   public float tamanhoPorPagina(){ 
	 return ((float)tamanhoMB/(float)paginas); 
	   } 
   
   public float imposto(){ 
	 return (0.2f*this.lucro() + 2); 
 } 
   
   public void imprimirImposto() {
	   //super faz referência a classe mãe
	   System.out.println("Imposto livro fisico: " + super.imposto());
	   //this referência a classe filha
	   System.out.println("Imposto livro digital: " + this.imposto()); 
   }
   }

