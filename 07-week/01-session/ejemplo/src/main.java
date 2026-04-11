public class main{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Operacion operacion = new Operacion();
        operacion.setNumero1(2.0);
        operacion.setNumero2(12.0);

        System.out.println(operacion.getNumero1()+" + "+operacion.getNumero2()+" = "+operacion.sumar());
        System.out.println(operacion.getNumero1()+" - "+operacion.getNumero2()+" = "+operacion.resta());
        System.out.println(operacion.getNumero1()+" * "+operacion.getNumero2()+" = "+operacion.multiplicar());
    }
}