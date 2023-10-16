import java.util.ArrayList;
import java.util.List;

public class Mesero extends Usuario {
    private List<Orden> ordenes;

    public Mesero(int id, String contraseña, String tipoDeUsuario, String nombre, String apellido, String telefono, String email) {
        super(id, contraseña, "Mesero", nombre, apellido, telefono, email);
        this.ordenes = new ArrayList<>();
    }

    // Métodos específicos para Mesero, como tomar orden, agregar plato a la orden, procesar orden

    public void tomarOrden(int idOrden, int numeroMesa) {
        Orden nuevaOrden = new Orden(idOrden, numeroMesa, getId(), "pendiente");
        ordenes.add(nuevaOrden);
    }

    public void agregarPlatoAOrden(int idOrden, Plato plato) {
        for (Orden orden : ordenes) {
            if (orden.getId() == idOrden && "pendiente".equals(orden.getEstado())) {
                // Aquí podrías agregar el plato a la orden
                // Por ejemplo, podrías tener una lista de platos en la clase Orden
                // y agregar el plato a esa lista.
                // orden.agregarPlato(plato);
                return;
            }
        }
    }

    public void procesarOrden(int idOrden) {
        for (Orden orden : ordenes) {
            if (orden.getId() == idOrden && "pendiente".equals(orden.getEstado())) {
                orden.setEstado("servida");
                return;
            }
        }
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }
}
