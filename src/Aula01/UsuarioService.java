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
            System.out.printf("ID: %s", usuario.getId());
            System.out.printf("\nNome: %s", usuario.getNome());
            System.out.printf("\nEmail: %s", usuario.getEmail());
            System.out.println("\n------------------------");
        }
    }

    public boolean existeUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public boolean removerUsuario(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public int totalUsuarios() {
        return usuarios.size();
    }
    
    public boolean atualizarEmail(int id, String novoEmail) {

        Usuario busca = buscaPorId(id);

        if (busca == null) {
            return false;
        }

        busca.setEmail(novoEmail);
        return true;
        
    }
    
    public boolean atualizarNome(int id, String novoNome) {
        
        Usuario busca = buscaPorId(id);

        if (busca == null) {
            return false;
        }

        busca.setNome(novoNome);
        return true;
    }

    public Usuario buscaPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
    
        return null;
    }
}
