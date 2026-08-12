package poo.design_pattern.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        System.out.println("--- ESTADO INICIAL (config1) ---");
        config1.exibirInformacoes();

        config1.setIdioma("en-US");
        config1.setModoDebug(true);

        System.out.println("\n--- ESTADO APÓS MODIFICAÇÃO (config2) ---");
        config2.exibirInformacoes();

        System.out.println("\n--- VERIFICAÇÃO DE IDENTIDADE DE MEMÓRIA ---");
        System.out.println("config1 e config2 referenciam o mesmo objeto? " + (config1 == config2));
    }
}
