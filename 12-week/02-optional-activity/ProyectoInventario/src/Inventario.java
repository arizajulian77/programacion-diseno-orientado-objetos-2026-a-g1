import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Producto> productos;
    private Map<String, Integer> cantidades;

    public Inventario() {
        productos = new HashMap<>();
        cantidades = new HashMap<>();
    }

    public void agregarProducto(Producto p) {

        if (productos.containsKey(p.getCodigo())) {
            System.out.println("Error: el código ya existe.");
            return;
        }

        productos.put(p.getCodigo(), p);
        cantidades.put(p.getCodigo(), 0);

        System.out.println("Producto agregado correctamente.");
    }

    public void entrada(String codigo, int cantidad) {

        if (!productos.containsKey(codigo)) {
            System.out.println("Error: producto no encontrado.");
            return;
        }

        cantidades.put(codigo, cantidades.get(codigo) + cantidad);

        System.out.println("Entrada registrada.");
    }

    public void salida(String codigo, int cantidad) {

        if (!productos.containsKey(codigo)) {
            System.out.println("Error: producto no encontrado.");
            return;
        }

        int stockActual = cantidades.get(codigo);

        if (stockActual < cantidad) {
            System.out.println("Error: stock insuficiente.");
            return;
        }

        cantidades.put(codigo, stockActual - cantidad);

        System.out.println("Salida registrada.");
    }

    public void buscar(String codigo) {

        if (!productos.containsKey(codigo)) {
            System.out.println("Producto no encontrado.");
            return;
        }

        Producto p = productos.get(codigo);

        System.out.println(p);
        System.out.println("Stock: " + cantidades.get(codigo));
    }

    public void listar() {

        System.out.println("\n===== INVENTARIO =====");

        for (String codigo : productos.keySet()) {

            Producto p = productos.get(codigo);

            System.out.println(p);
            System.out.println("Stock: " + cantidades.get(codigo));
            System.out.println("----------------------");
        }
    }
}