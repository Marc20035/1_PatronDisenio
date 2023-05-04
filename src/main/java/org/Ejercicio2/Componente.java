package org.Ejercicio2;

public abstract class Componente {
    protected String fabricante;
    protected String modelo;
    protected double precio;

    public Componente(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
