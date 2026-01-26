package exem_entre_pacotes;

public class Principal {

	public static void main(String[] args) {
	    // a. note que a matricula definida como private não aparece
		//pelo construtor eu consigo, mas pelo atributo não	   
		Horario aula = new Horario();
	    aula.setHora(40); // mesmo assim eu posso colocar uma hora invalida aqui
	    aula.setMinuto(30);
	    aula.setSegundo(0);
		    
	    Data evento = new Data();
	    evento.setDia(45);
	    evento.setMes(10); //erro, por causa dele aparece o dia inválido
	    evento.setAno(2010);
	}

}
