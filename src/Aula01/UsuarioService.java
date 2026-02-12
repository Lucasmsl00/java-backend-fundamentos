import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    
    private List<Usuario> usuarios;

    public UsuarioService() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        if (usuario == null) {
            return;
        }

        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario usuario : usuarios) {
            usuario.exibirDados();
            System.out.println("\n------------------------");
        }
    }

    public Usuario buscaPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }


    public boolean existeUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
