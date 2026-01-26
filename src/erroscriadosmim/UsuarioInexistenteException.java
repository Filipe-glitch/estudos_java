package erroscriadosmim;

public class UsuarioInexistenteException extends Exception{
	private static final long serialVersionUID = 1L;
	public UsuarioInexistenteException(String mensagem) {
        super(mensagem);
    }
}
//serialVersionUID: número de versão da classe usado quando objetos são serializados
//serializar = transformar um objeto em dados para salvar em arquivo ou enviar pela rede