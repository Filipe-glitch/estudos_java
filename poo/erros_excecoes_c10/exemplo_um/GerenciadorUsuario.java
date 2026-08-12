package poo.erros_excecoes_c10.exemplo_um;

public class GerenciadorUsuario {

    public Usuario buscar(String usuarioID) throws UsuarioInexistenteException {
        if ("123456".equals(usuarioID)) {
            return new Usuario(usuarioID);
        }
        throw new UsuarioInexistenteException("Usuário não encontrado para o ID: " + usuarioID);
    }
}
