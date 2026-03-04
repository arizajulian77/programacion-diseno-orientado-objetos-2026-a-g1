class App {

    // Clase Producto
    static class Producto {
        private final String codigo;
        private final String nombre;
        private final double precio;

        // Constructor
        public Producto(String codigo, String nombre, double precio) {
            if (precio <= 0) {
                throw new IllegalArgumentException("El precio debe ser mayor a 0");
            }
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        // Método para mostrar información
        public void mostrarInfo() {
            System.out.println("Código: " + codigo + 
                               " | Nombre: " + nombre + 
                               " | Precio: $" + precio);
        }
    }

    // Método main CORREGIDO
    public static void main(String[] args) {

        // Crear arreglo de productos con datos ya cargados
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("P-01", "rosca", 1000);
        productos[1] = new Producto("P-02", "arroz", 3000);
        productos[2] = new Producto("P-03", "panela", 10000);
        productos[3] = new Producto("P-04", "frijol", 4500);
        productos[4] = new Producto("P-05", "maiz", 5000);

        // Mostrar listado de productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}