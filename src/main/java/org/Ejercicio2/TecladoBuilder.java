package org.Ejercicio2;

import java.util.List;

public class TecladoBuilder {
    private String fabricante;
    private String modelo;
    private double precio;

    public TecladoBuilder setFabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public TecladoBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public TecladoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public Teclado build() {
        return new Teclado(fabricante, modelo, precio, "USB", List.of(2));
    }
}