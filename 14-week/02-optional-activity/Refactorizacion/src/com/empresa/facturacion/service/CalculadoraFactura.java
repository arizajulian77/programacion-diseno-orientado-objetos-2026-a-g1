package com.empresa.facturacion.service;

import com.empresa.facturacion.model.TipoCliente;

public class CalculadoraFactura {

    private static final double DESCUENTO_VIP = 0.20;
    private static final double DESCUENTO_FRECUENTE = 0.10;
    private static final double DESCUENTO_NORMAL = 0.05;
    private static final double IVA = 0.19;

    public double calcularTotal(double subtotal,
                                boolean aplicarDescuento,
                                boolean aplicarIVA,
                                TipoCliente tipoCliente) {

        if (subtotal <= 0) {
            return 0;
        }

        double total = subtotal;

        if (aplicarDescuento) {
            total = aplicarDescuento(total, tipoCliente);
        }

        if (aplicarIVA) {
            total = aplicarIVA(total);
        }

        return redondear(total);
    }

    private double aplicarDescuento(double total,
                                    TipoCliente tipoCliente) {

        switch (tipoCliente) {

            case VIP:
                return total - (total * DESCUENTO_VIP);

            case FRECUENTE:
                return total - (total * DESCUENTO_FRECUENTE);

            default:
                return total - (total * DESCUENTO_NORMAL);
        }
    }

    private double aplicarIVA(double total) {
        return total + (total * IVA);
    }

    private double redondear(double total) {
        return Math.round(total * 100.0) / 100.0;
    }
}