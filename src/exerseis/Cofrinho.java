package exerseis;
import java.util.ArrayList;
public class Cofrinho {
   private ArrayList<Moeda> moedas = new ArrayList<>();
   
   //<> infira o tipo genérico com base na declaração à esquerda
   public void add(Moeda m) {
	   moedas.add(m);
   }

   public double calcularTotal() {
	double total = 0;
	for(Moeda m : moedas) {
		total += m.getValor();
	}
	return total;
   }
}