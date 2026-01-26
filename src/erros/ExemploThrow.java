package erros;

public class ExemploThrow {
	static void validar(int valor) {
        if (valor <= 0) {
            throw new RuntimeException("Valor inválido");
        }
    }
	public static void main(String[] args) {
	   validar(-10);
	}

}
