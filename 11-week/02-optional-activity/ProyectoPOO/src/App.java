public class App {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        try {

            Producto p1 = new Producto("A01", "Jabon Liquido", 12000);
            inventario.agregarProducto(p1);

            Producto p2 = new Producto("A02", "Desinfectante", 8000);
            inventario.agregarProducto(p2);

            
            Producto p3 = new Producto("A01", "Cloro", 10000);
            inventario.agregarProducto(p3);

        } catch (IllegalArgumentException e) {

            System.out.println("Error de validación: " + e.getMessage());

        } catch (ProductoDuplicadoException e) {

            System.out.println("Error de negocio: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error inesperado: " + e.getMessage());
        }

        
        inventario.listar();
    }
}


