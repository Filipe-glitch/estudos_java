package insteadof;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal(); 
		Mamifero m = new Mamifero(); 
		Cachorro c = new Cachorro();
		//Animal é a classe mãe.
		//Reptil e Mamifero são filhas e Cachorro é filha de mamifero.
		System.out.println(m instanceof Animal); // true
		System.out.println(c instanceof Mamifero); // true
		System.out.println(a instanceof Animal);
	}
}
//Se tiver uso excessivo de instanceof em uma classe, você deve usar polimorfismo.
//USO: Debug, validações pontuais, APIs genéricas, frameworks/serialização;
//USO: conversão segura(cast), precisa tratar um caso muito específico; 
//USO: Você não controla a hierarquia (biblioteca externa).
