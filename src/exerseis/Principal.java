package exerseis;

public class Principal {

	public static void main(String[] args) {
     Cofrinho c = new Cofrinho();
     
     c.add(new Moeda("Euro", 0.5));
     c.add(new Moeda("Euro", 1));
     c.add(new Moeda("Euro", 2));
     
     System.out.println("O total no cofrinho é: " + c.calcularTotal());
	}
}
