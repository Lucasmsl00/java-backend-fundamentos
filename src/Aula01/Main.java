public class Main {
    
    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();

        Usuario usuario1 = new Usuario(1, "Lucas", "lucas@gmail.com");
        Usuario usuario2 = new Usuario(2, "Luan", "luan@gmail.com");


        usuarioService.adicionarUsuario(usuario1);
        usuarioService.adicionarUsuario(usuario2);

        usuarioService.listarUsuarios();

        System.out.println("Removendo usuário com ID 1...");

        boolean removido = usuarioService.removerUsuario(1);

        if (removido) {
            System.out.println("Usuário removido com sucesso.");
        } else {
            System.out.println("Usuário não encontrado para remoção.");
        }

        System.out.println("\nAdicionando usuário com ID 3");
        Usuario usuario3 = new Usuario(3, "Maria", "maria@gmail.com");
        usuarioService.adicionarUsuario(usuario3);

        System.out.println("\nLista Atualizada:\n");
        usuarioService.listarUsuarios();

        System.out.printf("\nTotal de usuários: %s", usuarioService.totalUsuarios());
    }
}
