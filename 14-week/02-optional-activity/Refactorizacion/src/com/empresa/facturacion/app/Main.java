package com.empresa.facturacion.app;

import com.empresa.facturacion.model.TipoCliente;
import com.empresa.facturacion.service.CalculadoraFactura;

public class Main {

    public static void main(String[] args) {

        double subtotal = 500000;
        boolean aplicarDescuento = true;
        boolean aplicarIVA = true;

        TipoCliente tipoCliente = TipoCliente.VIP;

        CalculadoraFactura calculadora = new CalculadoraFactura();

        double total = calculadora.calcularTotal(
                subtotal,
                aplicarDescuento,
                aplicarIVA,
                tipoCliente
        );

        System.out.println("Total: " + total);
    }
}