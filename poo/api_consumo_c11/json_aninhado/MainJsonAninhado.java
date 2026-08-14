package poo.api_consumo_c11.json_aninhado;

import com.google.gson.Gson;

public class MainJsonAninhado {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("--- DESSERIALIZAÇÃO DE JSON ANINHADO ---");
        System.out.println("Objeto Livro: " + livro);
        System.out.println("Editora vinculada: " + livro.editora().nome() + " em " + livro.editora().cidade());
    }
}