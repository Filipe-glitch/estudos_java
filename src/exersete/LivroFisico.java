package exersete;

public class LivroFisico extends Livro {
private int tiragem;
private int peso;

public int getTiragem() {
	return tiragem;
}
public void setTiragem(int tiragem) {
	this.tiragem = tiragem;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
	
	//tiragem = 12; eu consigo modificar pois está nessa classe
	//edicao = 4; não funciona pois na classe dela está escrito como private
	//setEdicao(4); dessa forma eu consigo modificar
	

}
public LivroFisico(int tiragem, int peso) {
	super();
	this.tiragem = tiragem;
	this.peso = peso;
}

@Override  //@ é uma especie de anotação, Override = sobrescrever
public void info() {
	super.info();
	System.out.println("Tiragem: " + tiragem);
	System.out.println("Peso: " + peso);
}
}// queremos que ele sobreescreva o que está na classe mãe



