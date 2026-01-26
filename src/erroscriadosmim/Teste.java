package erroscriadosmim;

public class Teste {

	public static void main(String[] args) {
		Gerenciador gerenciador = new Gerenciador();

        try {
            Usuario usuario = gerenciador.buscar("0000001");
            System.out.println("Usuário encontrado: " + usuario.getId());
        } 
        catch (UsuarioInexistenteException e) {
            System.err.println(e.getMessage());
        }
    }
}
