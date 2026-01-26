package exersete;

public class Livrodigital extends Livro {
private int download;
private double tamanho;

public int getDownload() {
	return download;
}
public void setDownload(int download) {
	this.download = download;
}
public double getTamanho() {
	return tamanho;
}
public void setTamanho(double tamanho) {
	this.tamanho = tamanho;
}

public Livrodigital(String titulo, Autor autor, String genero, int edicao,int download, double tamanho) {
	super(titulo, autor, genero, edicao); //chama o construtor da classe mãe
	this.download = download;
	this.tamanho = tamanho;
}
@Override
public void info() {
	super.info();
	System.out.println("Download: " + download);
	System.out.println("Tamanho: " + tamanho);
}
}
