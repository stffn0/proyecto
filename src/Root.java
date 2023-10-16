import java.util.ArrayList;
import java.util.List;

public class Root {
    //Una lista de usuarios
    private List<Usuario> usuarios;

    public Root() {
        usuarios = new ArrayList<>();
    }

    // Método para crear un nuevo usuario
    public void crearUsuario(int id, String contraseña, String tipoDeUsuario, String nombre, String apellido, String telefono, String email) {
        Usuario nuevoUsuario = new Usuario(id, contraseña, tipoDeUsuario, nombre, apellido, telefono, email);
        usuarios.add(nuevoUsuario);
    }

    // Método para editar un usuario existente
    public void editarUsuario(int id, String nuevaContraseña, String nuevoTipoDeUsuario, String nuevoNombre, String nuevoApellido, String nuevoTelefono, String nuevoEmail) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setContraseña(nuevaContraseña);
                usuario.setTipoDeUsuario(nuevoTipoDeUsuario);
                usuario.setNombre(nuevoNombre);
                usuario.setApellido(nuevoApellido);
                usuario.setTelefono(nuevoTelefono);
                usuario.setEmail(nuevoEmail);
                break; // Una vez que se encuentra y edita el usuario, se sale del bucle.
            }
        }
    }

    // Método para consultar un usuario por ID
    public Usuario consultarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }

    // Método para eliminar un usuario por ID
    public void eliminarUsuario(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
