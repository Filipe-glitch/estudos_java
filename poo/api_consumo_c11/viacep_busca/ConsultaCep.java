package poo.api_consumo_c11.viacep_busca;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep) {
        String cepFormatado = cep.replaceAll("\\D", "");
        URI enderecoUri = URI.create("https://viacep.com.br/ws/" + cepFormatado + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderecoUri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Endereco.class);

        } 
        catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir do CEP informado: " + cep);
        }
    }
}
