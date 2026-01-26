package erros;

public class Exemplouncchecked {

	public static void main(String[] args) {
		int idade = -5;
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
	}

}
