package heranca;
//ESSA É A CLASSE MÃE
public class Livro {
	public String autor;
	public float custoProducao;       
	public float precoVenda; 
	public String titulo; 
	public int paginas; 
	
	//Construtores, a classe principal precisa honrar pelo menos um construtor
	public Livro() {
		//invocação feita no construtor do livro digital está invocando o código aqui.
	}
	
	public Livro(String titulo, String autor){
	//titulo=""; Estou me referindo ao titulo do método ou do atributo?
	this.titulo = titulo; //this.titulo faz referência ao parâmetro
	}
	
	public float lucro(){ 
	return (precoVenda - custoProducao); 
	} 
	
	public float imposto(){ 
	return (0.2f*this.lucro()); 
	} 
	
	public void imprimirTitulo(){ 
	System.out.print("O titulo : "+ titulo); 
}
}
