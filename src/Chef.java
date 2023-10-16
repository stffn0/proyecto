import java.util.List;

public class Chef extends Usuario {
    public Chef(int id, String contraseña, String nombre, String apellido, String telefono, String email) {
        super(id, contraseña, "Chef", nombre, apellido, telefono, email);
    }

    // Método para ver todas las órdenes
    public void verTodasLasOrdenes(List<Orden> ordenes) {
        for (Orden orden : ordenes) {
            System.out.println("Orden ID: " + orden.getId());
            System.out.println("Número de Mesa: " + orden.getNumeroMesa());
            System.out.println("Estado: " + orden.getEstado());
            System.out.println("ID del Mesero: " + orden.getIdMesero());
            System.out.println();
        }
    }

    // Método para ver una orden específica por su ID
    public void verOrdenEspecifica(List<Orden> ordenes, int idOrden) {
        for (Orden orden : ordenes) {
            if (orden.getId() == idOrden) {
                System.out.println("Orden ID: " + orden.getId());
                System.out.println("Número de Mesa: " + orden.getNumeroMesa());
                System.out.println("Estado: " + orden.getEstado());
                System.out.println("ID del Mesero: " + orden.getIdMesero());
                return;
            }
        }
        System.out.println("La orden con ID " + idOrden + " no fue encontrada.");
    }
}
