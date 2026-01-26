package exernove;

import java.util.ArrayList;

public class Poliformismo {

	public static void main(String[] args) {
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add( new Horista("Mario",100,40.5f) ); 
		listaFuncionarios.add( new Comissionado("Luigi",50000,0.05f) ); 
		listaFuncionarios.add( new Assalariado("Yoshi",3500) ); 
		float totalPagamento=0; 
		for (Funcionario f : listaFuncionarios) { 
		   totalPagamento+= f.pagamento(); 
		} 
		System.out.println("Total pagamento: " + totalPagamento);
	}
}

