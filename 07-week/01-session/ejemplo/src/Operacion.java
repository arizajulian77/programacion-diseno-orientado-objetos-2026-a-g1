public class Operacion {
    Double numero1;
    Double numero2;
    Double resultado;

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero1() {
        return this.numero1;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getNumero2() {
        return this.numero2;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    public Double getResultado() {
        return this.resultado;
    }

    public Double sumar(){
        this.resultado = this.numero1 + this.numero2;
        return this.resultado;
    }

    public Double multiplicar(){
        this.resultado = this.numero1 * this.numero2;
        return this.resultado;
    }

    public Double resta(){
        this.resultado = this.numero1 - this.numero2;
        return this.resultado;
    }
}
