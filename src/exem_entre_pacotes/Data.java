package exem_entre_pacotes;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	 
	   public int getDia() {
		   return dia;
	   }
	   public void setDia(int dia) {
		   if(dia > 0 && dia < 30) {
			  this.dia = dia;
		      System.out.println("dia válido");} //má prática
		   else {
			   System.out.println("dia inválido");
		   }
	   }
	   
	   public int getMes() {
		return mes;
	   }
	   
	   public void setMes(int mes) {
		 if(mes > 0 && mes < 12) {  
		   this.mes = mes;
		 }
	   }
	   
	   public int getAno() {
		return ano;
	   }
	   public void setAno(int ano) {
		 if (ano > 0) {
		    this.ano = ano;
		  }
	   }
	}
//SETTER NÃO DEVEM IMPRIMIR NADA,APENAS validar e atribuir.
//o objetivo é mostrar quando a validação falha. no dia será mantido mas nos outros será removido.
//If sem else é um padrão mais usado. Se for inválido, nada acontece e o valor não é alterado.

