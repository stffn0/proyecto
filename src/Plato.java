public class Plato {
    private String nombre;
    private String descripcion;
    private double precio;
    private String[] ingredientes;

    public Plato(String nombre, String descripcion, double precio, String[] ingredientes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Plato: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: $" + precio + "\nIngredientes: " + String.join(", ", ingredientes);
    }
}
