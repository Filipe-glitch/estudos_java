package notas;

public class PrincipalConstrutor {

	public static void main(String[] args) {
		Mediaconstrutor mario = new Mediaconstrutor(62, 45, 7.5);
        System.out.println("Média Aritmética: " + mario.mediaAritmetica());

        Mediaconstrutor luigi = new Mediaconstrutor(85, 65, 78.6);
        System.out.println("Média Ponderada: " + luigi.mediaPonderada());		
	}

}
