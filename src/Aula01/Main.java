public class Main {
    
    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();

        Usuario usuario1 = new Usuario(1, "Lucas", "lucas@gmail.com");
        Usuario usuario2 = new Usuario(2, "Luan", "luan@gmail.com");


        usuarioService.adicionarUsuario(usuario1);
        usuarioService.adicionarUsuario(usuario2);

        usuarioService.listarUsuarios();



        System.out.println("Buscando usuário por ID 1...");

        boolean existe = usuarioService.existeUsuario(1);

        if (existe) {
            System.out.println("O usuário existe no sistema.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
