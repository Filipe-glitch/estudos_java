package teoria; //nome do pacote no qual a classe está

public class Tiposdevariaveis { //linha que informa o nome da classe

	public static void main(String[] args) {// essa linha é a declaração do método
		//static: indica que o método pertence à classe, e não ao objeto.
	    //public: indica que a classe pode ser acessada de forma pública por outras classes.
		//Main: nome do método principal, ele será o primeiro a ser executado pelo programa
		//String[] args): declaração de array de objetos da classe string.
		
		System.out.println("Hello world"); //imprime uma mensagem e pula linha
		System.out.print("hello"); //apenas imprime a mensagem
		int idade = 46; //estamos declarando idade como inteiro
        idade += 2;
        double peso = 4545.45;
        System.out.println("idade é " + idade); //imprime mensagens formatadas
        System.out.printf("peso é %.2f\n", peso);

        char inicial = 'L';
        boolean maiorDeIdade = false;
        System.out.println("Inicial: " + inicial);
        System.out.println("Maior de idade: " + maiorDeIdade);
        // o tipo da variável NÃO muda depois de declarada
	}
}
