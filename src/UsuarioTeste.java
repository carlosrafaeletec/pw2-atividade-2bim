public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario();

        novoUsuario.setCodigo(1);
        novoUsuario.setNome("horacio.augusto");

        novoUsuario.exibirDados();

        novoUsuario.inativar();

        novoUsuario.exibirDados();


    }
}
