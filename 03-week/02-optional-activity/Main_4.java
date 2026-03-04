class Persona {
    // Atributos
    private String numeroDocumento; // privado
    public String nombre;           // público
    protected int edad;             // protegido
    protected double peso;          // protegido
    protected double estatura;      // protegido
    protected String genero;        // protegido

    // Constructor
    public Persona(String numeroDocumento, String nombre, int edad, double peso, double estatura, String genero) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.genero = genero;
    }

    // Métodos
    public void Caminar() {
        System.out.println(nombre + " está caminando en el parque.");
    }

    public void Comer() {
        System.out.println(nombre + " está comiendo pizza.");
    }

    public int Dormir() {
        return 8; // valor fijo como ejemplo
    }

    public void Escuchar() {
        System.out.println(nombre + " está escuchando música en youtube.");
    }

    // Método para mostrar información completa
    public void mostrarInfo() {
        System.out.println("Documento: " + numeroDocumento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Género: " + genero);
        System.out.println("---------------------------");
    }

    // Main para probar
    public static void main(String[] args) {
        // Crear objetos con datos aleatorios
        Persona p1 = new Persona("1001", "Carlos Ramírez", 25, 70.5, 1.75, "Masculino");
        Persona p2 = new Persona("1002", "Lucía Fernández", 30, 60.2, 1.65, "Femenino");
        Persona p3 = new Persona("1003", "Miguel Torres", 40, 82.0, 1.80, "Masculino");

        // Mostrar información
        p1.mostrarInfo();
        p1.Caminar();
        p1.Comer();
        p1.Escuchar();
        System.out.println(p1.nombre + " duerme " + p1.Dormir() + " horas.\n");

        p2.mostrarInfo();
        p2.Caminar();
        p2.Comer();
        p2.Escuchar();
        System.out.println(p2.nombre + " duerme " + p2.Dormir() + " horas.\n");

        p3.mostrarInfo();
        p3.Caminar();
        p3.Comer();
        p3.Escuchar();
        System.out.println(p3.nombre + " duerme " + p3.Dormir() + " horas.\n");
    }
}
