import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ArchivoProductos {

    private static final String RUTA = "data/productos.csv";

    public static List<Producto> cargar() {
        List<Producto> lista = new ArrayList<>();

        try {
            Path path = Paths.get(RUTA);

            if (!Files.exists(path)) {
                return lista;
            }

            List<String> lineas = Files.readAllLines(path);

            for (String linea : lineas) {
                if (!linea.trim().isEmpty()) {
                    lista.add(Producto.fromCSV(linea));
                }
            }

        } catch (IOException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }

        return lista;
    }

    public static void guardar(List<Producto> lista) {
        try {
            Path path = Paths.get(RUTA);

            Files.createDirectories(path.getParent());

            BufferedWriter writer = Files.newBufferedWriter(
                    path,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

            for (Producto p : lista) {
                writer.write(p.toCSV());
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}