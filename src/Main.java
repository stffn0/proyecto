
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Root
        Root restaurante = new Root();

        // Crear platos y agregarlos al menú
        restaurante.crearPlato("Papa con Huevo", "Solamente es papa con huevo", 12.99);
        restaurante.crearPlato("Choclo con queso", "jaaaaa", 15.99);

        // Crear un cliente, un mesero y un chef
        Cliente cliente = new Cliente(1, "claveCliente", "Juan", "Pérez", "555-555-5555", "juan@example.com");
        Mesero mesero = new Mesero(2, "claveMesero", "María", "González", "333-333-333", "mesero@example.com");
        Chef chef = new Chef(3, "claveChef", "Carlos", "López", "444-444-4444", "carlos@example.com");

        // Realizar acciones como tomar una orden, agregar plato a una orden, procesar una orden, etc.
        mesero.tomarOrden(1, 4);  // El mesero toma una orden para la mesa 4
        mesero.agregarPlatoAOrden(1, restaurante.consultarPlato("Papa con Huevo"));
        chef.verTodasLasOrdenes(mesero.getOrdenes());  // El chef ve todas las órdenes

        // Imprimir resultados o mensajes
        System.out.println(cliente);
        System.out.println("Nombre del mesero que lo atendio: " +mesero.getNombre());
        System.out.println("Nombre del chef que lo atendio: "+chef.getNombre());
    }
}
