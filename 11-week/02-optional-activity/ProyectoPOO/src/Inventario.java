import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {

        for (Producto producto : productos) {

            if (producto.getCodigo().equalsIgnoreCase(p.getCodigo())) {
                throw new ProductoDuplicadoException(
                        "Ya existe un producto con código: " + p.getCodigo()
                );
            }
        }

        productos.add(p);
        System.out.println("Producto agregado correctamente.");
    }

    public void listar() {

        System.out.println("\n LISTA DE PRODUCTOS ");

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}