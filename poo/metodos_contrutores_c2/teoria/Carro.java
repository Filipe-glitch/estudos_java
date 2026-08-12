package poo.metodos_contrutores_c2.teoria;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calculaIdade() {
        return 2026 - ano;
    }
}
