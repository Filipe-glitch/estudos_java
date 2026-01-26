package enumeracao;
enum Estacao {VERAO, OUTONO, INVERNO, PRIMAVERA }
public class Principal {

	public static void main(String[] args) {
		Estacao estacaoRoupa = Estacao.INVERNO;
		 switch(estacaoRoupa) { 
	      case VERAO: 
	        System.out.println("Arrase na praia"); 
	        break; 
	      case OUTONO: 
	         System.out.println("Passe o outono com elegância"); 
	        break; 
	      case INVERNO: 
	        System.out.println("Se agasalhe bem e com estilo"); 
	        break; 
	      case PRIMAVERA: 
	        System.out.println("Se vista bem na estação das flores"); 
	        break; 
	    } 
	  } 
	}

