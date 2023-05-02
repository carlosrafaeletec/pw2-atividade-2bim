public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario();

        novoUsuario.setCodigo(1);
        novoUsuario.setNome("horacio.augusto");

        novoUsuario.exibirDados();

        novoUsuario.inativar();

        System.out.println(novoUsuario.autenticar("123"));

        System.out.println(novoUsuario.autenticar("769"));

        System.out.println(novoUsuario.autenticar("433"));

        novoUsuario.exibirDados();


    }
}
