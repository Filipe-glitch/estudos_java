package insteadof;
//Sistema que recebe objetos genéricos e precisa reagir diferente

public class Exemplo {

	public static void main(String[] args) {
		Object evento1 = new ExemploLogin();
		//Object é a classe mãe de todas as classes em Java
		//EventoLogin e EventoErro herdam de Object automaticamente
		//Você pode guardar qualquer objeto dentro de uma variável Object
	    
		Object evento2 = new ExemploErro();
	    processarEvento(evento1);
	    //objetos vão para um método que não sabe o tipo real, descobre em tempo de execução
	    
	    processarEvento(evento2);
	}
	public static void processarEvento(Object evento) {
    //método recebe um Object genérico.
		
		//verificação de tipo em tempo de execução.
        if (evento instanceof ExemploLogin) {
        	ExemploLogin e = (ExemploLogin) evento; // casting necessário
            e.registrarLogin(); //chamando o método específico
        //Sem o instanceof, isso poderia gerar erro (ClassCastException)
        
        } 
        else if (evento instanceof ExemploErro) {
        	ExemploErro e = (ExemploErro) evento; //verifica o tipo,faz casting e usa o método específico
            e.registrarErro(); //chamando o método específico
        }
    }
}
