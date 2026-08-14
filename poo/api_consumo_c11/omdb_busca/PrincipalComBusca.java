package poo.api_consumo_c11.omdb_busca;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.print("\nDigite um filme para busca (ou 'sair' para finalizar): ");
            busca = leitura.nextLine().trim();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" 
                    + busca.replace(" ", "+") 
                    + "&apikey=a269f0f3";

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);

                titulos.add(meuTitulo);
                System.out.println("-> Filme adicionado à lista com sucesso!");
                System.out.println(meuTitulo);

            } 
            catch (NumberFormatException e) {
                System.err.println("Erro na conversão numérica: " + e.getMessage());
            } 
            catch (IllegalArgumentException e) {
                System.err.println("Erro na URI da busca. Verifique o termo digitado.");
            } 
            catch (ErroDeConversaoDeAnoException e) {
                System.err.println("Regra de Negócio: " + e.getMessage());
            } 
            catch (Exception e) {
                System.err.println("Erro inesperado ao buscar filme: " + e.getMessage());
            }
        }

        if (!titulos.isEmpty()) {
            try (FileWriter escrita = new FileWriter("filmes.json")) {
                escrita.write(gson.toJson(titulos));
                System.out.println("\n--- Arquivo 'filmes.json' gerado com sucesso contendo " + titulos.size() + " filme(s)! ---");
            } 
            catch (Exception e) {
                System.err.println("Erro ao gravar o arquivo no disco: " + e.getMessage());
            }
        } 
        else {
            System.out.println("\nNenhum filme foi adicionado. Nenhum arquivo foi gerado.");
        }

        leitura.close();
        System.out.println("Programa finalizado com sucesso!");
    }
}