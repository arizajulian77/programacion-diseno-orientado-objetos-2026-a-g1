class TallerEstructurasDatos {

    // Clase para representar un ejemplo de aplicación
    static class Aplicacion {
        String nombre;
        String[] tiposDeDatos;
        String[] organizacion;

        public Aplicacion(String nombre, String[] tiposDeDatos, String[] organizacion) {
            this.nombre = nombre;
            this.tiposDeDatos = tiposDeDatos;
            this.organizacion = organizacion;
        }

        public void mostrarInfo() {
            System.out.println("Aplicación: " + nombre);
            System.out.println("Datos que maneja:");
            for (String dato : tiposDeDatos) {
                System.out.println(" - " + dato);
            }
            System.out.println("Organización posible:");
            for (String org : organizacion) {
                System.out.println(" - " + org);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplo 1: WhatsApp
        Aplicacion whatsapp = new Aplicacion(
                "WhatsApp",
                new String[]{"Mensajes", "Contactos", "Chats/Grupos"},
                new String[]{"Lista enlazada para mensajes", "Tabla hash para contactos", "Lista para chats"}
        );

        // Ejemplo 2: Mercado Libre
        Aplicacion mercadoLibre = new Aplicacion(
                "Mercado Libre",
                new String[]{"Productos", "Usuarios", "Pedidos"},
                new String[]{"Array para productos", "Base de datos relacional para usuarios", "Cola para pedidos"}
        );

        // Ejemplo 3: Netflix
        Aplicacion netflix = new Aplicacion(
                "Netflix",
                new String[]{"Películas/Series", "Usuarios", "Recomendaciones"},
                new String[]{"Árbol de categorías para películas", "Tabla para usuarios", "Grafo para recomendaciones"}
        );

        // Mostrar información de cada aplicación
        whatsapp.mostrarInfo();
        mercadoLibre.mostrarInfo();
        netflix.mostrarInfo();
    }
}
