package poo.api_consumo_c11.exercicios_requisicoes;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainTheMealDB {

    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite o nome de uma receita em inglês (ex: pie, arrabiata): ");
            String receita = leitura.nextLine().trim().replace(" ", "%20");

            String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n--- Status Code: " + response.statusCode() + " ---");
            System.out.println("Resposta JSON:");
            System.out.println(response.body());

        } 
        catch (Exception e) {
            System.err.println("Erro ao consultar a API do TheMealDB: " + e.getMessage());
        }
    }
}
