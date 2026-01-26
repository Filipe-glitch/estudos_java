package exernove;

public class Horista extends Funcionario{
	int horasTrabalhadas; 
	float precoHora; 
	
	public Horista(String nome,int horasTrabalhadas, float precoHora) 
	{ 
	   super(nome); 
	   this.horasTrabalhadas= horasTrabalhadas; 
	   this.precoHora= precoHora; 
	} 
	
	@Override
	public float pagamento(){ 
	   return precoHora*horasTrabalhadas; 
	} 
} 

