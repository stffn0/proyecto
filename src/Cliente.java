public class Cliente extends Usuario {

    public Cliente(int id, String contraseña, String nombre, String apellido, String telefono, String email) {
        super(id, contraseña, "Cliente", nombre, apellido, telefono, email); // Llamamos al constructor de la clase base Usuario
    }

    @Override
    public String toString() {
        return "Cliente ID: " + getId() + "\nNombre: " + getNombre() + " " + getApellido() + "\nTeléfono: " + getTelefono() + "\nEmail: " + getEmail();
    }
}