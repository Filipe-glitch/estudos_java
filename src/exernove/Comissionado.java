package exernove;

public class Comissionado extends Funcionario {
	float vendas;
	float comissao;
	public Comissionado(String nome,float vendas, float comissao) 
	{ 
	super(nome); 
	this.vendas= vendas; 
	this.comissao= comissao; 
	}
    
	@Override
	public float pagamento(){ 
	return comissao*vendas; 
		}
    }
