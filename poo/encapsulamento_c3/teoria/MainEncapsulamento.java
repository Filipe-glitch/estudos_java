package poo.encapsulamento_c3.teoria;

public class MainEncapsulamento {
    public static void main(String[] args) {
        // Testando Getters e Setters
        PessoaEncapsulada p1 = new PessoaEncapsulada();
        p1.setNome("João");
        p1.setIdade(12);
        System.out.println("Pessoa Get/Set: " + p1.getNome() + " | Idade: " + p1.getIdade());

        // Testando Imutabilidade de nome + Validação temporal
        PessoaComRegraNegocio p2 = new PessoaComRegraNegocio("Maria");
        System.out.println("Pessoa com Regra: " + p2.getNome() + " | Idade inicial: " + p2.getIdade());
        
        // Tentando incrementar a idade no mesmo ano
        p2.incrementarIdade();
    }
}
