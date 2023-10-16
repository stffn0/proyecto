public class Usuario {
    private int id;
    private String contraseña;
    private String tipoDeUsuario;
    private String nombre;
    private String apellido;
    private String telefono; //Por conveniencia String 
    private String email;

    public Usuario(int id, String contraseña, String tipoDeUsuario, String nombre, String apellido, String telefono, String email) {
        this.id = id;
        this.contraseña = contraseña;
        this.tipoDeUsuario = tipoDeUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Cliente ID: " + getId() + "\nNombre: " + getNombre() + " " + getApellido() + "\nTeléfono: " + getTelefono() + "\nEmail: " + getEmail();
    }

    // Métodos getter para acceder a los atributos

    public int getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }


    // Métodos setter para modificar los atributos

    public void setId(int id) {
        this.id = id;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
