public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public String toCSV() {
        return codigo + "," + nombre + "," + precio;
    }

    public static Producto fromCSV(String linea) {
        String[] partes = linea.split(",");
        return new Producto(partes[0], partes[1], Double.parseDouble(partes[2]));
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - $" + precio;
    }
}