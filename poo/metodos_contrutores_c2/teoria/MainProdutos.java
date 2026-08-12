package poo.metodos_contrutores_c2.teoria;

import java.util.ArrayList;

public class MainProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());
        
        System.out.println("\n--- Lista Completa de Produtos ---");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }
}
