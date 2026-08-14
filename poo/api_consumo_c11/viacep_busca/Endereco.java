package poo.api_consumo_c11.viacep_busca;

public record Endereco(
        String cep, 
        String logradouro, 
        String complemento, 
        String bairro, 
        String localidade, 
        String uf
) {
}
