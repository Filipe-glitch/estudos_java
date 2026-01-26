package teoria;

public class NumerosMagico {
	//Números mágicos: número “jogado” no código sem explicação do que ele significa
		double nota1;
	    double nota2;
	    int faltas;

	    // CONSTANTES (regras do sistema)
	    static final int LIMITE_FALTAS = 7;
	    static final double MEDIA_REPROVACAO = 4.0;
	    static final double MEDIA_APROVACAO = 7.0;

	    void resultado() {
	        double media = (nota1 + nota2) / 2;

	        if (faltas > LIMITE_FALTAS) {
	            System.out.println("Reprovado por faltas");
	        } 
	        else if (media < MEDIA_REPROVACAO) {
	            System.out.println("Reprovado");
	        } 
	        else if (media < MEDIA_APROVACAO) {
	            System.out.println("Exame final");
	        } 
	        else {
	            System.out.println("Aprovado");
	        }
	    }
}
