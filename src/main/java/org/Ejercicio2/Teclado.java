package org.Ejercicio2;

import java.util.List;

public class Teclado extends Componente {
    private String tipoConector;
    private List<Integer> puertosValidos;

    public Teclado(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio);
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
    }

    // Getters y Setters
    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(List<Integer> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}

