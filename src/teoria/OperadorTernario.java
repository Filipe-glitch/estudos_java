package teoria;

public class OperadorTernario {

	public static void main(String[] args) {
		//condição ? valorSeVerdadeiro : valorSeFalso;
		double media = 6.5;
        String resultado = media >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);
	}
}
