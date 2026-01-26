package interfac;

public class Principal {

	public static void main(String[] args) {
		Gato tom = new Gato(); 
		tom.emitirSom(); 
		tom.dormir(); 
		Animal obj = tom; 
		obj.emitirSom(); 
		obj.dormir();
		
		Animal a2 = new Cachorro();
		a2.emitirSom();
	}
}
