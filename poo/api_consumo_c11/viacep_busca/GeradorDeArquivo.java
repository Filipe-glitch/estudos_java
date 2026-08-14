package poo.api_consumo_c11.viacep_busca;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String nomeArquivo = endereco.cep().replace("-", "") + ".json";

        try (FileWriter escrita = new FileWriter(nomeArquivo)) {
            escrita.write(gson.toJson(endereco));
            System.out.println("-> Arquivo '" + nomeArquivo + "' gerado com sucesso!");
        }
    }
}