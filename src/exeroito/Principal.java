package exeroito;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Rio", 200, 100);
		
		iv.info();
		Ingresso i = new Ingresso("Rock in Rion", 50);
		i.info();
	}
}
