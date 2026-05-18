public class App {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto p1 = new Producto("A01", "Jabón Líquido", 15000);
        Producto p2 = new Producto("A02", "Desinfectante", 22000);
        Producto p3 = new Producto("A03", "Cloro", 18000);
        Producto p4 = new Producto("A04", "Detergente", 25000);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        inventario.entrada("A01", 20);
        inventario.entrada("A02", 15);
        inventario.entrada("A03", 10);
        inventario.entrada("A04", 8);

        inventario.salida("A01", 5);
        inventario.salida("A03", 2);

        inventario.buscar("A02");

        inventario.listar();
    }
}