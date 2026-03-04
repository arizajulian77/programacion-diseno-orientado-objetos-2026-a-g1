 class Product {
    private String Code;
    private String Name;
    private Double Price;

    public String getCode() {
        return this.Code;
    }

    public void setCode(String CodeInput) {
        this.Code = CodeInput;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void ImprimirDatos() {
        System.out.println("Código: " + this.Code);
        System.out.println("Nombre: " + this.Name);
        System.out.println("Precio: $" + this.Price);
        System.out.println("---------------------------");
    }

    // Método main para probar la clase con datos
    public static void main(String[] args) {
        // Crear productos con datos diferentes
        Product p1 = new Product();
        p1.setCode("P-101");
        p1.setName("Pc HP");
        p1.setPrice(4500000.0);

        Product p2 = new Product();
        p2.setCode("P-102");
        p2.setName("Ipad");
        p2.setPrice(2800000.0);

        Product p3 = new Product();
        p3.setCode("P-103");
        p3.setName("Relog");
        p3.setPrice(350000.0);

        // Imprimir datos de cada producto
        p1.ImprimirDatos();
        p2.ImprimirDatos();
        p3.ImprimirDatos();
    }
}
