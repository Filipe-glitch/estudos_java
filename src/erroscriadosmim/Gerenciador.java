package erroscriadosmim;

public class Gerenciador {
	public Usuario buscar(String usuarioID) throws UsuarioInexistenteException {
       if (usuarioID.equals("123456")) {
          return new Usuario();
        } 
       else {
            throw new UsuarioInexistenteException("Nao existe usuario " + usuarioID);
       }
	}
}

