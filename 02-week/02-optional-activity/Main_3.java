class CuentaBancaria {
    private String numero;
    private double saldo;

    public CuentaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a 0.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito realizado: $" + monto);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro realizado: $" + monto);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una cuenta con datos iniciales
        CuentaBancaria cuenta1 = new CuentaBancaria("123-456", 5000);

        System.out.println("Cuenta creada: " + cuenta1.getNumero());
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        // Realizar operaciones
        cuenta1.depositar(2000);   // Depositar dinero
        cuenta1.retirar(1500);     // Retirar dinero
        cuenta1.retirar(7000);     // Intentar retirar más de lo que hay

        // Mostrar saldo final
        System.out.println("Saldo final: $" + cuenta1.getSaldo());
    }
}
