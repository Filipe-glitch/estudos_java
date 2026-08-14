package poo.api_consumo_c11.exercicios_requisicoes;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCoinGecko {

    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite a criptomoeda para consultar em USD (ex: bitcoin, ethereum): ");
            String moeda = leitura.nextLine().trim().toLowerCase();

            String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" 
                    + moeda 
                    + "&vs_currencies=usd";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n--- Status Code: " + response.statusCode() + " ---");
            System.out.println("Resposta JSON:");
            System.out.println(response.body());

        } 
        catch (Exception e) {
            System.err.println("Erro ao consultar a API da CoinGecko: " + e.getMessage());
        }
    }
}