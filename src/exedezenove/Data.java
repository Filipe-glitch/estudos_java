package exedezenove;
//desenvolva uma classe Data, com atributos, dia, mês e ano encapsulados com get/set. 
//Para simplificar, assuma que todo mês pode seja composto por 30 dias. 
public class Data {
   private int dia;
   private int mes;
   private int ano;
   public Data(int dia, int mes, int ano) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
   }
   
   public int getDia() {
	return dia;
   }
   public void setDia(int dia) {
	 if (dia >= 1 && dia <= 30) {
       this.dia = dia;
       } 
	 else {
        System.out.println("Dia inválido!");
          }
   }
   
   public int getMes() {
	return mes;
   }
   public void setMes(int mes) {
	 if (mes >= 1 && mes <= 12) {
       this.mes = mes;
     } 
	 else {
       System.out.println("Mês inválido!");
          }
   }
   
   public int getAno() {
	return ano;
   }
   public void setAno(int ano) {
	   if (ano > 0) {
           this.ano = ano;
       } 
	   else {
           System.out.println("Ano inválido!");
            }
   }
   
}
