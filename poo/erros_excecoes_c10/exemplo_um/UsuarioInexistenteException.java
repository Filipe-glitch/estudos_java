package poo.erros_excecoes_c10.exemplo_um;

// Checked Exception
public class UsuarioInexistenteException extends Exception {
    private static final long serialVersionUID = 1L;

    public UsuarioInexistenteException(String mensagem) {
        super(mensagem);
    }
}
