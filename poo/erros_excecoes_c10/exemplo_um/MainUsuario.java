package poo.erros_excecoes_c10.exemplo_um;

public class MainUsuario {

    public static void main(String[] args) {
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();

        try {
            Usuario usuario = gerenciador.buscar("0000001");
            System.out.println("Usuário encontrado: " + usuario.getId());
        } 
        catch (UsuarioInexistenteException e) {
            System.err.println("Erro de Busca: " + e.getMessage());
        }
    }
}
