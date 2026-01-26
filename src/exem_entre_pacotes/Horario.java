package exem_entre_pacotes;

public class Horario {
	 private int hora;
	 private int minuto;
	 private int segundo;
	 
	   public int getHora() { //sempre a primeira letra depois do get ou set maisuscula
		   return hora; //get + atributo. "crie um metodo getset"
	   }
	   
	   public void setHora(int hora) {
		   if(hora >= 0 && hora <= 23)
		     this.hora=hora; // o if sem as {} ele pode cobrir só uma linha
	   }   

	   public int getMinuto() {
		return minuto;
	   }

	   public void setMinuto(int minuto) {
		 if(minuto >= 0 && minuto <= 59) {
		  this.minuto = minuto;
	   }
		 }

	   public int getSegundo() {
		return segundo;
	   }

	   public void setSegundo(int segundo) {
		 if(segundo >= 0 && segundo <= 59) {
		this.segundo = segundo;
	   }
	}
}
