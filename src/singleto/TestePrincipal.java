package singleto;

public class TestePrincipal {

	public static void main(String[] args) {
		// "Criando" configurações em partes diferentes do sistema
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        // Alterando usando a primeira referência
        config1.setIdioma("en-US");
        config1.setModoDebug(true);

        System.out.println("Configuração 1:");
        config1.info();

        System.out.println("\nConfiguração 2:");
        config2.info();

        // prova de que é a mesma instância
        System.out.println("\nSão o mesmo objeto?");
        System.out.println(config1 == config2); // true
	}

}
