package poo.classes_atributos_c1.exercicio_um;

public class MainEstoque {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque("Camiseta", 10);

        item.vender(3);
        item.vender(8); // Deve indicar estoque insuficiente
    }
}
