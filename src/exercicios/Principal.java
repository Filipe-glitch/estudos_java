package exercicios;

public class Principal {
	public static void main(String[] args) {
        Imcexer.teste(); //chamando método de outra classe
        //palpite.teste();
        //Inversostring.teste();
		
        int resultado = Aritmetica.somar(10, 20);
        System.out.println("Resultado: " + resultado);
        
        Carro c = new Carro(); // criou-se objeto da classe Carro
        c.nome = "Hyundai";
        c.modelo = "Hyundai";
        c.velocidade = 45.78f;
        //Carro o tipo do objeto, c é a variável que guarda o objeto
        
        System.out.println(Carro.milhasParaMetros(15));
        //chamando um método estático da classe, sem precisar criar um objeto
	}

}
