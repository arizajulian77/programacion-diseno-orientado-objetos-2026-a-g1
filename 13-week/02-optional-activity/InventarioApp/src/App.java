import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Producto> productos = ArchivoProductos.cargar();

        System.out.println("=== ANTES ===");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("\nNuevo producto");

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        productos.add(new Producto(codigo, nombre, precio));

        ArchivoProductos.guardar(productos);

        System.out.println("\n=== DESPUÉS ===");
        for (Producto p : productos) {
            System.out.println(p);
        }

        sc.close();
    }
}