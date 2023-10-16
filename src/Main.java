public class Main {
    public static void main(String[] args) {
        new Conexion();
        // Crear una instancia de Root
        Root restaurante = new Root();

        // Crear platos y agregarlos al menú
        restaurante.crearPlato("Hamburguesa", "Hamburguesa con carne y queso", 9.99);
        restaurante.crearPlato("Pizza", "Pizza de pepperoni", 11.99);
        restaurante.crearPlato("Ensalada", "Ensalada fresca", 6.99);

        // Crear clientes, meseros y chef
        Cliente cliente1 = new Cliente(1, "claveCliente1", "Juan", "Pérez", "555-555-5555", "juan@example.com");
        Cliente cliente2 = new Cliente(2, "claveCliente2", "Ana", "González", "444-444-4444", "ana@example.com");
        Mesero mesero1 = new Mesero(3, "claveMesero1", "María", "López","666-666-666","maria@example.com");
        Chef chef1 = new Chef(4, "claveChef1", "Carlos", "Ramírez", "333-333-3333", "carlos@example.com");

        // Realizar acciones en el restaurante
        mesero1.tomarOrden(1, 4);  // El mesero 1 toma una orden para la mesa 4
        mesero1.agregarPlatoAOrden(1, restaurante.consultarPlato("Hamburguesa"));
        mesero1.agregarPlatoAOrden(1, restaurante.consultarPlato("Pizza"));
        mesero1.procesarOrden(1);  // El mesero 1 marca la orden como procesada

        chef1.verTodasLasOrdenes(mesero1.getOrdenes());  // El chef 1 ve todas las órdenes

        // Mostrar información
        System.out.println("Información del Cliente 1:");
        System.out.println(cliente1);
        
        System.out.println("\nInformación del Cliente 2:");
        System.out.println(cliente2);

        System.out.println("\nInformación del Mesero 1:");
        System.out.println(mesero1);

        System.out.println("\nInformación del Chef 1:");
        System.out.println(chef1);

        System.out.println("\nMenú del Restaurante:");
        for (Plato plato : restaurante.getMenu()) {
            System.out.println(plato);
            System.out.println("------------------------------");
        }
    }
}
