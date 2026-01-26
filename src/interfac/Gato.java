package interfac;

class Gato implements Animal{ //'Gato é um Animal'
	@Override
	public void emitirSom() { 
		System.out.println("O gato fala: miau miau"); 
		} 
	@Override
	public void dormir() { 
	System.out.println("Zzz"); 
		} 
} 
//Qualquer classe que implements Animal é obrigada a implementar dormir(), emitirSom().