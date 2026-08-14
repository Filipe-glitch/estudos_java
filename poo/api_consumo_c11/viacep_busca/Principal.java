package poo.api_consumo_c11.viacep_busca;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            ConsultaCep consultaCep = new ConsultaCep();

            System.out.print("Digite um número de CEP para consulta (apenas números): ");
            String cep = leitura.nextLine();

            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println("\n--- Endereço Encontrado ---");
                System.out.println(novoEndereco);

                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvaJson(novoEndereco);

            } 
            catch (RuntimeException | IOException e) {
                System.err.println("\nErro: " + e.getMessage());
                System.err.println("Finalizando a aplicação.");
            }
        }
    }
}
