package poo.colecoes_c8.exercicio_dois;
import java.util.HashMap;
import java.util.Map;

public class MainUsoHashMap {

    public static void main(String[] args) {
        Map<String, Integer> animaisPorCategoria = new HashMap<>();

        animaisPorCategoria.put("Gatos", 1);
        animaisPorCategoria.put("Cachorros", 2);
        animaisPorCategoria.put("Roedores", 3);

        int valorCachorros = animaisPorCategoria.get("Cachorros");
        System.out.println("Valor da chave 'Cachorros': " + valorCachorros);

        animaisPorCategoria.remove("Gatos");

        System.out.println("\n--- Mapeamento Atualizado ---");
        for (String chave : animaisPorCategoria.keySet()) {
            System.out.println("Chave: " + chave + " | Valor: " + animaisPorCategoria.get(chave));
        }
    }
}
